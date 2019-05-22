package com.example.viewpagerretrofitget.API;

import com.example.viewpagerretrofitget.Bean.StatusBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface APInterface {

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE1NTc5ODk5MDQsImZyZXNoIjpmYWxzZSwianRpIjoiOTAwMDM4MWItYzkyYy00ZjU1LTkwNDQtYzBlYWFkN2UyOTJiIiwiaWF0IjoxNTU3OTg5OTA0LCJleHAiOjE1NTgwNzYzMDQsInVzZXJfY2xhaW1zIjp7InVpZCI6IkNoYW5kcmFrYWxhIn0sInR5cGUiOiJhY2Nlc3MiLCJpZGVudGl0eSI6IkNoYW5kcmFrYWxhIn0._V1w2bYnSJCBX6BVXfFLR7yhzF7P2iz1g7swplEdj_4"})
    @GET("banners")
    Call<StatusBean> getresponce();
}
