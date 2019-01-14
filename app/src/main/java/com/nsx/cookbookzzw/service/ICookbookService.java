package com.nsx.cookbookzzw.service;


import com.nsx.cookbookzzw.app.Config;
import com.nsx.cookbookzzw.bean.FoodDetailBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface ICookbookService {

    //通过分类ID搜索菜谱
    @POST(Config.BYCLASSID)
    @FormUrlEncoded
    Call<FoodDetailBean> cookBookById(@Field("classid") int classid
            , @Field("start") int start
            , @Field("num") int num
            , @Field("appkey") String appkey);

    //按名字搜索菜谱
    @POST(Config.SEARCH)
    @FormUrlEncoded
    Call<FoodDetailBean> cookBookSearch(@Field("keyword") String keyword
            , @Field("num") int num
            , @Field("appkey") String appkey);
    //按食物ID搜索菜谱
    @POST(Config.DETAIL)
    @FormUrlEncoded
    Call<String> cookBookDetail(@Field("id") int id, @Field("appkey") String appkey);
}
