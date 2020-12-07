package cn.darkal.networkdiagnosis.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.orhanobut.logger.Logger;

import net.lightbody.bmp.core.har.HarEntry;
import net.lightbody.bmp.core.har.HarLog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.SysApplication;
import cn.darkal.networkdiagnosis.Utils.LogUtil;
import cn.darkal.networkdiagnosis.Utils.SysUtils;
import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.souhu.SouHu;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_Yule;
import rx.Observable;
import rx.Subscriber;

public class DataIntentService extends IntentService {
    StringBuilder str = new StringBuilder();
    HarLog harLog;
    List<HarEntry> harEntryList = new ArrayList<>();

    public DataIntentService() {
        super("DataIntentService");
    }

    @Override
    public void onCreate() {
        Log.i("myIntentService", "onCreate");
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while (true) {

            printData();

        }
    }


    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.i("onStartCommand", "onStartCommand");

        return super.onStartCommand(intent, flags, startId);
    }

    public void printData() {
        try {
            Thread.sleep(4000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (SysApplication.isInitProxy) {
            harLog = ((SysApplication) getApplication()).proxy.getHar().getLog();
            harEntryList.addAll(harLog.getEntries());
            if (harLog.getEntries().isEmpty()) {
                Log.i("@@@@@@@@@@@@", "$$$$$$$$$$$$$$$$没有数据");
            }
            harLog.clearAllEntries();
            for (HarEntry entry : harEntryList
            ) {
                if (entry != null && entry.getResponse() != null && entry.getResponse().getContent() != null) {
                    String urld = entry.getRequest().getUrl();
                    String data = entry.getResponse().getContent().getText();
//                    Log.i("全部数据", data + "@@");
//                    Log.i("全部url", entry.getRequest().getUrl() + "@@@");
//                    SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");

                    if (urld.contains("r.cnews.qq.com")) {
                        TT(entry, urld);
                    }
                    else if (urld.contains("go2yd.com")) {
                        YD(entry);
                    }
                    else if (urld.contains("aweme-eagle.snssdk.com")) {
//                        Log.i("抖音数据", data + "@@");
//                        Log.i("抖音url", entry.getRequest().getUrl() + "@@@");
//                        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");
                        GetDataByTag.getDouyin(entry, "未知");
                    }

                    else if (urld.contains("nine.ifeng.com")) {
                        Log.i("凤凰新闻数据", data + "@@");
                        Log.i("凤凰新闻url", entry.getRequest().getUrl() + "@@@");
                        SysUtils.getInstanse().WriteStringToFile6(entry.getResponse().getContent().getText() + "@@");
//                        GetDataByTag.getDouyin(entry, "未知");phvideo
                        FH(entry);
                    }
                    else if (urld.contains("snssdk.com/api/news/feed")) {
                        Log.i("今日头条 数据", data + "@@");
                        Log.i("今日头条 url", entry.getRequest().getUrl() + "@@@");

                        if(entry!=null
                                &&entry.getResponse()!=null
                                &&entry.getResponse().getContent()!=null
                                &&entry.getResponse().getContent().getText()!=null
                                &&!entry.getResponse().getContent().getText().isEmpty()
                                &&entry.getResponse().getContent().getText().length()>300
//                                &&entry.getResponse().getContent().getText().contains("content")
                        ){
//                        SysUtils.getInstanse().WriteStringToFile6(entry.getResponse().getContent().getText() + "@@");
                        }
                        TD(entry,urld);
//                        GetDataByTag.getDouyin(entry, "未知");
                    }else  if(urld.contains("zhihu.com")){
                        Log.i("知乎 数据", data + "@@");
                        Log.i("知乎 url", entry.getRequest().getUrl() + "@@@");
                        SysUtils.getInstanse().WriteStringToFile6(entry.getResponse().getContent().getText() + "@@");
                        ZH(entry);
                    }else if(urld.contains("sohu.com")){
                        Log.i("搜狐 数据", data + "@@");
                        Log.i("搜狐 url", entry.getRequest().getUrl() + "@@@");
                        SH(entry);
                    }else if(urld.contains("163.com")){
                        Log.i("其他 数据", data + "@@");
                        Log.i("其他 url", entry.getRequest().getUrl() + "@@@");
                        SysUtils.getInstanse().WriteStringToFile6(entry.getResponse().getContent().getText() + "@@");
                        WY(entry);
                    }
                } else {

                    LogUtil.i("TAG", "printData: ############################################");
                }
            }
            harEntryList.clear();
        } else {
            Log.i("TAG", "Proxy not started: ############################################");
        }
    }

    private void TT(HarEntry entry, String urld) {
        if (urld.contains("chlid=kb_news_bagua")) {
            GetDataByTag.getYule(entry, "娱乐");
        }
        //科技
        if (urld.contains("chlid=kb_news_tech")) {
//                        String data = entry.getResponse().getContent().getText();
//                        Log.i("科技数据", data + "@@");
//                        Log.i("科技url", entry.getRequest().getUrl() + "@@@");
//                        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");
            GetDataByTag.getYule(entry, "科技");
        }
        //时代
        if (urld.contains("chlid=kb_news_sjd")) {
            GetDataByTag.getYule(entry, "新时代");
        }
        //汽车
        if (urld.contains("chlid=kb_news_car")) {
            GetDataByTag.getYule(entry, "汽车");
        }
        //动漫
        if (urld.contains("chlid=kb_news_erciyuan")) {
            GetDataByTag.getYule(entry, "动漫");
        }
        //生活
        if (urld.contains("chlid=kb_news_hotshare")) {
            GetDataByTag.getYule(entry, "生活");
        }
        //体育
        if (urld.contains("chlid=kb_news_sports")) {
            GetDataByTag.getYule(entry, "体育");
        }
        //财经
        if (urld.contains("chlid=kb_news_finance")) {
            GetDataByTag.getYule(entry, "财经");
        }
        //逼啊
        if (urld.contains("chlid=kb_news_mil")) {
            GetDataByTag.getYule(entry, "军事");
        }
        //国际
        if (urld.contains("chlid=kb_news_beauty")) {
            GetDataByTag.getYule(entry, "美女");
        }
        //游戏
        if (urld.contains("chlid=kb_news_history")) {
            GetDataByTag.getYule(entry, "历史");
        }
        //数码
        if (urld.contains("chlid=kb_news_nba")) {
            GetDataByTag.getYule(entry, "NBA");
        }
        //情感
        if (urld.contains("chlid=kb_news_world")) {
            GetDataByTag.getYule(entry, "国际");
        }
        //宠物
        if (urld.contains("chlid=kb_news_game")) {
            GetDataByTag.getYule(entry, "游戏");
        }
        //星座
        if (urld.contains("chlid=kb_news_gaojidi")) {
            GetDataByTag.getYule(entry, "数码");
        }
        //育儿
        if (urld.contains("chlid=kb_news_sex")) {
            GetDataByTag.getYule(entry, "情感");
        }

        if (urld.contains("chlid=kb_news_pet")) {
            GetDataByTag.getYule(entry, "宠物");
        }

        if (urld.contains("chlid=kb_news_astro")) {
            GetDataByTag.getYule(entry, "星座");
        }

        if (urld.contains("chlid=kb_news_baby")) {
            GetDataByTag.getYule(entry, "育儿");
        }

        if (urld.contains("chlid=kb_news_travel")) {
            GetDataByTag.getYule(entry, "旅游");
        }

        if (urld.contains("chlid=kb_news_chaobao")) {
            GetDataByTag.getYule(entry, "时尚");
        }

        if (urld.contains("chlid=kb_news_cate")) {
            GetDataByTag.getYule(entry, "美食");
        }
        if (urld.contains("chlid=kb_news_farmer")) {
            GetDataByTag.getYule(entry, "三农");
        }
        if (urld.contains("chlid=kb_news_jiankang")) {
            GetDataByTag.getYule(entry, "健康");
        }
        if (urld.contains("chlid=kb_news_edu")) {
            GetDataByTag.getYule(entry, "教育");
        }
    }


    private void YD(HarEntry entry) {
        GetDataByTag.getYD(entry);
    }
    private void FH(HarEntry entry) {
        GetDataByTag.getFH(entry);

    }
    private void ZH(HarEntry entry) {
        GetDataByTag.getZH(entry);
    }
    private void SH(HarEntry entry) {
        GetDataByTag.getSH(entry);
    }
    private void WY(HarEntry entry) {
        GetDataByTag.getWY(entry);
    }
    private void TD(HarEntry entry,String urld) {
        if (urld.contains("category=video")) {GetDataByTag.getTD(entry, "视频",urld);}
        if (urld.contains("category=news_hot")) {GetDataByTag.getTD(entry, "热点",urld);}
        if (urld.contains("category=news_entertainment")) {GetDataByTag.getTD(entry, "娱乐",urld);}
        if (urld.contains("category=%E7%BB%84%E5%9B%BE")) {GetDataByTag.getTD(entry, "图片",urld);}
        if (urld.contains("category=news_sports")) {GetDataByTag.getTD(entry, "体育",urld);}
        if (urld.contains("category=new_11")) {GetDataByTag.getTD(entry, "要闻",urld);}
        if (urld.contains("category=news_world")) {GetDataByTag.getTD(entry, "国际",urld);}
        if (urld.contains("category=news_health")) {GetDataByTag.getTD(entry, "健康",urld);}
        if (urld.contains("category=news_tech")) {GetDataByTag.getTD(entry, "科技",urld);}
        if (urld.contains("category=news_military")) {GetDataByTag.getTD(entry, "军事",urld);}
        if (urld.contains("category=news_history")) {GetDataByTag.getTD(entry, "历史",urld);}
        if (urld.contains("category=%E6%BC%AB%E7%94%BB")) {GetDataByTag.getTD(entry, "漫画",urld);}
        if (urld.contains("category=digital")) {GetDataByTag.getTD(entry, "数码",urld);}
        if (urld.contains("category=NBA")) {GetDataByTag.getTD(entry, "NBA",urld);}
        if (urld.contains("category=news_game")) {GetDataByTag.getTD(entry, "游戏",urld);}
        if (urld.contains("category=music")) {GetDataByTag.getTD(entry, "音乐",urld);}
        if (urld.contains("category=emotion")) {GetDataByTag.getTD(entry, "情感",urld);}
        if (urld.contains("category=hotsoon_video")) {GetDataByTag.getTD(entry, "小视频",urld);}
        if (urld.contains("category=news_baby")) {GetDataByTag.getTD(entry, "育儿",urld);}
        if (urld.contains("category=news_food")) {GetDataByTag.getTD(entry, "美食",urld);}
        if (urld.contains("category=news_regimen")) {GetDataByTag.getTD(entry, "养生",urld);}
        if (urld.contains("category=news_travel")) {GetDataByTag.getTD(entry, "旅游",urld);}
        if (urld.contains("category=news_home")) {GetDataByTag.getTD(entry, "家居",urld);}
        if (urld.contains("category=news_edu")) {GetDataByTag.getTD(entry, "教育",urld);}
        if (urld.contains("category=news_agriculture")) {GetDataByTag.getTD(entry, "三农",urld);}
        if (urld.contains("category=news_story")) {GetDataByTag.getTD(entry, "故事",urld);}
        if (urld.contains("category=film_tv")) {GetDataByTag.getTD(entry, "影视",urld);}
        if (urld.contains("category=%E5%BD%A9%E7%A5%A8")) {GetDataByTag.getTD(entry, "彩票",urld);}
        if (urld.contains("category=funny")) {GetDataByTag.getTD(entry, "搞笑",urld);}
        if (urld.contains("category=news_astrology")) {GetDataByTag.getTD(entry, "星座",urld);}
    }


    public String jsonFormatter(StringBuilder uglyJSONString) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        if (uglyJSONString == null || !uglyJSONString.toString().startsWith("{")) {
            return "";
        }
        JsonElement je = jp.parse(uglyJSONString.toString());
        return gson.toJson(je);
    }
}
