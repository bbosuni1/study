package com.kh.op.test;

public class 복합대입연산자 {

	// 다른 사칙 연산과 대입 연산자를 함께 사용하는 연산자
	// 산술 대입 연산자 : +=, -=, *=.....
	// 메모리에 직접 연산을 거치기 때문에 처리 속도가 상대적으로 빠름
	
	public void testMethod() {
		/*
		 *  += : 왼쪽과 오른쪽의 값을 더한 후 왼쪽의 공간에 다시 대입하는 연산자
		 *  -= : 왼쪽과 오른쪽의 값을 뺀 후 
		 *  *= : 왼쪽과 오른쪽의 값을 곱한 후 
		 *  /= : 왼쪽과 오른쪽의 값을 나눈 후
		 *  %= : 나머지 값을 왼쪽 공간에 대
		 */
		
		int num = 10, result;
		
		System.out.println("num : " + num); // 10
		
		// num 값에 3 더하기
		num = num +3;
		
		System.out.println("num : " + num); // 13
		
		
		// 복합대입 연산자
		num += 3;
		
		System.out.println("num : " + num); // 16
		
		num -= 3;
		
		System.out.println("num : " + num);
		
		num *= 2;
		System.out.println("num : " + num);
		
		num /= 2; 
		System.out.println("num : " + num);
		
		
		
	}
}
