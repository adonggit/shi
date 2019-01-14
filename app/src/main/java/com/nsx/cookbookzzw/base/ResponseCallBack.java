package com.nsx.cookbookzzw.base;


import com.nsx.cookbookzzw.app.AppApplication;
import com.nsx.cookbookzzw.utils.DialogUtils;
import com.nsx.cookbookzzw.utils.SimpleToast;

import retrofit2.Call;
import retrofit2.Callback;


public abstract class ResponseCallBack<T> implements Callback<T> {
    @Override
    public void onFailure(Call<T> call, Throwable t) {
        SimpleToast.show(AppApplication.getInstance(), "暂无数据，敬请期待");
        DialogUtils.dismiss();
    }
}
