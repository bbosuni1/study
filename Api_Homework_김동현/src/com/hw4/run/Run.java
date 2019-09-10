package com.hw4.run;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.hw4.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		
		Calendar today = new GregorianCalendar(); // 캘린더 클래스
		
		String result = ( totalDay.isLeapDate(today.YEAR) == true) ? "윤년" : "평년";
		System.out.println("올해는 " + result + " 입니다.");
		
		
		
		
	}

}
