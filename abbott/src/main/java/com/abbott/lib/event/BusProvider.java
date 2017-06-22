package com.abbott.lib.event;

/**
 * Created by jinyb on 2016/12/22.
 * bus factory
 */

public class BusProvider {
    private static boolean useEventBus = true;

    private static IBus bus;

    public static IBus getBus() {
        if (bus == null) {
            if (useEventBus) {
                synchronized (BusProvider.class) {
                    if (bus == null) {
                        bus = EventBusImpl.get();
                    }
                }

            } else {
                synchronized (BusProvider.class) {
                    if (bus == null) {
                        bus = RxBusImpl.get();
                    }
                }
            }

        }
        return bus;
    }


}
