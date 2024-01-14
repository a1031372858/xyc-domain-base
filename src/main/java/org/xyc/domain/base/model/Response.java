package org.xyc.domain.base.model;

import lombok.*;
import org.xyc.domain.base.enums.ResponseCode;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Data
public class Response<T> implements Serializable {

    private int code;
    private String message;
    private int count;
    private T detail;

    public static Response success(Object data) {
        return success(null, data);
    }

    public static Response success(String message) {
        return success(message, null);
    }

    public static <T> Response<T> success(String message, T data) {
        Response response = new Response();
        response.setCode(ResponseCode.SUCCESS.getCode());
        response.setMessage(message);
        response.setDetail(data);

        if (Objects.nonNull(data)) {
            if (data instanceof List) {
                response.setCount(((List)data).size());
            } else {
                response.setCount(1);
            }
        }
        return response;
    }

    public static Response fail(String message) {
        return fail(ResponseCode.FAIL.getCode(), message);
    }

    public static Response fail(Integer code,String message) {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }


    public static Response fail(ResponseCode responseCode) {
        return fail(responseCode.getCode(), responseCode.getMessage());
    }

    public static boolean isSuccess(Response response) {
        return null != response && ResponseCode.SUCCESS.getCode().equals(response.getCode());
    }

    public static boolean isFail(Response response) {
        return !isSuccess(response);
    }

}
