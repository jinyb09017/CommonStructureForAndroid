package com.abbott.common;

import android.os.Bundle;
import android.view.View;

import com.abbott.lib.base.JActivity;
import com.abbott.lib.event.BusProvider;
import com.abbott.lib.event.IBus;
import com.abbott.lib.log.XLog;

/**
 * @author jyb jyb_96@sina.com on 2017/6/21.
 * @version V1.0
 * @Description:请添加描述
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class EventTest extends JActivity {
    @Override
    public void initView(View view) {
        findById(R.id.ll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XLog.d("click","parent");

                BusProvider.getBus().post(new IBus.IEvent() {
                    @Override
                    public int getTag() {
                        return 100;
                    }
                });
            }


        });
//        findById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                XLog.d("click","btn");
//            }
//        });
//        findById(R.id.tv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                XLog.d("click","tv");
//            }
//        });


    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.test;
    }


}