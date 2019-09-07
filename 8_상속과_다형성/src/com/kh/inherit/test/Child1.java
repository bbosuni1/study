package com.kh.inherit.test;

public class Child1 extends Parents {

	// 자식 클래스는 부모 클래스에서 상속받은
	// 메소드와 똑같은 메소드나 필드 변수를 만들 수 있다.
	
	// 부모와 같은 메소드 이름으로 기능 메소드를 선언할 때에는
	// @Override 라는 이노테이션을 달아 준다.
	// @(어노테이션)은 jvm이 기계언어로 (.class)로 컴파일 할 때
	// 해당 코드를 어떻게 처리해라 라고 가이드 해주기 위한 명령어이다.
	
	@Override
	public void printStr() {
		System.out.println("나는 자식1");
	}

	public void printStr2() {
		System.out.println("나는 자식 클래스 입니다.");
	}
	
}
