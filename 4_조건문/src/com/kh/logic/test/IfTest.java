package com.kh.logic.test;

import java.util.Scanner;

public class IfTest {
/*
 *  If 문은 특정 조건을 만족하는 경우
 *  실행할 구문을 구현하는 조건문으로서
 *  하나의 조건에 대하여 여러가지의 경우를
 *  각각 구현해야 할 경우에 사용한다. ( 순서도 : 마름모 ; 판단 )
 */
	
	public void testIfMethod() {
		// 기본적인 if문
		// 나이를 입력받아 19세 이상일 경우 "성인입니다." 이하일 경우 "미성년자 입니다." 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if( age > 18 ) {
			System.out.println("성인 입니다.");
		}
		else {
			System.out.println("미성년자 입니다.");
		}
		 
		
		
	}
	
	public void testIfMethod2() {
		// 조건에 따른 결과가 3개 이상일 경우
		// 국어, 영어, 수학 점수를 입력받아 평균에 따른 학점을 출력하는 프로그램
		
		// - 기준 -
		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 평균이 60점 미만이면 F
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat;
		double avg;
	
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		avg = (kor+eng+mat)/3;
		String grade = ""; 				// ** grade 를 "" 사용하여 빈칸으로 두어야 예측할 수 없는 값이 나올때 오류가 없다.
														// String grade 만 사용하면 else 조건이 없을때 오류가 나는 모습을 확인 가능.
		
		if(avg > 89) {
			grade = "A";
			}
		else if (avg > 79) {
			grade = "B";
		}
		else if (avg > 69) {
			grade = "C";
		}
		else if (avg > 59) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		// System.out.println("당신의 등급은 : " + grade + "입니다");
			System.out.printf("당신의 등급은 : %s 입니다", grade);
		
	}

	public void testIfMethod3() {
		// if문 활용하여 메뉴판 만들기
		// 음식점
		
		// 1. 메뉴판 출력하기
		System.out.println("--- 배고파's 음식점 ver 1.0 ---");
		System.out.println("1. 무말랭이");
		System.out.println("2. 오므라이스");
		System.out.println("3. 수제비");
		System.out.println("4. 짬뽕");
		System.out.println("5. 파전");
		System.out.println("-------------------------------");
	
		// 2. 사용자에게 메뉴 고르게 하기
		
		System.out.print("원하는 메뉴를 골라 주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt();
		
		if (select == 1 ) {
			System.out.println("무말랭이를 선택 하셨습니다.");
			System.out.println("가격은 34,000원 입니다.(2인 이상)");
		}
		else if(select == 2 ) {
			System.out.println("오무라이스를 선택 하셨습니다.");
			System.out.println("가격은 7,000원 입니다. (단일 메뉴)");	
		}
		else if(select == 3 ) {
			System.out.println("수제비를 선택 하셨습니다.");
			System.out.println("가격은 5,000원 입니다. (4인 메뉴)");	
		}
		else if(select == 4 ) {
			System.out.println("짬뽕을 선택 하셨습니다.");
			System.out.println("가격은 10,000원 입니다. (품절)");	
		}
		else if(select == 5 ) {
			System.out.println("파전을 선택 하셨습니다.");
			System.out.println("가격은 11,000원 입니다. (막걸리 필수)");	
		}
		else {
			System.out.println("잘못된 선택이군요.");
			System.out.println("나가세요.");
		}
		
		
	
	
	
	}

	public void testIfMethod4() {
		// 다중 If 문
		// if 안의 if 문을 선언하여
		// 조건을 세분화 할 수 있다.
		
		// 학생의 점수를	입력받아 
		// 90 점 이상이면 A ---- 95점 이상이면 A+
		// 80 점 이상이면 B ---- 85점 이상이면 B+
		// 70 점 이상이면 C ---- 75점 이상이면 C+
		// 70점 미만이면 F
		//** 각 점수가 F 학점 이상이고 
		//		5점 이상이면 '+' 추가하기
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("학생 점수 입력 : ");
		score = sc.nextInt();
		
		String grade = "";
		
		if (score > 89) {
			grade = "A";
				if(score > 94) {
					grade += '+';
			}
		}
		
		else if(score>79) {
			grade = "B";
			if(score > 84) {
				grade += '+';
			}
		}
			else if(score>69) {
				grade = "C";
				if(score > 74) grade += '+'; // if문이 한줄 짜리면 {}를 사용하지 않아도 괜찮다.
				
		}
			else {
				grade = "F";
		}
		
		System.out.printf("당신의 학점은 : %s 입니다.",grade);
		
		
		
		
	}

}
