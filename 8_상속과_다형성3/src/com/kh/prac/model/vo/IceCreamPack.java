package com.kh.prac.model.vo;

public interface IceCreamPack {
/*
 * 		인터페이스
 * 		미완성 메소드들만 모아 놓은 클래스
 * 		필드 변수는 반드시 상수만
 * 		메소드는 반드시 미완성 메소드만
 * 
 * 		인터페이스는 클래스를 상속 받을 수 없다.
 * 		why? 클래스는 어떠한 객체를 구현하기 위한 틀이지만
 * 					인터페이스의 경우 미완성 메소드들로만 구성짓기 때문에
 * 					어떠한 객체를 구현할 수 없어서 클래스를 상속 받지 못한다.
 * 
 * 		단, 다른 인터페이스 끼리는 상속이 가능한데,
 * 		이를 extends	 형태로 상속받아 사용한다.
 */
	public static final int SUGAR = 1;
	int WHIPPING = 2;	//	public static final 이 자동으로 붙음 (생략가능)
	int MILK = 2;
	
	public abstract void freeze(int time);
	void eat(); // public abstarct 생략 가능

	
}
