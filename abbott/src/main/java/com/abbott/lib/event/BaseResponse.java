package com.abbott.lib.event;

/**
 * @author jyb jyb_96@sina.com on 2017/6/22.
 * @version V1.0
 * @Description: add comment
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class BaseResponse<T> implements IBaseResponse {
    private String msg;
    private int cmd;
    private T data;

    public BaseResponse(int cmd) {
        this.cmd = cmd;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int getCmd() {
        return cmd;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public String getMsg() {
        return msg;
    }

}
