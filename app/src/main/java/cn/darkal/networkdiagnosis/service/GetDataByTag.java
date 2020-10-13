package cn.darkal.networkdiagnosis.service;

import android.util.Log;

import com.google.gson.Gson;

import net.lightbody.bmp.core.har.HarEntry;

import cn.darkal.networkdiagnosis.Utils.SysUtils;
import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_KeJi;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_Yule;
import cn.darkal.networkdiagnosis.modle.yidian.KeJi;
import rx.Subscriber;

public class GetDataByTag {


    public static void getYule(HarEntry entry, final String tag) {
        String data = entry.getResponse().getContent().getText();
        Log.i(tag+"数据", data + "@@");
        Log.i(tag+"url", entry.getRequest().getUrl() + "@@@");
        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");
//                      Logger.info("@@@@@@@@@@@",entry.getResponse().getContent().getText());
        if (data != null && data.length() > 200) {

            Gson gosn = new Gson();
            TT_Yule yule = gosn.fromJson(data, TT_Yule.class);
            PostInfo postinfo = yule.getdata(tag);
            UpLoadDataService.getInstance().postdata(gosn.toJson(postinfo))
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(tag+"接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e(tag+"接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

    public static void getKeji(HarEntry entry, final String tag) {
        String data = entry.getResponse().getContent().getText();
        Log.i(tag+"数据", data + "@@");
        Log.i(tag+"url", entry.getRequest().getUrl() + "@@@");
        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");
//                      Logger.info("@@@@@@@@@@@",entry.getResponse().getContent().getText());
        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200) {

            Gson gosn = new Gson();
            KeJi yule = gosn.fromJson(data, KeJi.class);
            PostInfo postinfo = yule.getdata(tag);
            UpLoadDataService.getInstance().postdata(gosn.toJson(postinfo))
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(tag+"接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e(tag+"接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

}
