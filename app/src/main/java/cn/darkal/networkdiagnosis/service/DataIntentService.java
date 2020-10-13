package cn.darkal.networkdiagnosis.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import net.gotev.uploadservice.Logger;
import net.lightbody.bmp.core.har.HarEntry;
import net.lightbody.bmp.core.har.HarLog;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.SysApplication;
import cn.darkal.networkdiagnosis.Utils.LogUtil;
import cn.darkal.networkdiagnosis.Utils.SysUtils;
import cn.darkal.networkdiagnosis.modle.PostInfo;
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
                    if (urld.contains("r.cnews.qq.com")) {
                        TT(entry, urld);
                    } else if (urld.contains("go2yd.com")) {
                        YD(entry, urld);
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


    private void YD(HarEntry entry, String urld) {
//                        String data = entry.getResponse().getContent().getText();
//                        Log.i("科技数据", data + "@@");
//                        Log.i("科技url", entry.getRequest().getUrl() + "@@@");
//                        SysUtils.getInstanse().WriteStringToFile5(entry.getResponse().getContent().getText() + "@@");

        if (urld.contains("channel_id=60813409094")) {
            GetDataByTag.getKeji(entry, "互联网");
        }
        if (urld.contains("channel_id=60813409110")) {
            GetDataByTag.getKeji(entry, "科学");
        }
        if (urld.contains("channel_id=60813409126")) {
            GetDataByTag.getKeji(entry, "时政");
        }
        if (urld.contains("channel_id=60813409078")) {
            GetDataByTag.getKeji(entry, "美文");
        }
        if (urld.contains("channel_id=60813409046")) {
            GetDataByTag.getKeji(entry, "电商 ");
        }
        if (urld.contains("channel_id=60813408998")) {
            GetDataByTag.getKeji(entry, "IT");
        }
        if (urld.contains("channel_id=60652002582")) {
            GetDataByTag.getKeji(entry, "金融 ");
        }
        if (urld.contains("channel_id=2712332746")) {
            GetDataByTag.getKeji(entry, "健康 ");
        }
        if (urld.contains("channel_id=60651998774")) {
            GetDataByTag.getKeji(entry, "美食 ");
        }
        if (urld.contains("channel_id=60651998166")) {
            GetDataByTag.getKeji(entry, "育儿 ");
        }
        if (urld.contains("channel_id=60651997286")) {
            GetDataByTag.getKeji(entry, "摄影 ");
        }
        if (urld.contains("channel_id=60651991382")) {
            GetDataByTag.getKeji(entry, "情感 ");
        }
        if (urld.contains("channel_id=60651991206")) {
            GetDataByTag.getKeji(entry, "农村 ");
        }
        if (urld.contains("channel_id=60651988694")) {
            GetDataByTag.getKeji(entry, "视频 ");
        }
        if (urld.contains("channel_id=60651988278")) {
            GetDataByTag.getKeji(entry, "新时代");
        }
        if (urld.contains("channel_id=60651990166")) {
            GetDataByTag.getKeji(entry, "历史 ");
        }
        if (urld.contains("channel_id=2712332710")) {
            GetDataByTag.getKeji(entry, "娱乐 ");
        }
        if (urld.contains("channel_id=60652001638")) {
            GetDataByTag.getKeji(entry, "动物 ");
        }
        if (urld.contains("channel_id=2712332714")) {
            GetDataByTag.getKeji(entry, "军事 ");
        }
        if (urld.contains("channel_id=2712332714")) {
            GetDataByTag.getKeji(entry, "NBA");
        }
        if (urld.contains("channel_id=2712332718")) {
            GetDataByTag.getKeji(entry, "体育 ");
        }
        if (urld.contains("channel_id=2712332726")) {
            GetDataByTag.getKeji(entry, "财经 ");
        }
        if (urld.contains("channel_id=2712332730")) {
            GetDataByTag.getKeji(entry, "科技 ");
        }
        if (urld.contains("channel_id=2712332734")) {
            GetDataByTag.getKeji(entry, "民生 ");
        }
        if (urld.contains("channel_id=2712332742")) {
            GetDataByTag.getKeji(entry, "段子 ");
        }
        if (urld.contains("channel_id=2712332754")) {
            GetDataByTag.getKeji(entry, "汽车 ");
        }
        if (urld.contains("channel_id=2712332750")) {
            GetDataByTag.getKeji(entry, "时尚 ");
        }
        if (urld.contains("channel_id=60813408982")) {
            GetDataByTag.getKeji(entry, "明星 ");
        }
        if (urld.contains("channel_id=2712332758")) {
            GetDataByTag.getKeji(entry, "搞笑 ");
        }


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
