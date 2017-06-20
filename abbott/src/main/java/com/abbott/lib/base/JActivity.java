package com.abbott.lib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.abbott.lib.impl.IActivityDelegate;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description:activity base
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public abstract class JActivity extends RxAppCompatActivity {
    private IActivityDelegate mActivityDelegateImpl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityDelegate().onCreate();
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

    protected void onReceive() {

    }
}
