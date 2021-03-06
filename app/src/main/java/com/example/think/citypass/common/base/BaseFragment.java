package com.example.think.citypass.common.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by think on 2017/5/14.
 */

public abstract class BaseFragment extends Fragment {

    protected View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        getView(view);
        initData();
        initListener();
        loadData();
    }

    protected View getView(View view) {
        return this.view;
    }


    /**
     * 加载一个视图
     *
     * @return
     */
    protected abstract int layoutId();

    /**
     * 初始化对象
     */
    protected abstract void initData();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 加载数据
     */
    protected abstract void loadData();

}
