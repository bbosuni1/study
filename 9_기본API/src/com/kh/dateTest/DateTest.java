package com.kh.dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// 날짜 데이터 확인 클래스
		new DateTest().test3();
		
	}
	
	public void test1() {
		// Date
		// 날짜를 담당하는 클래스
		// 1970. 01. 01을 기준	(UTC) 으로
		// 날짜를 세며, 컴퓨터의 시간 단위인 밀리세컨드(1000분의 1초) 기준으로
		// 날짜를 더해 나간다.
		Date today = new Date();
		Date when = new Date(new GregorianCalendar().getTimeInMillis());
		
		System.out.println("현재 날짜 : " + today);
		System.out.println("1970년 기준 : " + when);
		
		System.out.println("현재까지 흐른 시간 : " + today.getTime());
		System.out.println("1970년 기준 : " + when.getTime());
		
	}

	public void test2() {
		// 기존의 한정적인 날짜 정보 뿐만 아니라
		// 현재 지역, 시간 단위 등의 여러 복합적 정보를 포함하는 
		// 클래스가 Calendear 클래스 이다.
		// 이전에 사용하던 Date 클래스의 대부분의 기능들이
		// Calendar로 이전되었으나, 아직 이전 버전의 기능을
		// 쓰고 있는 회사들도 있어 Deprecated 표기 후 없애지는 못하고
		// 버전 업데이트시 계속 지원은 하고 있다.
		
		// Calendar today = new Calendar();
		// 미완성 메소드라 직접 사용 불가능
		
		Calendar today = new GregorianCalendar();
		System.out.println("오늘 날짜 : " + today);
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.DAY_OF_MONTH);
		int date = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.printf("오늘 날짜 확인 : %d / %d / %d \n", year, month, date);
		System.out.printf("%d : %d : %d \n", hour, min, sec);
		System.out.println("ampm : " + ((ampm == Calendar.AM) ? "오전" : "오후"));

		// 2019-09-09
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		
		//String formatDate = sdf.format(today.getTime());
		
		System.out.println(sdf.format(today.getTime()));
		
		today.set(2019, 11, 25);
		
		System.out.println(sdf.format(today.getTime()));
	}

	public void test3() {
		// 특정 년도가 윤년인지 평년인지 확인하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력 : ");
		int year = sc.nextInt();
		
		String result = ( isLeapYear(year) == true) ? "윤년" : "평년";
		
		System.out.println("입력하신 연도는 " + result + " 입니다.");
		
		
	}
	public boolean isLeapYear( int year) {
		// 윤년의 기준
		// 해당 년도가 4의 배수이면서 100의 배수가 아니거나 400의 배수여야 윤년
		boolean result = false;
		if ( year % 4 == 0 &&( year % 100 != 0 || year % 400 == 0)) {
			result = true;
		}
		return result;
	}
	
}
