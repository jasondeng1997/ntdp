package com.xiangkai.cfms.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
public class BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
     * 创建时间
     */
	@Column(name = "create_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    /**
     * 创建人
     */
	@Column(name = "created_by")
    private Long createdBy;
    /**
     * 最后修改时间
     */
	@Column(name = "last_update_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
    /**
     * 最后一次修改人
     */
	@Column(name = "last_updated_by")
    private Long lastUpdatedBy;
    /**
     * 状态（10 有效；20 无效；30 删除。）
     */
	@Column(name = "status")
    private Integer status;

}
