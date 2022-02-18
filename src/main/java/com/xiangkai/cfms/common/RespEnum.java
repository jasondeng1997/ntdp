package com.xiangkai.cfms.common;

public enum RespEnum {
	
	RESP_SUCCESS(0,"成功"),RESP_FAILURE(1,"失败");
	
	private Integer code;
	private String value;
	
	public Integer getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}


	RespEnum(Integer code,String value){
		this.code = code;
		this.value = value;
	}

}
