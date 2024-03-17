package org.xyc.domain.base.cache;

/**
 * @author xuyachang
 * @date 2024/3/17
 */
public interface BaseCache<T> {

    T findById(Long id);

    void invalidate(Long id);

}
