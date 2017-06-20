package com.abbott.lib.base;

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
    public JActivity jActivity;
    private String tag = "activity-life";

    public ActivityDelegateImpl(JActivity aty) {
        this.jActivity = aty;
    }

    public static IActivityDelegate create(JActivity aty) {
        return new ActivityDelegateImpl(aty);
    }

    @Override
    public void onCreate() {
        XLog.d(tag, getLogMsg("onCreate"));

    }

    @Override
    public void onStart() {
        XLog.d(tag, getLogMsg("onStart"));
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
    }

    @Override
    public void onDestroy() {
        XLog.d(tag, getLogMsg("onDestroy"));
    }

    public static String getCurrentClassAndMethodNames() {
        final StackTraceElement e = Thread.currentThread().getStackTrace()[2];
        final String s = e.getClassName();
        return s.substring(s.lastIndexOf('.') + 1, s.length()) + "." + e.getMethodName();
    }

    public String getLogMsg(String state) {
        return jActivity.getClass() + "-" + state;
    }
}
