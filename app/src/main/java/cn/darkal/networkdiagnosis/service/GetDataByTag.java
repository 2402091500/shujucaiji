package cn.darkal.networkdiagnosis.service;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.lightbody.bmp.core.har.HarEntry;

import java.util.LinkedHashMap;

import cn.darkal.networkdiagnosis.Utils.SysUtils;
import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.PostInfoTopic;
import cn.darkal.networkdiagnosis.modle.PostInfoVido;
import cn.darkal.networkdiagnosis.modle.douyin.DouYin;
import cn.darkal.networkdiagnosis.modle.fenhuan.FenHuan;
import cn.darkal.networkdiagnosis.modle.fenhuan.FenHuanMusic;
import cn.darkal.networkdiagnosis.modle.fenhuan.FenhuanVidio;
import cn.darkal.networkdiagnosis.modle.jinri.TouTiao;
import cn.darkal.networkdiagnosis.modle.jinri.Video;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_KeJi;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_Yule;
import cn.darkal.networkdiagnosis.modle.yidian.KeJi;
import cn.darkal.networkdiagnosis.modle.zhihu.Zhihu;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Subscriber;

public class GetDataByTag {


    public static void getYule(HarEntry entry, final String tag) {
        String data = entry.getResponse().getContent().getText();
        Log.i(tag + "数据", data + "@@");
        Log.i(tag + "url", entry.getRequest().getUrl() + "@@@");
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
                            Log.e(tag + "接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e(tag + "接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

    public static void getYD(HarEntry entry) {
        String data = entry.getResponse().getContent().getText();
        Log.i("一点资讯  数据", data + "@@");
        Log.i("一点资讯 url", entry.getRequest().getUrl() + "@@@");
        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");
//                      Logger.info("@@@@@@@@@@@",entry.getResponse().getContent().getText());
        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200 && data.contains("category") && !data.contains("搞笑")) {

            Gson gosn = new Gson();
            KeJi yule = gosn.fromJson(data, KeJi.class);
            PostInfo postinfo = yule.getdata();
            UpLoadDataService.getInstance().postdata(gosn.toJson(postinfo))
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e("接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

    public static void getFH(HarEntry entry) {
        String data = entry.getResponse().getContent().getText();
        Log.i("凤凰  数据", data + "@@");
        Log.i("凤凰 url", entry.getRequest().getUrl() + "@@@");
        SysUtils.getInstanse().WriteStringToFile6(entry.getResponse().getContent().getText() + "@@");
//                      Logger.info("@@@@@@@@@@@",entry.getResponse().getContent().getText());
        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200 && !data.contains("Hotword")) {

            Gson gosn = new Gson();
            //音乐
            PostInfoVido postinfo;
            RequestBody body;
            data = data.substring(1, data.length() - 1);
            if (data.contains("\"listId\": \"MUSIC\"")) {

                FenHuanMusic yule = gosn.fromJson(data, FenHuanMusic.class);
                postinfo = yule.getdata();
                String json = gosn.toJson(postinfo);
                body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
                postvidio(body);

            } else if (data.contains("\"listId\":\"RECOMVIDEO\"")) {
                FenhuanVidio yule = gosn.fromJson(data, FenhuanVidio.class);
                postinfo = yule.getdata();
                String json = gosn.toJson(postinfo);
                body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
                postvidio(body);
            } else {

                try {
                    FenHuan  yule = gosn.fromJson(data, FenHuan.class);
                    PostInfo postinfo1 = yule.getdata();
                    postdata(gosn.toJson(postinfo1));
                }catch (Exception e){
                    return;
                }
            }


        }

    }

    public static void postvidio(RequestBody body) {
        UpLoadDataService.getInstance().postdatavidio(body)
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("接口数据错误", e.getMessage().toString() + "QQQ");
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e("接口数据错误", s + "QQQ");
                    }
                });
    }

    public static void postdata(String s) {
        UpLoadDataService.getInstance().postdata(s)
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("接口数据错误", e.getMessage().toString() + "QQQ");
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e("接口数据错误", s + "QQQ");
                    }
                });
    }

    public static void getZH(HarEntry entry) {
        String data = entry.getResponse().getContent().getText();
        Log.i("知乎  数据", data + "@@");
        Log.i("知乎 url", entry.getRequest().getUrl() + "@@@");
        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200 && data.contains("question")) {

            Gson gosn = new Gson();
            Zhihu yule = gosn.fromJson(data, Zhihu.class);
            PostInfoTopic postinfo = yule.getdata();
            Log.i("json", gosn.toJson(postinfo));
            String json = gosn.toJson(postinfo);
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
            UpLoadDataService.getInstance().postdatatopic(body)
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e("接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

    public static void getDouyin(HarEntry entry, final String tag) {
        String data = entry.getResponse().getContent().getText();

        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200) {

            Gson gosn = new Gson();
            PostInfo postinfo;
            try {
                DouYin yule = gosn.fromJson(data, DouYin.class);
                postinfo = yule.getdata(tag);

            } catch (Exception e) {
                return;
            }
            UpLoadDataService.getInstance().postdata(gosn.toJson(postinfo))
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(tag + "接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e(tag + "接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

    public static void getTD(HarEntry entry, final String tag, final String urld) {
        String data = entry.getResponse().getContent().getText();
        if (entry.getResponse().getContent().toString().contains("没有新闻返回")) {
            return;
        }
        if (data != null && data.length() > 200) {
            data = data.replace("\\", "");
            data = data.replace("\"{", "{");
            data = data.replace("}\"", "}");
            data = data.replace("href=\"", "");
            data = data.replace("\"u003e#", "");
            Log.i("@@@@@@@", data);
//            SysUtils.getInstanse().WriteStringToFile6(data + "@@");
            Gson gosn = new Gson();
            PostInfo postinfo = null;
//            if(urld.contains("category=video")||urld.contains("category=hotsoon_video")){
            try {

                Video yule = gosn.fromJson(data, Video.class);
                postinfo = yule.getdata(tag);
            } catch (Exception e) {
                return;
            }
//            }else {
//                TouTiao yule = gosn.fromJson(data, TouTiao.class);
//                 postinfo = yule.getdata(tag);
//            }

            UpLoadDataService.getInstance().postdata(gosn.toJson(postinfo))
                    .subscribe(new Subscriber<String>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(tag + "接口数据错误", e.getMessage().toString() + "QQQ");
                        }

                        @Override
                        public void onNext(String s) {
                            Log.e(tag + "接口数据错误", s + "QQQ");
                        }
                    });
        }

    }

}
