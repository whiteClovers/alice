package com.iwonder.alice.framework.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.pagehelper.util.StringUtil;

public class AliceUtils {
	
	public static  long  differSecond(Date a  ,Date b){
		long between = a.getTime()-b.getTime();
		long day = between / (24 * 60 * 60 * 1000);
		long hour = (between / (60 * 60 * 1000) - day * 24);
		long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
		long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		return s;
	}
	public static Integer parseInteger(String str) {
		Integer integer = null;
		if (StringUtil.isEmpty(str)) {

		} else {
			try {
				integer = Integer.valueOf(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return integer;
	}
	public static Date parseDate(String str) {
		Date date = null;
		if (StringUtil.isEmpty(str)) {

		} else {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			try {
				date = simpleDateFormat.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;

	}
	public static String dateFormat(Date str) {
		String date = null;
		if(str==null){
			return "";
		}else{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			date = simpleDateFormat.format(str);
		
		return date;
		}
	}
	public static BigDecimal parseBigDecimal(String str) {
		BigDecimal bigDecimal = null;
		if (StringUtil.isEmpty(str)) {

		} else {
			bigDecimal = new BigDecimal(str);
			return bigDecimal;
		}
		return bigDecimal;
	}
}
