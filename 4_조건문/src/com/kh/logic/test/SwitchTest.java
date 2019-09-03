package com.kh.logic.test;

import java.util.Scanner;

public class SwitchTest {
	// Switch 문은 특정 조건문을 작성하는 것이 아니라
	// 조건에 들어가는 문장의 결과 값에 따라 
	// 해당 값과 일치하는 문장을 실행하는 조건문을 이야기 한다.
	// [사용형식]
	// int select = 000;
	// 
	// switch(select){
	//					case 1 : ..... break;
	//					case 2 : ..... break;
	//					case 3 : ..... break;
	//					default : ..... [break;] ( break 생략가능 )  // 생략 가능한 내용은 [] 표기
	// }
	
	Scanner sc = new Scanner(System.in);
	
	public void testSwitchMethod1() {
		// Switch를 활용한 메뉴판 만들기
		
		System.out.println("-- 배고파's 메뉴판 ver 1.0 --");
		System.out.println("1. 파스타");
		System.out.println("2. 비빔국수");
		System.out.println("3. 피자");
		System.out.println("4. 부대찌개");
		System.out.println("5. 봉골레 파스타");
		System.out.println("-----------------------------");
		
		// 1. 안내문구
		System.out.print("메뉴를 골라주세요 : ");
		int select = sc.nextInt();
		
		// switch문을 활용한 메뉴 선택
		
		switch(select) {
		case 1 : // if(select ==1);
			System.out.println("파스타를 선택 하셨습니다."); 
			System.out.println("10,000원 입니다."); //break;
		case 2 : 
			System.out.println("비빔국수를 선택 하셨습니다.");
			System.out.println("7,000원 입니다."); //break;
		case 3 : 
			System.out.println("피자를 선택 하셨습니다."); 
			System.out.println("56,000원 입니다."); //break;
		case 4 : 
			System.out.println("부대찌개를 선택 하셨습니다.");
			System.out.println("10,000원 입니다."); //break;
		case 5 : 
			System.out.println("봉골레 파스타를 선택 하셨습니다.");
			System.out.println("20,000원 입니다."); //break;
		
		default : // else 역할
			System.out.println("해당 메뉴는 없는 메뉴 입니다.");
		
		
		}
		
		
	}
		
	public void testSwitchMethod2() {

		// fall - through 현상
		// switch 에서 각 case 별로 break; 를 사용하지 않으면 자기 자신의 구문을 실행시키고 이어서 다음 구문까지 실행시킨다.
		// 따라서 이러한 현상이 발생하지 않도록 break;를 빼먹지 말아야 한다.
		
		// 혹은 이를 응용한 코드 구현도 가능하다.
		
		// 한 자리의 정수를 입력받아. 
		// 그 수가 짝수인지 홀수인지 나타내는 코드를 만들자
		
		System.out.print("한자리 정수를 입력 : ");
		
		int num = sc.nextInt() % 10 ; // 10으로 나눈 나머지 값은 한자리 정수이기 때문에 % 사용
		
		switch(num) { // 스위치 시작
		
		case 1: case 3 : case 5 : case 7 : case 9 : // case에 true 하더라도 출력할 내용이 없어서 계속 진행
			System.out.println("홀수 입니다."); break; // 내용을 출력하고 종료 없다면 아래로
		
		case 0 : case 2 : case 4 : case 6 : case 8 : 	System.out.println("짝수 입니다."); break;
		
		} // 스위치 종료
		
	}

	public void testSwitchMethod3() {
		// switch를 활용한 학점 계산하기
		
		// 안내문구
		System.out.print("학생의 점수 입력 : ");
		int score = sc.nextInt();
		
		switch(score/10) {
		// switch는 case 뒤에 값이 오는 자리에 
		// 조건식이나 계산식을 비교할 대상으로 절대 사용할 수 없다.
		// ex) ( score >95 ) ------> Error
		
		case 10 : case 9 : 
			System.out.println("A 학점 입니다.");
		break;
		case 8 : 
			System.out.println("B 학점 입니다.");
			break;
		case 7 : 
			System.out.println("C 학점 입니다.");
			break;
		default :
			System.out.println("F 학점 입니다.");
		
		}
		
		
	}

	public void testSwitchMethod4() {
		// switch 조건에 들어갈 수 있는 값은
		// 숫자, 문자 하나, 문자열이 있다.
		// 단, 비교하고자 하는 값과 대상은 모두 같은 자료형이여야 한다.
		
		System.out.println("숫자 계산기 입니다.");
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수행할 연산을 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		int result = 0; // 어떤 값이 들어가는지 모르기 때문에 0으로 초기화
		
		switch(ch) {
		
		case '+' :
			result = num1 + num2; break;
		case '-' :
			result = num1 - num2; break;
		case '*' :
			result = num1 * num2; break;
		case '/' :
			result = num1 /  num2; break;
		case '%' :
			result = num1 % num2; break;
		
		default :
			System.out.println("없는 연산자 입니다.");
			return; // 해당 메소드를 강제 종료하는 명령어
			
		}	//switch 끝
		
	// System.out.println("결과 값은 : " + result + " 입니다.");
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);
	
		
	} // 메소드 끝
} // 클래스 끝
