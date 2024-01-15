package org.xyc.domain.base.model;

import lombok.*;
import org.xyc.domain.base.enums.ResponseCode;

import java.io.Serializable;

/**
 * 响应统一返回类
 * @param <T>
 */
@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -1738123821727462008L;

    /**
     * 接口响应编码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 响应内容
     */
    private T data;

    /**
     * 是否成功
     */
    private Boolean success;

    public static <T> Response<T> success(T data){
        return success(data, ResponseCode.SUCCESS.getCode());
    }

    public static <T> Response<T> success(T data,Integer code){
        Response<T> response = new Response<>();
        response.setData(data);
        response.setSuccess(true);
        response.setCode(code);
        return response;
    }

    public static <T> Response<T> fail(String msg){
        return fail(msg,ResponseCode.FAIL.getCode());
    }

    public static <T> Response<T> fail(String msg, Integer code){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMsg(msg);
        response.setCode(code);
        return response;
    }
}
