package com.igeek.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 	日期的工具类
 * @author Administrator
 *
 */
public class DateUtil {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 *	将时间格式化
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date){
		return sdf.format(date);
	}
	
	/**
	 * 	将格式化的字符串转换为date对象
	 * @param dateStr
	 * @return
	 */
	public static Date parseStrToDate(String dateStr){
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
