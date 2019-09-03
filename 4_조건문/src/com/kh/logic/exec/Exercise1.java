package com.kh.logic.exec;

import java.util.Scanner;

public class Exercise1{
	
	Scanner sc = new Scanner(System.in);
	
	public void exercise1() {
		
		//** 문자열은 일반 문자나 기본 자료형들과 다르게
		//		참조 자료형의 형태를 띄기 때문에
		/*		실제 문자열이 가진 값은 해당 문자열의 메모리 안 주소값을 가진다.
		 * 		따라서 Heap 메모리 안에 저장된 주소의 값을 실제 문자열과
		 * 		비교하게 되어 올바른 비교 결과가 나오지 않는다.
		 * 		이를 해결하기 위해 문자열들은 "문자열".equals("비교할 문자열") 이라는 
		 * 		메소드를 별도로 제공한다.
		 */
		
		
		// 과일 이름 입력
		System.out.print("과일을 입력하세요 : ");
		String fruit = sc.next();
		
		if(fruit.contentEquals("사과")) {
			System.out.printf("사과의 가격은 1000원 입니다.", fruit);
		}
		else if(fruit.contentEquals("복숭아")) {
			System.out.printf("복숭아의 가격은 1000원 입니다.", fruit);
		}
		// if 문으로 equals를 사용하여 풀이
		
		
	/*	
		switch(fruit){
		case "사과" : 
			System.out.printf("%s 의 가격은 1000원 입니다.", fruit); break;
		case "바나나" : 
			System.out.printf("%s 의 가격은 3000원 입니다.", fruit); break;
		case "복숭아" : 
			System.out.printf("%s 의 가격은 2000원 입니다.", fruit); break;
		case "키위" : 
			System.out.printf("%s 의 가격은 5000원 입니다.", fruit); break;
		default : 
			System.out.println("없는 과일 입니다.");
		return;
		
		} // 스위치 종료
		*/
	
	} // 메소드 종료

}// 클래스 종료
