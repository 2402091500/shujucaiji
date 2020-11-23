package cn.darkal.networkdiagnosis.service;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface RetrofitService {
    @FormUrlEncoded
    @POST("/admin/addInfoApp")
    Observable<String> getPostInfoRx(  @Field("infoDto") String postid);

    //http://139.159.210.26:8080/admin/addTopicApp
    @POST("/admin/addTopicApp")
    Observable<String> getPostTopic(@Body RequestBody body);

}
