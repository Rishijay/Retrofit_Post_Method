package com.rjay.retrofitself;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("search")
    Call<ResponseBody> searchResponse(
            @Field("date") String date,
            @Field("category_name") String category_name,
            @Field("dr_name") String dr_name,
            @Field("mode") String mode,
            @Field("request") String request,
            @Field("city") String city
    );
}
