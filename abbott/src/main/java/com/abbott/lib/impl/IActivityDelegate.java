package com.abbott.lib.impl;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description:it is used be a activity delegate to deal life recycle. reduce the content of the base activity.eg. we can
 * deal the life change log and feed info some moniter code like umeng.
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public interface IActivityDelegate {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
}
