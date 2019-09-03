package com.kh.silsub3.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		
		//	외부 반복문이 1회 반복 하는동안
		// 내부 반복문은 조건만큼 반복하고 초기화
		// 외부 반복문이 2회로 넘어가고
		// 내부 반복문은 또다시 조건 만큼 반복한다.
		
		
		// 정수 하나 입력받기
		// if 문 과 2중 for 문
		System.out.print("정수를 입력 하시오 : ");
		int num = sc.nextInt();
		if(num > 0) {
		for ( int i = 1 ; i <= num ; i++) {
			
			for(int i2 = 2 ; i2 <= i; i2++){
					System.out.print("*"); // * 출력 i2=2 로 시작하여 첫번째 별 생략
			} // for2
				System.out.printf("%d \n", i); // 줄내리기 + 숫자 출력
			
			}// for1
		}//if	
		else {
			System.out.print("입력하신 정수는 양수가 아닙니다.");
		}//else
	}//method

	public void printStar2() {
		// 정수 하나 입력받기
		// if 문 과 2중 for 문
		System.out.print("정수를 입력 하시오 : ");
		int num = sc.nextInt();
		if(num > 0) { //		양수
		for ( int i = 1 ; i <= num ; i++) {
			
			for(int i2 = 1 ; i2 <= i; i2++){
					System.out.print("*"); 
			} // for2
				System.out.print(" \n");
			}// for1
		}//if	
		else if(num < 0) { // 	음수
			
			for ( int i = 0 ; i <= Math.abs(num) ; i++) { // Math.abs() 라는 기능을 사용하여 절대값으로 변환
				
				for(int i2 = i ; i2 < Math.abs(num)  ; i2++){ // 내부 i2를 i와 같게 두어 i2가 i와 같아 질때까지 *을 출력하게 
					System.out.print("*");
				} // for2
			
			// 생각 정리	
			//num = 3 일때
			// i = 0 -----> i2 = 0, i2 = 1, i2=2 일때 까지 내부 반복 함으로 *** 출력
			// 외부로 돌아가 i++
			// i = 1 _____> i2 = 1, i2 = 2 까지 내부 반복 ** 출력
			// ...
				
					System.out.print(" \n");
				}// for1
		}//else if
		else {	//			0 입력
			System.out.print("출력 기능이 없습니다.");
		}
		
		
	}// method

	public void selectMenu() {
		// 메뉴판 출력
		System.out.println("햄버거 ******************");
		System.out.println("1. 불고기 버거		3500원");
		System.out.println("2. 치킨 버거		3200원");
		
		System.out.println("추가 ********************");
		System.out.println("3. 감자튀김		1000원");
		System.out.println("4. 치즈스틱		  400원");
		System.out.println("5. 셀러드			  400원");
		
		System.out.println("음료수 ******************");
		System.out.println("6. 콜라			  700원");
		System.out.println("7. 에이드			1200원");
		System.out.println("8. 커피			1000원");
		System.out.println("*************************");

						// 사용할 변수 선언 및 초기화
						int select = 0; // 메뉴에 지정된 번호 switch 에서 사용
						String select2 = "" ; // 메뉴 이름 저장
						int price = 0; // 메뉴 가격 저장
						int totalprice = 0 ; // 선택한 단품메뉴 가격합
						char add; // 추가주문 y or n
						int amount = 0; // 수량
						String totalselect = ""; //선택한 모든 메뉴
						int finalprice = 0; // 종 지불비용
						
						
						// 메뉴 선택 확인
			
				do{
						System.out.print("메뉴를 선택하세요 : ");
						select = sc.nextInt(); // 메뉴 선택 저장
						
						switch(select){ // switch 사용하여 메뉴 선택
						case 1 :	
										select2 = "불고기 버거";
										price = 3500;	break;
						case 2 :	
										select2 = "치킨 버거";
										price = 3200;	break;
						case 3 :	
										select2 = "감자튀김";
										price = 1000;	break;
						case 4 :	
										select2 = "치즈스틱";
										price = 400;	break;
						case 5 :	
										select2 = "샐러드";
										price = 400;	break;
						case 6 :	
										select2 = "콜라";
										price = 700;	break;
						case 7 :	
										select2 = "에이드";
										price = 1200;	break;
						case 8 :	
										select2 = "커피";
										price = 1000;	break;
						}// switch end
						
						System.out.println(select2 + " 를 선택 하셨습니다." );
						
						//수량 주문 출력
						System.out.print("수량을 선택하세요 : ");
						amount = sc.nextInt(); // 수량 저장
					
						totalprice = (price * amount); // 가격 합 저장;
						
						//************************* 문자열도 연산으로 가능하다**********************//
						
						totalselect += select2 + " : " + amount + " 개 - " + totalprice + " 원 \n" ; // 선택 메뉴 수량 가격 출력 
						
						finalprice += totalprice; // 최종 지불 가격

						// 추가 주문
						System.out.print("추가 주문을 하시겠습니까(Y/N) : "); 
						add = sc.next().toUpperCase().charAt(0); // y/n 문자로 추출 및 대문자 변환 
						
						if( add == 'N' ) break; // break 으로 루프탈출
						
				}while(true);//Dowhile 끝 true 로 무한루프
				
				// 최종 출력부
				System.out.println("-----------------------");
				System.out.print(totalselect);
				System.out.println("-----------------------");
				System.out.print("총 가격 : " + finalprice + "원");
				
		
	}// method

	public void countInputCharacter() {
		// 변수 선언 및 초기화
		
		String str = ""; // 문자열
		char ch; // 문자
		int count=0; // 겹치는 숫자 카운트
		
		// 문자열 입력
		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();
		System.out.print("문자를 입력하세요 : ");
		ch = sc.next().charAt(0);
		int i2 = str.length(); // length() 를 사용 하여 문자열 길이 판단
		
		// 강사님 풀이법 : 참 거짓 판별을 위한 boolean 변수 정의 하고 활용
		/*
		 boolean check = true; // 영문자 확인용 참 거짓 변수
		
		System.out.print("문자열 입력  : ");
		String str = sc.next();
		
		for(int i = 0; i < str.length() ; i++) {
			char alphabet = str.charAt(i);
			if((alphabet < 'A' || alphabet > 'Z') &&
				alphabet < 'a' || alphabet > 'z') {
				check = !check;
				break;
					}
		}
		
		if(check) {
			System.out.print("문자 하나 입력 : ");
			char ch = sc.next().charAt(0);
			
			int cnt = 0; // 문자 개수 체크용 변수
			
			for(int i = 0; i < str.length() ; i++) {
				if(str.charAt(i) == ch) cnt++;
			}
			
			System.out.printf("포함된 갯수 : %d 개\n", cnt);
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		 */
		
		
			for ( int i = 0 ; i < i2  ; i++) {

				// str.charAt(i) 를 사용하여 각 자리의 문자를 뽑아내고  조건문 과 && 사용하여 알파벳 구간내에서 확인
					if(str.charAt(i) >= 65 && str.charAt(i) <= 122 ) { // 알바벳의 유니코드 범위 65 ~ 122
						
							if(ch == str.charAt(i)) {
								count++; // ch 와 str 문자열을 비교 하고 같을 경우 숫자 카운트
							}
							else {
								continue; // 같지 않을 경우 반복문 처음으로
							}
					} // if 문 끝
					else {
						System.out.println("********************************");
						System.out.println("입력하신 문자열 : " + str);
						System.out.println("영문자가 아닙니다.");
						System.out.println("********************************");
						return; // 영문자 아닐경우 프로그램 종료
					}//else 끝
		} //for end
			
		// 최종 출력
		System.out.println("********************************");	
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 문자 : " + ch);
		System.out.println("같은 문자 : " + count);		
		System.out.println("********************************");
		
} //method

	public void test() {
		// 연습
		
		// 문자열 연산
		String str = "";
		String str2 = "zz";
		for( int i =1 ; i < 10 ; i++) {
			str += str2+i+"\n";
		}
		System.out.print(str);

		// 절대값 명령어 Math.abs()
		System.out.print(Math.abs(-4));
		
		
	}

}// class
