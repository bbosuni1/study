package com.kh.loop.test;

import java.util.Scanner;

public class WhileLoopTest {
	// while 문
	// 특정 조건을 만족하면
	// 무한정 반복하는 반복 구문
	Scanner sc = new Scanner(System.in);
	
	public void beforeWhile() {
		
		while(true) {
			
			System.out.println("Hello World :p");
			
		}
		
	}

	public void testWhileLoop1() {
		// for 문은 특정 범위 안에 반복을 수행 할 때
		// 사용하지만, while문은 어떠한 조건만 충족하면
		// 무한히 실행하는 무한 반복문이다.
	
		// 따라서 일반적으로 테스트 시에 
		// 반복 횟수를 정해주기 위해
		// 조건식 전에 변수를 선언하고 
		// while문 내부에 증감식을 넣어 사용한다.
		
		// 1부터 10까지의 합 
		int i = 1 , sum = 0 ;
		
		while( i <= 10 ) {
			
			sum += i ;
			
			i++;
		}
		System.out.print("sum : " + sum);
		
		
	}//메소드

	public void testWhileLoop2() {
		
		// 문자열을 입력 받아
		// 해당 문자열의 각 자리수(index : 문자을의 길이) 만큼
		// 문자를 쪼개어 출력하기
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// "안녕하세요" : 5개
		//   ^ ..............^  : 
		//	 0               4 : 0 ~4 자리 숫자
		int index = 0; // 0부터 시작하는 zero - based - index
		while( index < str.length() ) {
			
			System.out.println(index + "번째 문자 : " + str.charAt(index));
			
			index ++;
			
		}
	}

	public void testWhileLoop3() {
		// 1부터 입력 받은 수까지의 합을 구하시오.
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int i = 1; // for 문의 초기값
		
		while (	 i <= num) {
			sum += i;
			i++; // for 문의 증감식
			
		}
		System.out.println("sum : " + sum);
		
	}

	public void testWhileLoop4() {
		
		// 구구단
		// 2 ~ 9 단 까지 한번에 모두 출력하기.
		
		int dan = 2;
		
		while( dan <= 9 ) { // 외부 while
			// 1 ~~ 9 곱 계산하기
			System.out.println("********" + dan + "********");
			
			int su = 1;
			while(su<=9) { // 내부 while
				
				System.out.printf("%d * %d = %d \n", dan, su, (dan*su));
				
				su++;
			}
			
			dan++;
			
		}
		
	}

	public void testWhileLoop5() {
		// for 문을 while 문으로 
		// while 문을 for 문으로 변경할 수 있다.
		
		// for 문 >>>>>> while 문으로 
	
		// 1 ~ 5 까지의 합
		
		int sum = 0 ;
		/*
		for(int i = 1 ; i <=5 ; i++){
			sum += i ;
		}
		*/
		
		int i = 1;
		while( i <=5 ) {
		sum += i ;
			i++;
		}
			System.out.print("sum : " + sum);
		
			// while --> for
			
		/*	
			while(true) {
				sum +=1;
			}
		 */			
		for( ; true ; ) {
			sum += 1;
		}
			
			
	}//method

	
}//클래스
