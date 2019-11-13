package com.chufang.common.vo;

import com.chufang.common.config.ResultCode;
import lombok.Data;

import static javafx.scene.input.KeyCode.R;
@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result ok(String msg,Object obj){
        Result r=new Result();
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static Result ok(Object obj){
        return ok("OK",obj);
    }
    public static Result ok(){
        return ok(null);
    }
    public static Result fail(String msg){
        Result r=new Result();
        r.setCode(ResultCode.FAIL.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static Result fail(){
        return fail("FAIL");
    }

    public static Result setR(boolean issuccess,Object obj){
        if(issuccess){
            return ok(obj);
        }else {
            return fail();
        }
    }


}
