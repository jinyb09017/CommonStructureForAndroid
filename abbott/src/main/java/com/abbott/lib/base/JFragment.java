package com.abbott.lib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abbott.lib.impl.IActivityDelegate;
import com.abbott.lib.impl.UIModule;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description: Fragment base
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public abstract class JFragment extends Fragment implements UIModule {
    protected LayoutInflater mInflater;
    protected View rootView;
    private IActivityDelegate mActivityDelegateImpl;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityDelegate().onCreate();
    }

    @Override
    public void onStart() {
        super.onStart();
        getActivityDelegate().onStart();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            if (getLayoutId() > 0) {
                rootView = mInflater.inflate(getLayoutId(), container, false);
                initView(rootView);
                setListener();
                initData(savedInstanceState);
            }
        }


        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
        getActivityDelegate().onStop();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getActivityDelegate().onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    protected IActivityDelegate getActivityDelegate() {
        if (mActivityDelegateImpl == null) {
            mActivityDelegateImpl = ActivityDelegateImpl.create(this);
        }
        return mActivityDelegateImpl;
    }
}
