package cn.darkal.networkdiagnosis.service;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import cn.darkal.networkdiagnosis.Utils.ClassN;
import cn.darkal.networkdiagnosis.Utils.NodeUtil;
import cn.darkal.networkdiagnosis.Utils.PlamID;
import cn.darkal.networkdiagnosis.Utils.SysUtils;


/**
 * 采集数据核心类
 */
public class MyAccessibilityService extends AccessibilityService {
    public static boolean state = false;



    @Override
    public void onCreate() {
        super.onCreate();
    }

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        state = true;
        AccessibilityNodeInfo scrollview = NodeUtil.findNodeByIdAndClassName(getRootInActiveWindow(), PlamID.scrollviewid, ClassN.HorizontalScrollView);
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

        //SysUtils.getInstanse().topGestureClick(getApplicationContext(),this,true);

    }

    @Override
    public void onInterrupt() {
        state = false;
    }



}
