package com.guigu.cloud.common;

import sun.nio.cs.ArrayEncoder;

/**
 * @Classname ApiResult
 * @Description TODO
 * @Date 2020/8/6 23:25
 * @Created by wali
 */
public class ApiResult<T> {

    private int code;

    private String msg;

    private T results;

    private String desc;

    public ApiResult(ApiResultCode apiResultCode, T results, String desc){
        this.code = apiResultCode.getCode();
        this.msg = apiResultCode.getMsg();
        this.results = results;
        this.desc = desc;
    }
}
