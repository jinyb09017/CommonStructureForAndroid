package com.abbott.lib.event;

/**
 * Created by jinyb on 2016/12/22.
 */

public class BusProvider {

    private static IBus bus;

    public static IBus getBus() {
        if (bus == null) {
            synchronized (BusProvider.class) {
                if (bus == null) {
                    bus = RxBusImpl.get();
                }
            }
//
//            synchronized (BusProvider.class) {
//                if (bus == null) {
//                    bus = EventBusImpl.get();
//                }
//            }
        }
        return bus;
    }


}
