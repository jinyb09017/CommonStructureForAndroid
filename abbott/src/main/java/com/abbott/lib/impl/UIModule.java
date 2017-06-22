package com.abbott.lib.impl;

import android.os.Bundle;
import android.view.View;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description:ui template method.
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public interface UIModule {
    void initView(View view);

    void initData(Bundle savedInstanceState);

    void setListener();

    int getLayoutId();

}
