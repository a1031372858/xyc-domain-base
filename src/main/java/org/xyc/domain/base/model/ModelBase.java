package org.xyc.domain.base.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data
public class ModelBase<T extends Model<?>> extends Model<T> {

    /**
     * 主键
     */
    private Long id;

    /**
     * 版本
     */
    private Long _version;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 删除时间
     */
    private Long deleteAt;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 更新者
     */
    private Long updateBy;
}
