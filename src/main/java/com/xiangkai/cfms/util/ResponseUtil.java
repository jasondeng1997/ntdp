package com.xiangkai.cfms.util;

import com.alibaba.fastjson.JSONObject;
import com.xiangkai.cfms.dto.BaseResponseDTO;
import com.xiangkai.cfms.enums.ResponseResultCodeEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {

	public static void responseJson(HttpServletResponse response, int status, Object data) {
		try {
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "*");
			response.setContentType("application/json;charset=UTF-8");
			response.setStatus(status);

			response.getWriter().write(JSONObject.toJSONString(data));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static BaseResponseDTO ok() {
		return new BaseResponseDTO(null);
	}

	public static BaseResponseDTO ok(Object data) {
		return new BaseResponseDTO(data);
	}

	public static BaseResponseDTO ok(Object data, long total) {
		return new BaseResponseDTO(data, total);
	}

	public static BaseResponseDTO fail(String errorMsg) {
		return new BaseResponseDTO(ResponseResultCodeEnum.FAILED.getCode(), errorMsg);
	}

	public static BaseResponseDTO fail(int errorCode, String errorMsg) {
		return new BaseResponseDTO(errorCode, errorMsg);
	}

	/**
	 * 未登陆
	 * @return
	 */
	public static BaseResponseDTO unLogin() {
		return fail(ResponseResultCodeEnum.TOKEN_ERROR.getCode(), "请登录");
	}

	/**
	 * 未授权
	 * @return
	 */
	public static BaseResponseDTO unAuthz() {
		return fail(ResponseResultCodeEnum.FORBIDDEN.getCode(), ResponseResultCodeEnum.FORBIDDEN.getDesc());
	}

	/**
	 * 系统异常
	 * @return
	 */
	public static BaseResponseDTO systemError() {
		return fail(ResponseResultCodeEnum.SYSTEM_ERROR.getCode(), ResponseResultCodeEnum.FORBIDDEN.getDesc());
	}
}
