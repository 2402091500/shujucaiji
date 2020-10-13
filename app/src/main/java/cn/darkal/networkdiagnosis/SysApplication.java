package cn.darkal.networkdiagnosis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.multidex.MultiDexApplication;
import android.util.Log;

import com.squareup.leakcanary.LeakCanary;
import com.tencent.bugly.Bugly;
import net.gotev.uploadservice.UploadService;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.proxy.CaptureType;
import net.lightbody.bmp.proxy.dns.AdvancedHostResolver;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import cn.darkal.networkdiagnosis.Activity.MainActivity;
import cn.darkal.networkdiagnosis.Bean.ResponseFilterRule;
import cn.darkal.networkdiagnosis.Utils.DeviceUtils;
import cn.darkal.networkdiagnosis.Utils.LogcatFileManager;
import cn.darkal.networkdiagnosis.Utils.SharedPreferenceUtils;
import cn.darkal.networkdiagnosis.Utils.SysUtils;

/**
 * Created by xuzhou on 2016/8/10.
 */
public class SysApplication extends MultiDexApplication {
    public static Boolean isInitProxy = false;
    public static int proxyPort = 8888;
    public BrowserMobProxy proxy;
    public List<ResponseFilterRule> ruleList = new ArrayList<>();
    public static SysApplication instans;
    @Override
    public void onCreate() {
        instans=this;
        super.onCreate();
        initProxy();
        closeAndroid10Dialog();
        startLogcatManager();
        SharedPreferenceUtils.putString(this, "select_ua", "1");
        SysUtils.getInstanse().init(this).plintPkgAndCls();
        // Gradle automatically generates proper variable as below.
        UploadService.NAMESPACE = BuildConfig.APPLICATION_ID;
        if (LeakCanary.isInAnalyzerProcess(this)) {//1
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
//        Bugly.init(getApplicationContext(), "db9f598223", false);
    }

    public void initProxy() {
        try {
            FileUtils.forceMkdir(new File(Environment.getExternalStorageDirectory() + "/har"));
//            FileUtils.cleanDirectory(new File(Environment.getExternalStorageDirectory() + "/har"));
//            FileUtils.forceDelete(new File(Environment.getExternalStorageDirectory() + "/test.har"));
        } catch (IOException e) {
            // test.har文件不存在
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                startProxy();

                Intent intent = new Intent();
                intent.setAction("proxyfinished");
                sendBroadcast(intent);
            }
        }).start();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.e("~~~","onTerminate");
                proxy.stop();
            }
        }).start();
    }

    public void startProxy(){
        try {
            proxy = new BrowserMobProxyServer();
            proxy.setTrustAllServers(true);
            proxy.start(8888);
        } catch (Exception e) {
            // 防止8888已被占用
            Random rand = new Random();
            int randNum = rand.nextInt(1000) + 8000;
            proxyPort = randNum;

            proxy = new BrowserMobProxyServer();
            proxy.setTrustAllServers(true);
            proxy.start(randNum);
        }
        Log.e("~~~", proxy.getPort() + "");


        Object object = SharedPreferenceUtils.get(this.getApplicationContext(), "response_filter");
        if (object != null && object instanceof List) {
            ruleList = (List<ResponseFilterRule>) object;
        }

        SharedPreferences shp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        if(shp.getBoolean("enable_filter", false)) {
            Log.e("~~~enable_filter", "");
            initResponseFilter();
        }

        // 设置hosts
        if(shp.getString("system_host", "").length()>0){
            AdvancedHostResolver advancedHostResolver = proxy.getHostNameResolver();
            for (String temp : shp.getString("system_host", "").split("\\n")){
                if(temp.split(" ").length==2) {
                    advancedHostResolver.remapHost(temp.split(" ")[1],temp.split(" ")[0]);
                    Log.e("~~~~remapHost ",temp.split(" ")[1] +" " + temp.split(" ")[0]);
                }
            }
            proxy.setHostNameResolver(advancedHostResolver);
        }

        proxy.enableHarCaptureTypes(CaptureType.REQUEST_HEADERS, CaptureType.REQUEST_COOKIES,
                CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_HEADERS, CaptureType.REQUEST_COOKIES,
                CaptureType.RESPONSE_CONTENT);

        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA)
                .format(new Date(System.currentTimeMillis()));
        proxy.newHar(time);


        isInitProxy = true;
    }

    public void stopProxy(){
        if(proxy!=null){
            proxy.stop();
        }
    }

    private void initResponseFilter(){
        try {
            if(ruleList == null){
                ResponseFilterRule rule = new ResponseFilterRule();
                rule.setUrl("xw.qq.com/index.htm");
                rule.setReplaceRegex("</head>");
                rule.setReplaceContent("<script>alert('修改包测试')</script></head>");

                ruleList = new ArrayList<>();
                ruleList.add(rule);
            }

            DeviceUtils.changeResponseFilter(this,ruleList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //关闭反射系统提醒
    public void closeAndroid10Dialog(){
        try {
            Class aClass = Class.forName("android.content.pm.PackageParser$Package");
            Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread");
            declaredMethod.setAccessible(true);
            Object activityThread = declaredMethod.invoke(null);
            Field mHiddenApiWarningShown = cls.getDeclaredField("mHiddenApiWarningShown");
            mHiddenApiWarningShown.setAccessible(true);
            mHiddenApiWarningShown.setBoolean(activityThread, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void startLogcatManager() {
        String folderPath = null;

        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {// save in SD card first
            folderPath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "BDT-Logcat";
        } else {// If the SD card does not exist, save in the directory of application.

            folderPath = this.getFilesDir().getAbsolutePath() + File.separator + "BDT-Logcat";
        }

        LogcatFileManager.getInstance().start(folderPath);
    }

    private void stopLogcatManager() {

        LogcatFileManager.getInstance().stop();
    }

    @Override
    public void onTrimMemory(int level) {
        stopLogcatManager();
        super.onTrimMemory(level);
    }
}
