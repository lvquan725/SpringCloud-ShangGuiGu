package com.guigu.cloud.common;

public enum ApiResultCode {

    SUCCESS(200, "成功"),
    FAIL(500, "失败");

    private int code;

    private String msg;

    private ApiResultCode(int code, String msg){

    }

    public int getCode(){return code;}

    public String getMsg(){return msg;}
}
