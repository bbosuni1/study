package com.hw4.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	/* 
	 * leapDate()
	 * 	=> 각 변수 선언 : 총날수 저장용 => long sumDays = 0L;
	 * 	=> for loop 사용 : 1년 1월 1일부터 오늘까지의 총날수 계산함
	 * 		- 1년부터 현재 년도까지 각 년도가 윤년이면 366일을,
	 * 		  평년이면 365일을 더해 나감
	 * 		- hints : 
	 * 		- 해당 현재 년도가 윤년이면 2월을 29일로, 아니면 28일로 더함
	 * 		- 월의 날짜수 더해 나감
	 * 		  31일인 달(큰달) : 1, 3, 5, 7, 8, 10, 12월
	 * 		  30일인 달(작은달) : 4, 6, 9, 11월 
	 */
	public long leapDate() {
		Calendar cal = new GregorianCalendar();
		
		long sumDays = 0l;

		// 1년부터 올해까지의 총 일 수 계산 (월을 다 더할 경우 365나 366 둘 중 하나)
		for (int i = 1; i <= cal.get(Calendar.YEAR); i++) {
			// 삼항연산자의 경우
			sumDays += (i == cal.get(Calendar.YEAR)) ?  // i번째 반복년도가 올 해에 해당하는 숫자인가?
				cal.get(Calendar.DAY_OF_YEAR) : (isLeapYear(i) ? 366 : 365);
				// 맞으면 이번 년도 기준 경과일 가산, 아니면 윤년인지 비교하여 365, 366 가산 
			// 우리가 만든 isLeapYear 메소드를 활용해봅시다!
				
			/*
			 * if-else 의 경우
			if (i == cal.get(Calendar.YEAR)) {
				sumDays += cal.get(Calendar.DAY_OF_YEAR);
			} else {
				sumDays += isLeapYear(i) ? 366 : 365;
			}*/
			
		}
		
		return sumDays;
	}
	/** isLeapYear(년도) 구현 내용
	 * 	=> 년도가 윤년이면 true, 평년이면 false 리턴함
	 * @return boolean
	 */
	public boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
	}
}
