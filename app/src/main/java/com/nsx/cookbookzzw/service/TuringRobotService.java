package com.nsx.cookbookzzw.service;

import com.nsx.cookbookzzw.app.Config;
import com.nsx.cookbookzzw.bean.RobotAnswer;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 图灵机器人 的网络请求
 */

public interface TuringRobotService {
    //通过分类ID搜索菜谱
    @POST(Config.ROBOT_QUERY)
    @FormUrlEncoded
    Call<RobotAnswer> getRobotAnswer(@Field("appkey") String appkey
            , @Field("question") String question);
}
