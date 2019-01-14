package com.nsx.cookbookzzw.ui.activity;

import android.widget.GridView;

import com.nsx.cookbookzzw.R;
import com.nsx.cookbookzzw.adapter.FestivalGridViewAdapter;
import com.nsx.cookbookzzw.base.BaseActivity;
import com.nsx.cookbookzzw.bean.custom.Festival;
import com.nsx.cookbookzzw.model.LocalJsonResolutionUtils;

import butterknife.BindView;
import butterknife.OnClick;


public class FestivalActivity extends BaseActivity {
    @BindView(R.id.festival_grid_view)
    GridView mFestivalGridView;

    @Override
    protected void initView() {
        //得到本地json文本内容
        String fileName = "festival.json";
        String festivaljson = LocalJsonResolutionUtils.getJson(this, fileName);
        //转换为对象
        Festival festival = LocalJsonResolutionUtils.JsonToObject(festivaljson, Festival.class);
        FestivalGridViewAdapter adapter = new FestivalGridViewAdapter(this, festival.getList());
        mFestivalGridView.setAdapter(adapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_festival;
    }

    @OnClick(R.id.festival_back)
    public void onViewClicked() {
        onBackPressed();
    }
}
