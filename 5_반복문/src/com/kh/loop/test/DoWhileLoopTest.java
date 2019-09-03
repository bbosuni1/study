package com.kh.loop.test;

import java.util.Scanner;

public class DoWhileLoopTest {

	Scanner sc = new Scanner(System.in);
	
	public void testMethod() {
		
		// 기존의 while 문은 실행하는 조건이 true, false 에 따라
		// 실행이 절대 되지 않는 경우도 발생한다
		// 하지만 DoWhile은 처음 한번은 무조건 실행
		
		// while
		
		int num = 5;
	
		/*
		while( num < 5 ) {
			System.out.println("실행 확인 ! ");
		}
		*/
		do{
			System.out.println("실행 확인 ! ");
		}while(num<5);
		
	} //method
	
	public void testMethod2() {
		
		// 문자열을 입력할 시 
		// 해당 내용을 화면에 출력하되
		// 만약 'exit' 이라는 문자열을 입력했을 땐
		// 프로그램을 종료하기
		
		String msg = null ;
		// 'null'은 컴퓨터 상에서 아무것도 없는 빈 공간을 의미한다.
		// heap  메모리에 값이 저장된다
		// 이 값이 저장되며 해당 값의 주소를 String의 변수이게 돌려주는데
		// 만약 값을 저장하지 않아 돌려줄 주소가 없다면 
		// null을 보내게 된다.
		
	
		
		do {	
			
			System.out.print("문자를 입력하셈 : ");
		msg = sc.next();
			
			if( msg.equals("exit")) {
				System.out.println("장비를 정지합니다.");
			}
			else{
				System.out.println("입력한 문자열 : " + msg);
			}
			
		}while(!msg.equals("exit")) ;
		
				
	}//method
	
} //class
