/**
 * Project Name		:	global-common
 * File Name		:	ExceptionEnum.java
 * Package Name		:	com.longkeinfo.global.common.exception
 * Date				:	2018年7月16日上午9:46:13
 * Copyright (c) 2018, Office_Alex@163.com All Rights Reserved.
 *
 */

package com.xiangkai.cfms.common;

/**
 * ClassName		:	ExceptionEnum <br/>
 * Function			:	异常枚举. <br/>
 * Reason			:	便于维护. <br/>
 * Date				:	2018年7月16日 上午9:46:13 <br/>
 *
 * @author			:	Alex Hu
 * @version			:	1.0.0
 * @since			:	JDK 1.8
 * @see
 */
public enum ExceptionEnum {
	UNKONW_ERROR(-1,"未知错误"),
	PARAM_ERROR(99,"参数错误"),
	BUSINESS_ERROR(100,"业务处理异常"),
	LOGIN_ERROR(101,"登陆处理异常"),
	SUCCESS(0,"成功"),
	EXIST_ERROR(20,"数据已存在"),
	BED_USE(21,"房间已被使用,不能操作"),
	RESERVATIONS_ERROR(22,"该预订单存在金额,设置实效失败"),
	ELDER_NOT_EXSIT(23,"老人档案不存在"),
	ROOM_CODE_EXSIT(24,"房间号已经存在,添加失败"),
	BED_EXSIT(25,"床位号一致,添加失败");


	private Integer code;

	private String msg;

	ExceptionEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
