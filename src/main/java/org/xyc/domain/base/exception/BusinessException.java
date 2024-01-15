package org.xyc.domain.base.exception;


/**
 * 业务异常类
 */
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = -6406516282560248434L;

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }
}
