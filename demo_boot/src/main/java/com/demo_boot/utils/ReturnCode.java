package com.demo_boot.utils;

import java.util.HashMap;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/20 16:16
 * Describle 返回的状态码和消息
 */
public class ReturnCode extends HashMap<String,Object>{
    public ReturnCode(int code,String msg){
        put("code",code);
        put("msg",msg);
    }
    public static ReturnCode ok(){return new ReturnCode(200,"success");}
    public static ReturnCode ok(int code,String msg){
        return new ReturnCode(code,msg);
    }
    public static ReturnCode error(){return new ReturnCode(500,"error");}
    public static ReturnCode error(int code,String msg){
        return new ReturnCode(code,msg);
    }
}
