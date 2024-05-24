package org.xyc.domain.base.util;

import org.xyc.domain.base.exception.BusinessException;
import org.xyc.domain.base.model.Response;

/**
 * @author xuyachang
 * @date 2024/5/24
 */
public final class Assert {
    private Assert() {}
    public static <T> T getResult(Response<T> response) {
        if (!response.getSuccess()) {
            throw new BusinessException(response.getMsg());
        }
        return response.getData();
    }
}
