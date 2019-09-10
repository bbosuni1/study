package com.kh.mathTest;

public class MathTest {

	public static void main(String[] args) {
		// 수학적 계산을 돕는 클래스
		
		double num = 1.5;
		
		System.out.println("num : "+num);
		System.out.println("반올림 : " + Math.round(num));
		System.out.println("올림 : " + Math.ceil(num));
		System.out.println("내림 : " + Math.floor(num));

		// 12.345 를 소수점 둘째자리에서 반올림.
		double num2 = 12.345;
		System.out.println(Math.round(num2*10) / 10.0);
		
		// 제곱수 다루기
		int num3 = 5;
		
		System.out.println(Math.pow(num3, 3));
		
	}

}
