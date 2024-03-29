package com.hw2.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {
	public String todayPrint() {
		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

		return year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초 ";
		
		// 만약 SimpleDateFormat으로 만든다면..?
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// return sdf.format(today.getTime());

	}

	public String setDay() {
		Calendar setTime = Calendar.getInstance();
		setTime.set(2011, 3 - 1, 21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

		return sdf.format(setTime.getTime());
	}
}
