package com.nsx.cookbookzzw.interfaces;

import com.nsx.cookbookzzw.bean.RobotAnswer;


public interface TuringRobotModel {
    /**
     * 图灵机器人
     */
    public void getRobotAnswer(String question, BeanCallBack<RobotAnswer> callback);
}
