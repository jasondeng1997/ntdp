package com.xiangkai.cfms.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转化工具类
 *
 */
public class DateUtils {

	/**
	 * 字符串日期
	 * 
	 * @param str
	 * @return
	 */
	public static Date str2Date(String str, String format) {
		DateFormat df = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 格式化日期
	 */
	public static Date formatDate(Date date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String s = sdf.format(date);
			return sdf.parse(s);
		}catch(Exception ex) {
			return null;
		}
	}
	
	/**
	 * 格式化日期
	 */
	public static String formatDate2String(Date date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String s = sdf.format(date);
			return s;
		}catch(Exception ex) {
			return null;
		}
	}


}
