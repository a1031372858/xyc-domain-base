package org.xyc.domain.base.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data
public class ModelBase<T extends Model<?>> extends Model<T> {

    private static final long serialVersionUID = -7279605295963487934L;
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 版本
     */
    private Long _version;

    /**
     * 是否删除
     */
    private Integer isDeleted;

    /**
     * 删除时间
     */
    private Long deletedAt;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建者
     */
    private Long createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 更新者
     */
    private Long updatedBy;
}
