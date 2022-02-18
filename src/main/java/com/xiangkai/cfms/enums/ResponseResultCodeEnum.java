package com.xiangkai.cfms.enums;

/**
 * Created by xukq on 2018-2-23.
 */
public enum ResponseResultCodeEnum {
	/**
	 * 通用码
	 */
	SUCCESS(1, "SUCCESS"),
	FAILED(0, "FAILED"),
	PARAM_CONVERT_ERROR(101, "参数转换失败"),
	REQUESTBODY_CANNOT_NULL(102, "报文不能为空"),
	REQUESTBODY_FORMAT_ERROR(103, "报文格式有误"),
	FORBIDDEN(506, "无操作权限"),
	SYSTEM_ERROR(999, "系统异常"),
	TOKEN_ERROR(50008, "认证失败或者认证已过期"),
	USER_STATUS_ERROR(50008, "用户状态不正确");

	private int code;
	private String desc;

	ResponseResultCodeEnum(int code, String desc){
		this.code=code;
		this.desc=desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
