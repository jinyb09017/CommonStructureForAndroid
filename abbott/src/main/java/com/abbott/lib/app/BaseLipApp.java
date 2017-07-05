package com.abbott.lib.app;

import android.app.Application;

/**
 * @author jyb jyb_96@sina.com on 2017/6/22.
 * @version V1.0
 * @Description: add comment
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class BaseLipApp {
    public static Application mContext;

    public static void create(Application application) {
        mContext = application;
    }


}
