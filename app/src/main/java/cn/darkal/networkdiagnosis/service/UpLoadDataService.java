package cn.darkal.networkdiagnosis.service;

import android.util.Log;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Observable;

public class UpLoadDataService {
    public static UpLoadDataService instance;
    private Retrofit mRetrofit;

    public static UpLoadDataService getInstance(){
        if(instance==null){
            synchronized (UpLoadDataService.class){
                if(instance==null){
                    instance=new UpLoadDataService();
                }
            }
        }
        return instance;
    }


    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(2, TimeUnit.MINUTES)
            .writeTimeout(2, TimeUnit.MINUTES)
            .readTimeout(2, TimeUnit.MINUTES)
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL.BaseUlr)//基地址
            .client(okHttpClient)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();

    RetrofitService serviceApi = retrofit.create(RetrofitService.class);

    public Observable<String> postdata(String data){
        return serviceApi.getPostInfoRx(data);
    }
    public Observable<String> postdatatopic(RequestBody data){
        return serviceApi.getPostTopic(data);
    }


}
