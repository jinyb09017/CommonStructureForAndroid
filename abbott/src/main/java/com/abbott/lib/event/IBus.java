package com.abbott.lib.event;

/**
 * Created by wanglei on 2016/12/22.
 */

public interface IBus {

    void register(Object object);

    void unregister(Object object);

    void post(IBaseResponse event);

    void postSticky(IBaseResponse event);



}
