package com.nsx.cookbookzzw.interfaces;

import com.nsx.cookbookzzw.bean.CalendarBean;
import com.nsx.cookbookzzw.bean.LaunarCalendar;


public interface ICalendarModel {
    /**
     * 日历查询
     */
    public void getCalendar(String date, BeanCallBack<CalendarBean> callback);
    public void getLaunarCalendar(String year, String month, String day, BeanCallBack<LaunarCalendar> callback);
}
