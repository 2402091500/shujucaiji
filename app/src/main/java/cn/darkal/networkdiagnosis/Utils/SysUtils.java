package cn.darkal.networkdiagnosis.Utils;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

import cn.darkal.networkdiagnosis.SysApplication;

public class SysUtils {
    public static SysUtils instanse;
    public Context mcontext;
    public static SysUtils getInstanse() {
        if (instanse == null) {
            synchronized (SysUtils.class) {
                if (instanse == null) {
                    instanse = new SysUtils();
                }
            }
        }
        return instanse;

    }
    public SysUtils init(Context context){
        this.mcontext=context;
        return this;
    }

    public void plintPkgAndCls() {
        List<ResolveInfo> resolveInfos=getResolveInfos();
        PackageManager packageManager = mcontext.getPackageManager();

        Log.i("pkg", "####################start######################");
        for (int i = 0; i < resolveInfos.size(); i++) {
            String pkg = resolveInfos.get(i).activityInfo.packageName;
            String cls = resolveInfos.get(i).activityInfo.name;
            String title = null;

            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(pkg, i).applicationInfo;
                title = applicationInfo.loadLabel(packageManager).toString();
            } catch (Exception e) {

            }


            Log.i("pkg", title + "：" + pkg + "/" + cls);
        }
        Log.i("pkg", "#####################end#######################");
    }
    public List<ResolveInfo> getResolveInfos(){
        List<ResolveInfo> appList = null;

        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        PackageManager pm = mcontext.getPackageManager();
        appList = pm.queryIntentActivities(intent, 0);
        Collections.sort(appList, new ResolveInfo.DisplayNameComparator(pm));

        return appList;

    }

    public static void outputThreadName(){
        Log.i("", Thread.currentThread().getName());
    }

    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 从黏贴板获取数据
    private void getPasteString(final Activity activity)
    {
        // 获取并保存粘贴板里的内容
        try {
            activity.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    ClipboardManager clipboard = (ClipboardManager)activity.getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData = clipboard.getPrimaryClip();
                    if (clipData != null && clipData.getItemCount() > 0) {
                        CharSequence text = clipData.getItemAt(0).getText();
                        String pasteString = text.toString();
                        Log.d("TAG", "getFromClipboard text=" + pasteString);
                    }
                }
            });
        } catch (Exception e) {
            Log.e("TAG", "getFromClipboard error");
            e.printStackTrace();
        }
    }

    public void WriteStringToFile5(String s) {
        String filePath = null;

        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {// save in SD card first
            filePath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "BDT-Logcat/logcat-20201008.log";
        } else {// If the SD card does not exist, save in the directory of application.

            filePath = SysApplication.instans.getFilesDir().getAbsolutePath() + File.separator + "BDT-Logcat/logcat-20201008.log";
        }

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(s.getBytes());
            fos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void WriteStringToFile6(String s) {

        long currentTime = System.currentTimeMillis();
        String timeNow = new SimpleDateFormat("MM-dd HH:mm:ss").format(currentTime);

        String sdCardDir = Environment.getExternalStorageDirectory().getAbsolutePath();
        File saveFile = new File(sdCardDir, File.separator + "BDT-Logcat/logcat-"+timeNow+".log");
        FileOutputStream outStream = null;
        try {
            outStream = new FileOutputStream(saveFile);
            outStream.write(s.getBytes());
            outStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void topGestureClick(Context context,AccessibilityService mservice,boolean left) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {

            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();

            int middleYValue = displayMetrics.heightPixels / 2;
            final int leftSideOfScreen = displayMetrics.widthPixels / 4;
            final int rightSizeOfScreen = leftSideOfScreen * 3;
            GestureDescription.Builder gestureBuilder = new GestureDescription.Builder();
            Path path = new Path();

               if(left){

                //Swipe left
                path.moveTo(rightSizeOfScreen, middleYValue);
                path.lineTo(leftSideOfScreen, middleYValue);
               }else {

                //Swipe right
                path.moveTo(leftSideOfScreen, middleYValue);
                path.lineTo(rightSizeOfScreen, middleYValue);
               }



            gestureBuilder.addStroke(new GestureDescription.StrokeDescription(path, 100, 50));
            mservice.dispatchGesture(gestureBuilder.build(), new AccessibilityService.GestureResultCallback() {
                @Override
                public void onCompleted(GestureDescription gestureDescription) {
                    super.onCompleted(gestureDescription);
                }
            }, null);
        }




    }
        public void findanclick(AccessibilityNodeInfo scrollview,String txt){
            SysUtils.sleep(1000l);
            NodeUtil.findNodeByTextAndClick(scrollview,txt);
            SysUtils.sleep(100l);
            NodeUtil.findNodeByTextAndClick(scrollview,txt);
        }
    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
        public void runkuaibao(AccessibilityService mservice){
            AccessibilityNodeInfo scrollview = NodeUtil.findNodeByIdAndClassName(mservice.getRootInActiveWindow(), PlamID.scrollviewid, ClassN.HorizontalScrollView);
            SysUtils.getInstanse().findanclick(scrollview,"娱乐");
            SysUtils.getInstanse().findanclick(scrollview,"科技");
            SysUtils.getInstanse().findanclick(scrollview,"新时代");
            SysUtils.getInstanse().findanclick(scrollview,"汽车");
            SysUtils.getInstanse().findanclick(scrollview,"动漫");
            SysUtils.getInstanse().findanclick(scrollview,"生活");
            SysUtils.getInstanse().findanclick(scrollview,"体育");
            SysUtils.getInstanse().findanclick(scrollview,"财经");


            SysUtils.getInstanse().findanclick(scrollview,"军事");
            SysUtils.getInstanse().findanclick(scrollview,"美女");
            SysUtils.getInstanse().findanclick(scrollview,"历史");
            SysUtils.getInstanse().findanclick(scrollview,"NBA");
            SysUtils.getInstanse().findanclick(scrollview,"国际");
            SysUtils.getInstanse().findanclick(scrollview,"游戏");
            SysUtils.getInstanse().findanclick(scrollview,"数码");
            SysUtils.getInstanse().findanclick(scrollview,"情感");
            SysUtils.getInstanse().findanclick(scrollview,"宠物");
            SysUtils.getInstanse().findanclick(scrollview,"星座");
            SysUtils.getInstanse().findanclick(scrollview,"育儿");
            SysUtils.getInstanse().findanclick(scrollview,"旅游");
            SysUtils.getInstanse().findanclick(scrollview,"时尚");
            SysUtils.getInstanse().findanclick(scrollview,"美食");
            SysUtils.getInstanse().findanclick(scrollview,"三农");
            SysUtils.getInstanse().findanclick(scrollview,"健康");
            SysUtils.getInstanse().findanclick(scrollview,"教育");
        }
    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
        public void runYidian(AccessibilityService mservice){
            AccessibilityNodeInfo scrollview = NodeUtil.findNodeByIdAndClassName(mservice.getRootInActiveWindow(), PlamID.yd_scrollviewid, ClassN.HorizontalScrollView);
            SysUtils.getInstanse().findanclick(scrollview,"互联网");
            SysUtils.getInstanse().findanclick(scrollview,"科学");
            SysUtils.getInstanse().findanclick(scrollview,"时政");
            SysUtils.getInstanse().findanclick(scrollview,"美文");
            SysUtils.getInstanse().findanclick(scrollview,"电商");
            SysUtils.getInstanse().findanclick(scrollview,"IT");
            SysUtils.getInstanse().findanclick(scrollview,"金融");
            SysUtils.getInstanse().findanclick(scrollview,"健康");
            SysUtils.getInstanse().findanclick(scrollview,"美食");
            SysUtils.getInstanse().findanclick(scrollview,"育儿");
            SysUtils.getInstanse().findanclick(scrollview,"摄影");
            SysUtils.getInstanse().findanclick(scrollview,"情感");
            SysUtils.getInstanse().findanclick(scrollview,"农村");
            SysUtils.getInstanse().findanclick(scrollview,"视频");
            SysUtils.getInstanse().findanclick(scrollview,"新时代");
            SysUtils.getInstanse().findanclick(scrollview,"历史");
            SysUtils.getInstanse().findanclick(scrollview,"娱乐");
            SysUtils.getInstanse().findanclick(scrollview,"动物");
            SysUtils.getInstanse().findanclick(scrollview,"军事");
            SysUtils.getInstanse().findanclick(scrollview,"NBA");
            SysUtils.getInstanse().findanclick(scrollview,"体育");
            SysUtils.getInstanse().findanclick(scrollview,"财经");
            SysUtils.getInstanse().findanclick(scrollview,"科技");
            SysUtils.getInstanse().findanclick(scrollview,"民生");
            SysUtils.getInstanse().findanclick(scrollview,"段子");
            SysUtils.getInstanse().findanclick(scrollview,"汽车");
            SysUtils.getInstanse().findanclick(scrollview,"时尚");
            SysUtils.getInstanse().findanclick(scrollview,"明星");
            SysUtils.getInstanse().findanclick(scrollview,"搞笑");

        }
    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
        public void runZhihu(AccessibilityService mservice){
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Path path = new Path();
        path.moveTo(240, 500);
        path.lineTo(240, 1000);
        GestureDescription gestureDescription = builder.addStroke(new GestureDescription.StrokeDescription(path, 20, 500)).build();
    }
        @SuppressLint("NewApi")
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
        public void runTouTiao(AccessibilityService mservice){
            AccessibilityNodeInfo scrollview = NodeUtil.findNodeByIdAndClassName(mservice.getRootInActiveWindow(), PlamID.td_scrollviewid, ClassN.HorizontalScrollView);
            if(scrollview==null){
                Log.i("无障碍服务","今日头条 scrollview 为空");
            }
            SysUtils.getInstanse().findanclick(scrollview,"视频");
            SysUtils.getInstanse().findanclick(scrollview,"热点");
            SysUtils.getInstanse().findanclick(scrollview,"娱乐");
            SysUtils.getInstanse().findanclick(scrollview,"图片");
            SysUtils.getInstanse().findanclick(scrollview,"体育");
            SysUtils.getInstanse().findanclick(scrollview,"要闻");
            SysUtils.getInstanse().findanclick(scrollview,"国际");
            SysUtils.getInstanse().findanclick(scrollview,"健康");
            SysUtils.getInstanse().findanclick(scrollview,"科技");
            SysUtils.getInstanse().findanclick(scrollview,"军事");
            SysUtils.getInstanse().findanclick(scrollview,"历史");
            SysUtils.getInstanse().findanclick(scrollview,"漫画");
            SysUtils.getInstanse().findanclick(scrollview,"数码");
            SysUtils.getInstanse().findanclick(scrollview,"NBA");
            SysUtils.getInstanse().findanclick(scrollview,"游戏");
            SysUtils.getInstanse().findanclick(scrollview,"音乐");
            SysUtils.getInstanse().findanclick(scrollview,"情感");
            SysUtils.getInstanse().findanclick(scrollview,"小视频");
            SysUtils.getInstanse().findanclick(scrollview,"育儿");
            SysUtils.getInstanse().findanclick(scrollview,"美食");
            SysUtils.getInstanse().findanclick(scrollview,"养生");
            SysUtils.getInstanse().findanclick(scrollview,"旅游");
            SysUtils.getInstanse().findanclick(scrollview,"家居");
            SysUtils.getInstanse().findanclick(scrollview,"教育");
            SysUtils.getInstanse().findanclick(scrollview,"三农");
            SysUtils.getInstanse().findanclick(scrollview,"故事");
            SysUtils.getInstanse().findanclick(scrollview,"影视");
            SysUtils.getInstanse().findanclick(scrollview,"彩票");
            SysUtils.getInstanse().findanclick(scrollview,"搞笑");
            SysUtils.getInstanse().findanclick(scrollview,"星座");
            SysUtils.getInstanse().findanclick(scrollview,"财经");
            SysUtils.getInstanse().findanclick(scrollview,"手机");
            SysUtils.getInstanse().findanclick(scrollview,"股票");


        }
    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
        public void rundouying(AccessibilityService mservice){
        SysUtils.sleep(1500l);
        NodeUtil.findNodeByIdTextAndClick(mservice.getRootInActiveWindow(),PlamID.dy_shouyeid,"首页",true);
    }
}
