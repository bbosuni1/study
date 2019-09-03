package com.kh.cast.practice;

import java.util.Scanner;

public class CastingSample {
	
	public void printUniCode() {
		// 키보드로 문자하나를 입력받아, 
		// 그 문자의 유니코드를 출력되게 함
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자를 입력하세요 : ");
	String text = sc.next();
	int code = text.charAt(0);
	
	System.out.print("문자의 유니코드는 : "+ code + " 입니다.");
	
	
		
	}

	public void calculatorScore() {
		 //실수형으로 국어, 영어, 수학 세 과목의 점수를 
		 // 입력받아 총점과 평균을 계산해서 출력함
		 //  - 총점과 평균은 정수형으로 처리함
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 점수를 입력하세요 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 점수를 입력하세요 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor+eng+math);
		int avg = (int)(kor+eng+math)/3;
		
		System.out.println("총점 : " + sum + "입니다.");
		System.out.println("평균 : " + avg+ "입니다.");
		
		
	
	}
	
}
