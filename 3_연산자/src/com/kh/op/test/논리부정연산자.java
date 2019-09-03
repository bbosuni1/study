package com.kh.op.test;

import java.util.Scanner;

public class 논리부정연산자 {
	// !논리값 : 해당하는 논리 값을 반대로 바꾸는 연산자
	// !ture --> False, !false --> true
	
	public void testMethod() {
		
		System.out.println("true 의 부정 : " + !true);
		System.out.println("false 의 부정 : " + !false);
		
		// 정수를 하나 입력 받아 짝수인지 홀수 인지 확인하는 코드
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수 인가요? " + (num % 2 == 0));
		
		System.out.println("입력한 정수가 홀수 인가요? " + !(num % 2 == 0));
		
		//------------------------------//
		
		boolean check = false;
		
		System.out.println("카드 체크 하세요 ~ : " + check);
		
		check = !check;
		 
		System.out.println("카드 체크 확인 ! : " + check);
	}

}
