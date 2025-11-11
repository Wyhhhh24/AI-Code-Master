package com.air.aicodemaster.common;

import com.air.aicodemaster.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 响应结果类：状态码，响应数据，响应信息
 * 一般情况下؜，每个后端接口都要返回状态码，响应数据，响应信息，前端可以根据这些信息进行相‍应的处理。
 * 我们可以封装统一的响应结果类，便于前端统一获取这些信息。
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * 成功响应构造方法
     */
    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    /**
     * 异常响应，构造方法
     */
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
