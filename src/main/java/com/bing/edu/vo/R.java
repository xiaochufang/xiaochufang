package com.bing.wc.common.vo;

import com.bing.wc.common.myenum.ResultCode;
import lombok.Data;

@Data
public class R {
    int code;
    Object data;
    String msg;

    public static R ok(String msg,Object data){
        R r = new R();
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

    public static R ok(Object data){
        R r = new R();
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setData(data);
        r.setMsg("OK");
        return r;
    }

    public static R ok(){
        R r = new R();
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setData(null);
        r.setMsg("OK");
        return  r;
    }


    public static R fail(String msg) {
        R r = new R();
        r.setCode(ResultCode.FAIL.getCode());
        r.setData(null);
        r.setMsg("fail");
        return  r;
    }

    public static R fail() {
    return fail("FAIL");
    }

    public static R setOk(boolean msg,Object obj) {
        if(msg==true) {
            return ok(obj);
        }else {
            return fail();
        }
    }


}
