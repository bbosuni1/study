package com.kh.op.test;

public class 산술연산자 {
	// 일반적인 사칙 연산에 쓰이는 연산자 그룹
	// +, -, *, /, %
	
	public void testMethod() {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		System.out.println("나누기 한 몫 : " + (num1 / num2));
		System.out.println("나머지 값 : " + (num1 % num2));
		
		//--------------------------------------------//
		// ** 주의사항 ** //
		// 1. 문자 하나와 숫자를 연산할 경우, 문자는 숫자로 변한다.
		// 2. 문자열과 숫자를 연산할 경우, 숫자는 문자열로 변한다.
		
		System.out.println(10 + 'A');
		
		System.out.println("10"+ 'A');
		
		System.out.println("10" + 20);
		
		System.out.println(10 + 20 + "_test_");
		
	}
}
