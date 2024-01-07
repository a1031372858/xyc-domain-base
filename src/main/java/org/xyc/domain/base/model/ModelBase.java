package org.xyc.domain.base.model;

import lombok.Data;

import java.util.Date;

@Data
public class ModelBase {
    private Long id;
    private Long version;
    private Integer isDelete;
    private Date createAt;
    private Long createBy;
    private Date updateAt;
    private Long updateBy;
}
