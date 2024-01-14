package org.xyc.domain.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS(200, "success"),
    FAIL(-1, "fail"),
    API_ERROR(-100, "API ERROR"),
    NULL_POINTER(0, "NULL_POINTER"),
    ;

    private Integer code;
    private String message;
}
