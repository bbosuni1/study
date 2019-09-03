package com.logic.view;

import java.util.Scanner;

import com.logic.controller.Function;

public class Menu {
	// 메뉴 제공 클래스
	
	public static void displayMenu() {
		// 문제 메소드 실행용 객체 등록
		// fn.calcullator(); 이런 방식으로 호출
		
		Function fn = new Function(); // Funtion 클래스 빌려오기
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println(" *** 지역변수 / 연산자 / 제어문 연습 프로그램 ***");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합계 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 입력 : ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : fn.calculator();
				break;
			case 2 : fn.totalCalculator();
				break;
			case 3 : fn.profile();
				break;
			case 4 : fn.sungjuk();
				break;
			case 5 : fn.printStarNumber();
				break;
			case 6 : fn.sumRandomNumber();
				break;
			case 7 : fn.conutinueGugudan();
				break;
			case 8 : fn.shutNumber();
				break;
			case 9 : System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("메뉴로 돌아갑니다."); continue;
			} // switch 끝
			
			System.out.print("메뉴로 돌아가 프로그램을 다시 실행하시겠습니까? (Y/N) : ");
			char stop = sc.next().toUpperCase().charAt(0);
			
			if (stop == 'N') {
				System.out.println("프로그램을 종료합니다."); 
				return;
			}
		}while(true);
		
	}
}
