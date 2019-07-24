package com.demo_boot.model;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/19 11:22
 * Describle 返回的状态码
 */
public class ReturnCode {
    public String code;//状态码
    public String msg;//消息

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
