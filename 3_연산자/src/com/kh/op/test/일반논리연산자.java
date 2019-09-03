package com.kh.op.test;

import java.util.Scanner;

public class 일반논리연산자 {
	
	public void testMethod() {
		// && : and, 그리고 - (11 순위)
		// ||	  : or, 이거나 , 또는 	 - (12순위)
		
		// ( 논리 값 ) && ( 논리 값 )
		// ( 논리 값 ) || ( 논리 값 )
		// ** 논리값 : true / false 가 나오는 수식
		
		//  14 <= age <= 19
		//  14 <= age && age <=19
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력  : ");
		int num = sc.nextInt();
		
		System.out.println("num이 14 ~ 19 사이 인가요? " + (num >= 14 && num <= 19));
		
		// 응용1
		// 문자 --> 숫자
		// 입력한 문자 하나가 대문자인지 확인하기
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("ch가 대문자 인가요? " + ( ch >= 'A' && ch <= 'Z'));

		System.out.println("ch가 대문자 인가요? " + ( ch >= 65 && ch <= 91));
		
		// 응용2
		
		System.out.print("계속 하시려면 y나 Y를 눌러주세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("입력한 영문자 확인 :" + (ch2 == 'y' || ch2 == 'Y'));
				
				
		
		
		
		
	}
	
	public void testMethod2() {
		// 심화
		
		// (논리 식) && (논리 식)
		// 앞 뒤의 논리식이 모두 참 이어야 true를 허용하는 논리 연산자
		// 따라서 앞의 논리 식이 false 가 나올 경우 뒤의 논리 식을 확인 하지 않는다.
		
		// (논리 식) || (논리 식)
		// 앞 뒤의 논리 식 중 어느 하나만 참이어도 true를 허용하는 논리 연산자.
		// 따라서 앞의 논리식이 true 가 나올 경우 뒤의 논리 식을 확인 하지 않는다.
		
		// Scanner sc = new Scanner(System.in);
		
		int num = 10;
		
		boolean result = (false && (++num > 0)); // 앞에서 이미 거짓이라 뒤에 값을 확인하지 않아서 결과값이 10이 나옴
		
		System.out.println("num : " + num);
		
		int num2 = 20;
		
		boolean result2 = (true || (num++ > 0 )); // 앞에서 이미 참이라 뒤에 내용을 읽지 않고 넘어가기 때문에 결과값이 20이 나옴
		
		System.out.println("num2 : " + num2);
		
		
	}
}
