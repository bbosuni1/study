package com.kh.op.test;

public class 증감연산자 {
	// ++ : +1의 의미를 지닌 연산자
	// -- : -1 의 의미를 지닌 연산자
	
	// 단일로 사용할 경우 값 자체 증가(감소)의 의미를 지니고,
	// 어느 위치에서 (++a / a++) 연산을 수행해도 같은 결과가 나온다
	// int a = 10;
	// int b = ++a;
	// ++a;
	
	public void testMethod1() {
		int num = 100;
		
		System.out.println("현재 num의 숫자는 ? : " + num);
		
		++num; // 전위연산자
		System.out.println("현재 num의 숫자는 ? : " + num);
		
		num++; // 후위 연산자
		System.out.println("현재 num의 숫자는 ? : "+ num);
		
		--num;
		System.out.println("현재 num의 숫자는 ? : " + num);
		
		num--;
		System.out.println("현재 num의 숫자는 ? : " + num);
		
		
	}
	
	
	public void testMethod2() {
		// 다른 연산이 연관될 경우의 증감 연산자
		
		int num = 10;
		
		int result1 = num++ + 3; // result의 결과 값은 연산자가 없을때 그대로 이지만 num 자체 값은 +1이 된다.
		
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		int num2 = 10;
		int result2 = ++num2 + 3; // num에 +값이 먼저 처리되었다.
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		

	}
}
