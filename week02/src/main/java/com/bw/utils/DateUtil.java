package com.bw.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 * 日期工具类
 * */
public class DateUtil {
	public static int getDateByInitMonth(String string) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = df.getCalendar();
		int monthField = df.MONTH_FIELD;
		return monthField;
	}
}
