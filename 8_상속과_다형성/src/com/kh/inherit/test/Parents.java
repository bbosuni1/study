package com.kh.inherit.test;

/*
 * 상속
 * OOP( 객체 지향 언어) 의 특징 중 하나로
 * 기존의 클래스를 부모(super), 자식 (sub) 클래스로 나누어 
 * 하나의 클래스로 여러 클래스의 기능을 재사용 할 수 있게 해주는 기술을 말한다.
 * 
 *  - 자식 클래스는 부모의 모든 필드 변수와 메소드를 상속받는다.
 *  ** 단, 생성자와 초기화 블럭은 상속받지 않는다.
 *  
 *  - 자식의 필드 변수 갯수는 부모보다 절대 작을 수 없다.
 *  
 *  ** 사용 형식 **
 *  public class 자식클래스명 extends 부모클래스명{}
 */
public class Parents {
	private int num1;
	private String str1;
	
	public Parents() {
		num1 = 10;
		str1 = "hello";
	}
	
	public void printStr() {
		System.out.println(str1);
	}
	
	public void setNUm1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
}
