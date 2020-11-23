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
import cn.darkal.networkdiagnosis.Utils.SharedPreferenceUtils;
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
        String packagename = SharedPreferenceUtils.getString(this, "pingtai", URL.kuaibao);
        if (packagename.equals(URL.kuaibao)) {

            SysUtils.getInstanse().runkuaibao(this);
        }
        else if (packagename.equals(URL.douyin)) {

            SysUtils.getInstanse().rundouying(this);
        }
        else if (packagename.equals(URL.yidianzhixun)) {

            SysUtils.getInstanse().runYidian(this);
        }
        else if (packagename.equals(URL.toutiao)) {
            Log.i("无障碍服务","今日头条");
            SysUtils.getInstanse().runTouTiao(this);
        }
        else if (packagename.equals(URL.zhihu)) {
            Log.i("无障碍服务","知乎");
            SysUtils.getInstanse().runZhihu(this);
        }


    }

    @Override
    public void onInterrupt() {
        state = false;
    }


}
