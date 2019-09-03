package com.kh.loop.test;

import java.util.Scanner;

public class ForLoopTest {

	Scanner sc = new Scanner(System.in);
	
	
	public void testForLoop() {
		// 반복문
		// 어떠한 문자, 혹은 계산식에
		// 혹은 반복할 수 있는 코드를 직접 작성하지 않고
		// 컴퓨터를 통해 자동화 하여 반복을 수행시키는 문법

		// 1. for 문 @@@@@
		// 2. while 문 @@@@@
		// 3. dowhile 문

		// for 문
		// for(시작할 변수 값 ; 끝 값, 비교할 조건식 ; 반복 횟수(증감식))
		// { 실행할 내용 ... }

		// 1부터 100까지 의 합
		int sum = 0;

		// i = index 순번
		for (int i = 1; i <= 100; i++) {
			sum = sum + 1;
		}

	}

	public void testForLoop2() {
		// For 문의 특징
		// 반복 횟수가 정해져 있을 떄 사용하는 반복문

		// 단순 반복 확인 (기본 형식)

		// for(int i =1 ; i <=10 ; i++){
		// System.out.println(i + "번째 반복 확인");

		// 1 ~ 5 까지 단순 출력

		for (int i = 1; i < 6; i++) {
			System.out.println("i 값 확인 : " + i);
		}
		System.out.println("------------------");

		for (int i = 5; i > 0; i--) {
			System.out.println("i 값 확인 : " + i);
		}

		// 1 ~10 까지의 합
		int result = 0; // 총 합을 담을 수 있는 변수

		for (int i = 1; i < 11; i++) { // i 는 1 ~ 10
			result += i;
		}
		System.out.println("합 : " + result);
	}// 메소드

	public void testForLoopRe() {
		// for 문 :
		// 초기식, 조건식, 증감식으로 이루어진 반복문으로
		// 처음에 초기식으로 시작해서,
		// 한 번의 일처리가 끝나면 증감식으로 올라가
		// 다음 순번의 일을 준비하고 조건식과 비교하여
		// 해당 조건을 만족하면(true) 일을 재차 반복하는
		// --------------------------
		// 반복 횟수가 정해진 반복문

		// 사용 형식
		// for (처음에만 실행하는 내용 ; 언제까지 할건 지 조건 ; 반복횟수 카운트 ){ .... }

		// for ( int = i = 0 ; i < = 10 ; i++ ;) { . . . }
		// 총 0부터 10까지 11번 i를 증가시키며 도는 반복문

		// 1부터 10까지 화면에 출력하기

		for (int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
		}

		// 1부터 10까지의 합
		int sum = 0; // 초기화
						// 밖에서 선언해야

		for (int i = 1; i <= 10; i++) {
			// sum = sum + i;
			sum += i; // 복합 대입 연산자
		}

		System.out.println("sum : " + sum);

		// 10 부터 1 까지
		for (int i = 10; i >= 1; i--) {
			System.out.println("i : " + i);
		}

	}// 메소드

	public void testForLoop3() {
		// for 반복문 활용하기

		// 2 * 1
		// 2 * 2
		// . . .
		// 2 * 9
		// 구구단 2단
	/*
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		// 기본연습
		// 9단
		for (int i = 1; i <= 9; i++) {
			System.out.printf(" 9 * %d = %d \n", i, (9 * i));
		}

		// for 문과 if 문 같이 쓰기
		// 1 부터 10까지 합을 구하되
		// 홀수들의 합만 구하기
		 */
		int sum = 0;
		for(int i = 1 ; i <=10 ; i ++) {
			if(i % 2 != 0) { 
			sum += i ;
			}// if
		}//for
		System.out.println("sum : " + sum);
		
		// ------------------------------------//
		
		// 2부터 100까지 짝수들의 합을 구하되
		// if 문, 삼항 연산자 없이 for 문 만으로 구현하기
		int sum2=0;
		for ( int i = 2 ; i<= 100 ; i = i + 2 ) { // i += 2
			sum2 = i + sum2; // sum2 += i ;
		}
		System.out.println("sum2 = " + sum2);
		
	}// 메소드
	
	public void testForLoop4() {
		// for 응용2
		
		// 정수 하나를 입력 받아
		// 1부터 해당 정수까지의 합을 구하시오.
		// ** 단 , 정수는 양수여야 합니다. ( 입력 시)
		
		/*
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum=0;
		
		for( int i = 1 ; i <= num ; i++) {
			if(num > 0) {
			sum += i;
			}//if
			else {
				return;
			}//else
		}// for
			System.out.println(sum);
		*/

		// 한 자리의 정수를 입력 받아
		// 그 수가 2~9 사이의 정수일 경우
		// 하당 숫자에 맞는 구구단 출력하가
		
		// -- 출력 예시 --
		// 정수 입력 : N
		// ------- N 단 --------
		//	N *1 = ?
		// . . .
		// N * 9 = ?
		
		// 정수 입력 : M
		// 지원하지 않는 정수 입니다.
		
		//int sum1=0;
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		String str = "";
		 /*
		for(int i = 1 ; i <10 ; i++ ) { 
			if( num1 > 1 && num1 < 10) {
				System.out.println(num1+ "*" + i + "=" + (num1*i) );
			}//if
			else {
				System.out.println("지원하지 않는 정수 입니다. ");
				return;
			}//else
			
		}// for 
		*/
		// str 로 해보기
		
		
		if( num1 > 1 && num1 < 10) {
			for(int i = 1 ; i <10 ; i++ ) {
				str = num1 + " * " + i+" = " + (num1*i);
				System.out.println(str);
			}
		}
		else {
			str = "잘못된 입력 입니다";
		}
		
		System.out.println(str);
	
	
	}//메소드 
	
	public void testForLoop5() {
		// while 문으로 구현했던
		// 2~9 까지의 모든 구구단을
		// 중첩 for 문으로 구현하기( 이중 for 문 )
		// i = index >>>>>>>> i j k
			for( int i =2 ;  i < 10 ; i++) {
				
				for ( int j = 1; j <=9 ; j++ ) {
					System.out.println( i + " * " + j  + " = " +  i*j);
				}
				
			}
		
	}//method
	
}// 클래스
