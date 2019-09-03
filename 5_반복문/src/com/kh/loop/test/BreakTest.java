package com.kh.loop.test;

import java.util.Scanner;

public class BreakTest {

	// break 는
	// 반복문 내에 사용되는 분기문 중 하나로
	// 반복문의 내용을 실행하다 특정 조건에 해당되었을 때
	// 해당 반복을 종료하는 목적으로 사용되는 문법
	// 단. 예외적으로 switch 문에서는 해당 case를
	// 빠져나가는 목적으로 사용한다.
	
	// 일반적으로 특정 조건을 위해 if 문과 함께 사용한다.
	
	Scanner sc = new Scanner(System.in);
	
	public void testMethod() {
		// 문자열을 받아 글자 갯수를 구하는 
		// 반복 프로그램 
		// 단, 'end' 라고 입력되면 해당 프로그램을 종료하기
	
		String str = null;
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			
			if ( str.equals("end")) {
				break;
			}
			else {
				System.out.println(str + " : " + str.length());
			}
			
		}while(true);
		
	}
	
	public void testMethod2() {
		
		//	 숫자를 입력받아
		// 1부터 해당 숫자까지 합을 구하기
		// 단, for 문으로 무한 반복을 구현하고
		// 반복 횟수가 입력한 숫자에	도달했을 때 
		// break; 로 빠져 나가기
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i  = 1 ; ; i ++) {

			sum += i ;
			
			if( i != num) {
				System.out.print(i + " + " );
			} //if
			else {
				System.out.println(i);
				break;
			}
			
		} // for
		System.out.print("합계 : " + sum);
		
	} // method
	
	
} // class

