package com.hw2.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {
	
	// 기본 생성자
	public SetDate() {}
	
	public String todayPrint() {
		String result;
		
		Calendar today = new GregorianCalendar();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.DAY_OF_MONTH);
		int date = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		result = year + "년 " + month + "월 " + date + "일 " + hour  +"시 "+ min +"분 " + sec + "초 ";
		
		return result;
	}
	
	public String setDay() {
		
		Calendar today = new GregorianCalendar();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
	
		today.set(2011, 2, 21);
		String formatDate = sdf.format(today.getTime());
	
		return formatDate;
	}
}
