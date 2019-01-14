package com.nsx.cookbookzzw.interfaces;

import com.nsx.cookbookzzw.bean.TodayHistory;


public interface ITodayHistoryModel {
    /**
     * 历史上的今天
     *
     */
    public void getTodayHistory(String month, String day, BeanCallBack<TodayHistory> callback);
}
