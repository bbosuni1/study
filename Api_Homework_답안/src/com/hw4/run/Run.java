package com.hw4.run;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.hw4.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		// Calendar클래스를 이용한다.
		DateCalculator dt = new DateCalculator();
		
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		String result = dt.isLeapYear(Calendar.YEAR) ? "윤년" : "평년";
		System.out.println("올해는 "+result+"입니다.");
	
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		long total = 0l;
		total = dt.leapDate();
		
		System.out.println("총 날짜 수 : " + total+"일");
	}

}
