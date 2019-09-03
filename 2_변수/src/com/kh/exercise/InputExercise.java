package com.kh.exercise;

import java.util.Scanner;

public class InputExercise {
	// 변수에 값을 입력하는 실습 클래

	public void exercise1() {
		/* 1. 서에서 책의 정보를 입력하여 화면에 출력하는 프로그램 만들
		 입력할 정보 : 
		책 제목 , 책의 저자, 책 가격, 할인율, 
		출력할 정보 : 
		책 제목 : 000
		... 
	
		*/
		
		Scanner sc = new Scanner(System.in); // System.in = 키보드
		
		// ----- 입력 부 ----- //
		
		System.out.print("책의 제목을 입력하세요 :  "); // 안내 메시
		String name = sc.nextLine(); // 키보드로 엔터를 입력할 때 까지 값을 받는 메소드 --> 입력 받은 값을 변수로 선언
		
		System.out.print("책의 저자를 입력하세요 : ");
		String writer = sc.nextLine();
		
		System.out.print("책의 가격을 입력하세요 :  ");
		int price = sc.nextInt(); 		// 키보드로 숫자를 입력 받는 메소

		System.out.print("책의 할인율 입력하세요 : ");
		double sale = sc.nextDouble(); 
		
		// ----- 출력 부 -----//
		
		System.out.printf("책의 제목 : %s \n", name);
		//System.out.println("책의 제목 :" + name);
		System.out.println("책의 저자 : " + writer);
		System.out.println("책의 가격 : " + price + "₩");
		System.out.printf("책의 할인율 : %.2f %%", sale);
		// System.out.printf() ----> 특정 형식을 미리 만들어 놓고 해당 혀식으로 보여주기 위해 변수를 추가하는 메소
		
	}

	public void exercise2() {
		// 두개의 정수를 입력받아
		// +, -, *, /, % 연산 수행하여
		// 결과 확인하
		
		// 1. 두개의 정수를 입력 받아라
		Scanner sc = new Scanner(System.in);
		
		// 2. 두개의 정수 입력하기
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 3.  결과 계산을 화면에 출력하기
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		System.out.println("나머지 확인 : " + (num1 % num2));

	
	}
	
	public void exercise3() {
		// 가로, 세로 값을 실수형으로 입력 받아
		// 사각형의 면적과 둘레를 계산하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이를 입력하시오 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로의 길이를 입력하시오 : ");
		double length = sc.nextDouble();
		
		System.out.println("사각형의 면적은 : " + (width * length)+ " 입니다");
		System.out.println("사각형의 둘레는 : " + ((width + length)*2)+ " 입니다");
		
	}
	
	public void exercise4() {
	// 영단어 하나(	5글자 이상)를 입력 받아
	// 첫번째 부터 세번째 단어를 하나식 출
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("영단어를 입력해 주세요(5글자 이상) : ");	
	String word = sc.nextLine();
	
	System.out.println("첫번째 영단어 : " + word.charAt(0));	
	
	System.out.println("두번째 영단어 : " + word.charAt(1));
	
	System.out.println("세번째 영단어 : " + word.charAt(2));
	
	}
}
