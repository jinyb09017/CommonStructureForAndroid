package com.abbott.lib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.abbott.lib.event.IBaseResponse;
import com.abbott.lib.impl.IActivityDelegate;
import com.abbott.lib.impl.UIModule;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description:activity base
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public abstract class JActivity extends RxAppCompatActivity implements UIModule {
    private IActivityDelegate mActivityDelegateImpl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getActivityDelegate().onCreate();
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
        }

        initView(getWindow().getDecorView());
        initData(savedInstanceState);
        setListener();

    }

    @Override
    protected void onStart() {
        super.onStart();

        getActivityDelegate().onStart();
    }


    @Override
    protected void onResume() {
        super.onResume();

        getActivityDelegate().onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        getActivityDelegate().onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

        getActivityDelegate().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        getActivityDelegate().onDestroy();
    }

    protected IActivityDelegate getActivityDelegate() {
        if (mActivityDelegateImpl == null) {
            mActivityDelegateImpl = ActivityDelegateImpl.create(this);
        }
        return mActivityDelegateImpl;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(IBaseResponse baseResponse) {
        onReceive(baseResponse);
    }

    protected void onReceive(IBaseResponse baseResponse) {

    }

    protected <T extends View> T findById(int id) {
        T t = (T) findViewById(id);
        return t;
    }
}
