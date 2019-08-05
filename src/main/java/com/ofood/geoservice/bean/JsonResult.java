package com.ofood.geoservice.bean;

public class JsonResult {
    private int code = 0;
    private String msg = "";
    private Object data = null;

    public JsonResult status(int status) {
        this.code = status;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
