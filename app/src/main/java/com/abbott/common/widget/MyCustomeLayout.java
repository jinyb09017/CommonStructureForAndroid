package com.abbott.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author jyb jyb_96@sina.com on 2017/6/21.
 * @version V1.0
 * @Description:请添加描述
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class MyCustomeLayout extends LinearLayout {
    public MyCustomeLayout(Context context) {
        super(context);
    }

    public MyCustomeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCustomeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
