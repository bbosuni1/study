package com.kh.excep.myExcep;

public class MyException extends Exception {
	// 내가 만든 전용 예외 처리를 하고자 할 경우
	// 반드시 Exception 클래스를 상속 받아야 한다.
	
	// 기본 생성자
	public MyException() {}
	
	// 사용자 정의 생성자
	public MyException(String msg) {
		// 내가 정의할 때 주는 메시지를 부모 생성자로
		// 넘겨 원하는 예외 내용을 출력할 수 있다.
		
		super(msg); // 부모(Exception)
	}
	
}
