package cn.darkal.networkdiagnosis.Utils;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
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
import android.view.accessibility.AccessibilityNodeInfo;

import java.io.File;
import java.io.FileOutputStream;
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
}
