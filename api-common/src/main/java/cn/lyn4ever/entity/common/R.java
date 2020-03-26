package cn.lyn4ever.entity.common;

import java.util.HashMap;

public class R extends HashMap<String,Object> {

    private String code;
    private String msg;
    private Object data;

    private R() {
    }

    public static R ok(){
        R r = new R();
        r.setCode("200");
        return r;
    }
    public static R ok(String msg){
        R r = new R();
        r.setCode("200");
        r.setMsg(msg);
        return r;
    }
    public static R error(){
        R r = new R();
        r.setCode("500");
        return r;
    }

    public static R error(String msg){
        R r = new R();
        r.setCode("500");
        r.setMsg(msg);
        return r;
    }

    public static R other(String code,String msg){
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public String getCode() {
        return code;
    }

    public R setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public R setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public R setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "R{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

