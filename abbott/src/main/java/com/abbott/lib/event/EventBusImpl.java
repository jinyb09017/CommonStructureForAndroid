package com.abbott.lib.event;

import org.greenrobot.eventbus.EventBus;

/**
 * @author jyb jyb_96@sina.com on 2017/6/20.
 * @version V1.0
 * @Description:eventbus的实现类
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class EventBusImpl implements IBus {

    @Override
    public void register(Object object) {
        if (!EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().register(object);
        }
    }


    @Override
    public void unregister(Object object) {
        if (EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().unregister(object);
        }
    }

    @Override
    public void post(IBaseResponse event) {
        EventBus.getDefault().post(event);
    }

    @Override
    public void postSticky(IBaseResponse event) {
        EventBus.getDefault().postSticky(event);
    }

    private static class Holder {
        private static final EventBusImpl instance = new EventBusImpl();
    }

    public static EventBusImpl get() {
        return Holder.instance;
    }

}
