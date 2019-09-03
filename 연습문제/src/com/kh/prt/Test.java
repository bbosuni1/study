package com.kh.prt;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	Scanner sc = new Scanner(System.in);
	
	public void testMethod1() {
		// 문자열 한개 입력 받아
		// 총 10번 반복 하여 해당 문자열을 화면에 출력
		
		String str = null;
		int i = 1;
		
		System.out.print("문자를 입력하세요 : " );
		str = sc.next();
		
		while( i <=10 ) {
		System.out.println("입력하신 문자는 : "+str);
			i++;
		}
		
	}
	
	public void testMethod2() {
		// 정수 한개를 입력 받아, 1부터 입력 받은 정수까지의 합을 출력
		int sum = 0;
		int num;
		
		System.out.print("정수를 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			
			sum += i;
			
		}
		System.out.println("총 합 : " + sum);
		
	}
	
	public void testMethod3() {
		// 정수 한개를 입력 받아
		// 1부터 입력 받은 정수까지의 짝수의 합을 출력
		
		int sum = 0;
		int num;
		
		System.out.print("정수를 입력해라 : ");
		num = sc.nextInt();
		
		for( int i =1 ; i <= num ; i ++ ) {
			if(i % 2 == 0){
				sum += i;
			} //if
		}// for
		System.out.println("sum : " + sum);
		
	}// method

	public void testMethod4() {
		
		int sum = 0;
		int num ;
		int i = 1;
		System.out.print("정수를 입력해라 : ");
		num = sc.nextInt();
		
		while( i <= num ) {
			
			if(i % 2 == 0) {
				sum += i;

			} //if
			i++;
		} //while
		System.out.println("sum : "+ sum);
		
	} // method

	public void testMethod5() {
		// 정수를 입력받아 1부터 입력 받은 정수까지의 수를 홀수와 짝수로 구분하여
		// 홀수면 "수" . 짝수면 "박"을 반복하여 출력하시오.

		int num;
		String str = null;
		
		System.out.print("정수를 입력해 : ");
		num = sc.nextInt();
		
		for ( int i = 1 ; i <= num ; i ++) {
			if( i % 2 == 0) {
				str = "박";
			}//if
			else {
				str = "수";
			}//else	
			System.out.print(str);
		}// for
	
	
	}

	public void testMethod6() {
		// 정수 한개를 입력 받아, 1부터 입력 받은 정수까지의 짝수의 합을 출력
		// for, 분기문
		int num;
		int sum = 0;
		System.out.print("정수를 입력해 : ");
		num = sc.nextInt();
		for (int i = 1 ; i < num ; i++) {
		
			if(i % 2 == 1) continue;
		
			sum += i;
		}//for
		
		System.out.println("sum : " + sum);
		
		
	}

	public void testMethod7() {
		// 1 ~ 100 사이의 임의의 난수를 발생시키고, 정수 한 개를 입력 받아
		// 난수가 입력 받은 정수보다 작으면 "입력하신 정수보다 작습니다." 출력
		// 난수가 입력 받은 정수보다 크면 "입력하신 정수보다 큽니다." 출력
		
		//
		
		// 랜덤 변수 유틸 사용
		Random rnd = new Random();
		// 랜덤 변수 뽑기
		
		int num1 = rnd.nextInt(100)+1;
		int num2 = 0;
		
		System.out.println(num1); // 랜덤 변수 확인용
		
		// 조건
		do {
			for( int i =1 ; ; i++) {
				System.out.print("정수를 입력하시오 : ");
				num2 = sc.nextInt();
					if ( num1  < num2 ) {
						System.out.println("난수는 입력하신 정수보다 작습니다.");
					}//if
					else if( num1 > num2) {
						System.out.println("난수는 입력하신 정수보다 큽니다.");
					}//else if
					else {
						System.out.println("정답 입니다. " + i +"회 만에 정답을 맞추었습니다.");
						return;
					}
			} //for
		}while(num1 != num2);
		
		
	} // method
}// class
