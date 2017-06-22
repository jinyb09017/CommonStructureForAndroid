package com.abbott.lib.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.abbott.lib.event.BusProvider;
import com.abbott.lib.impl.IActivityDelegate;
import com.abbott.lib.log.XLog;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description: IActivityDelegate implementation
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class ActivityDelegateImpl implements IActivityDelegate {
    public FragmentActivity jActivity;
    public Fragment fragment;
    private String tag = "activity-life";

    public ActivityDelegateImpl(FragmentActivity aty) {
        this.jActivity = aty;
    }

    public ActivityDelegateImpl(Fragment fragment) {
        this.fragment = fragment;
    }


    public static IActivityDelegate create(Fragment fragment) {
        return new ActivityDelegateImpl(fragment);
    }

    public static IActivityDelegate create(FragmentActivity aty) {
        return new ActivityDelegateImpl(aty);
    }


    @Override
    public void onCreate() {
        XLog.d(tag, getLogMsg("onCreate"));

    }

    @Override
    public void onStart() {
        XLog.d(tag, getLogMsg("onStart"));
        BusProvider.getBus().register(jActivity != null ? jActivity : fragment);
    }

    @Override
    public void onResume() {
        XLog.d(tag, getLogMsg("onResume"));
    }

    @Override
    public void onPause() {
        XLog.d(tag, getLogMsg("onPause"));
    }

    @Override
    public void onStop() {
        XLog.d(tag, getLogMsg("onStop"));
        BusProvider.getBus().unregister(jActivity != null ? jActivity : fragment);
    }

    @Override
    public void onDestroy() {
        XLog.d(tag, getLogMsg("onDestroy"));
    }



    public String getLogMsg(String state) {


        return jActivity != null ? jActivity.getClass() + "-" + state : fragment.getClass() + "-" + state;

    }
}
