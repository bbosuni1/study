package com.kh.op.test;

import java.util.Scanner;

public class 삼항연산자 {
	// 비교 항목이 3개인 연산자를 말함
	// (조건 식) ? " 참일 때 값 " : " 거짓일 떄 값"
	// 조건식은 비교 연산자 등과 같이 결과가 반드시 true / false 로 나오는 식을 사용
	// 해당 값에 따른 결과를 선택하고자 할 때 사용 한다
	
	
	public void testMethod() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		// 삼항 연산자를 혼자 썼을 때
		// String result = (num > 0) ? "양수 입니다." : "음수 입니다.";
		
		// 삼항연산자 중첩 사용
		
		String result = (num >0 ) ? "양수 입니다." : ((num == 0) ? "0 입니다." : "음수 입니다.");
		
		System.out.println("결과 확인 : " + result);
		
		
		
	}
}
