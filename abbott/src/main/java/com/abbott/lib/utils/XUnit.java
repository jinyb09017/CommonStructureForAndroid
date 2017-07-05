package com.abbott.lib.utils;

import android.content.res.Resources;
import android.util.TypedValue;

import com.abbott.lib.app.BaseLipApp;

/**
 * @author jyb jyb_96@sina.com on 2017/6/22.
 * @version V1.0
 * @Description: add comment
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class XUnit {

    /**
     * 获取当前分辨率下指定单位对应的像素大小（根据设备信息）
     * px,dip,sp -> px
     * <p>
     * Paint.setTextSize()单位为px
     * <p>
     * 代码摘自：TextView.setTextSize()
     *
     * @param unit TypedValue.COMPLEX_UNIT_*
     * @param size
     * @return
     */

    /*    *//** {@link #TYPE_DIMENSION} complex unit: Value is raw pixels. *//*
    public static final int COMPLEX_UNIT_PX = 0;
    *//** {@link #TYPE_DIMENSION} complex unit: Value is Device Independent
     *  Pixels. *//*
    public static final int COMPLEX_UNIT_DIP = 1;
    *//** {@link #TYPE_DIMENSION} complex unit: Value is a scaled pixel. *//*
    public static final int COMPLEX_UNIT_SP = 2;
    *//** {@link #TYPE_DIMENSION} complex unit: Value is in points. *//*
    public static final int COMPLEX_UNIT_PT = 3;
    *//** {@link #TYPE_DIMENSION} complex unit: Value is in inches. *//*
    public static final int COMPLEX_UNIT_IN = 4;
    */

    /**
     *  complex unit: Value is in millimeters.
     *//*
    public static final int COMPLEX_UNIT_MM = 5;*/
    public float getRawSize(int unit, float size) {

        Resources r = BaseLipApp.mContext.getResources();

        return TypedValue.applyDimension(unit, size, r.getDisplayMetrics());
    }

    public int getRawSizeInt(int unit, float size) {

        Resources r = BaseLipApp.mContext.getResources();

        return (int) (TypedValue.applyDimension(unit, size, r.getDisplayMetrics()) + 0.5);
    }

}
