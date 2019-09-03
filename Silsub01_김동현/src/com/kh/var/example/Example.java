package com.kh.var.example;

import java.util.Scanner;

public class Example {

	public void example1() {
		// 본인의 신상 정보를 변수에 기록
		// 기록된 정보 출력 처리
		// 이름, 나이, 키(소수점 아래 첫째자리) , 몸무게(소숫점 아래 첫), 성별(M/F), 전화번호, 메일
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 하시오 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력 하시오 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력 하시오 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 하시오 : ");
		double weight = sc.nextDouble();
		System.out.print("성별을 입력 하시오(M/F) : ");
		char sex = sc.next().charAt(0);
		
		sc.nextLine();
		
		System.out.print("전화번호를 입력 하시오 : ");
		String tell = sc.nextLine();
		System.out.print("메일을 입력 하시오 : ");
		String mail = sc.nextLine();
		
		System.out.println("이름은 : " + name + " 입니다" );
		System.out.println("나이는 : " + age+ " 입니다" );
		System.out.println("키는 : " + height + " 입니다" );
		System.out.println("몸무게는 : " + weight + " 입니다" );
		System.out.println("성별은 : " + sex + " 입니다" );
		System.out.println("전화번호는 : " + tell + " 입니다" );
		System.out.println("메일은 : " + mail + " 입니다" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void example2() {
		// 정수 두 개를 입력받아 , 두 수의 합 , 차, 곱, 나누기 한 몫과 나머지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합은 : " + num1 + num2);
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱: " + (num1 * num2));
		System.out.println("두 수를 나누면 : " + (num1 / num2) + " 입니다.");
		System.out.println("나머지 값은 : " + (num1 % num2) + " 입니다.");
		
		
		
		
	}

	public void example3() {
		//	가로, 세로 값을 실수형으로 입력받아
		// 사각형의 면적과 둘레를 계산하여 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 값을 입력 하세요 : ");
		double width = sc.nextDouble();
		System.out.print("세로 값을 입력 하세요 : ");
		double length = sc.nextDouble();
		
		System.out.println("사각형의 면적은 : " + (width * length) +" 입니다" );
		System.out.println("사각형의 둘레는 : " + ((width + length)*2) +" 입니다" );
		
		
		
		
	}

	public void example4() {
		// 영어 문자열 값을 키보드로 입력받아
		// 각 자리의 문자를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 단어를 입력해 주세요 : ");
		String eng = sc.nextLine();
		
		System.out.println("첫번째 단어는 : " + eng.charAt(0) + " 입니다");
		System.out.println("두번째 단어는 : " + eng.charAt(1) + " 입니다");
		System.out.println("세번째 단어는 : " + eng.charAt(2) + " 입니다");
		
	}
}
