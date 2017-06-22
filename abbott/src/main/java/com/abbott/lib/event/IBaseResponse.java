package com.abbott.lib.event;

/**
 * @author jyb jyb_96@sina.com on 2017/6/22.
 * @version V1.0
 * @Description: message interface
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public interface IBaseResponse<T> {


    int getCmd();

    T getData();

    String getMsg();
}
