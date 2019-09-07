package com.kh.inter;

import java.io.Serializable;

// 인터페이스
// 추상 메소드들과 공용으로 사용할 상수들 만을 묶은 클래스
// 필드 변수는 무조건 상수만을 선언해야 하며
// 메소드는 무조건 미완성 메소드로 만들어야 한다.

// 인터페이스는 클래스를 상속 받을 수 없다.
// 미완성된 인터페이스 끼리만 상속이 가능하다.
 
public interface IProduct extends Serializable{
	// 인터페이스 필드 상수
	// 인터페이스의 상수는 public static final 형태로
	// 공용 상수의 목적을 지니기 때문에 앞의 예약어들을 생략할 경우 
	// 자동으로 public static final이 붙는다.
	
	public static final int NUM = 100;
	double PI = 3.14; // final static 생략
	
	// 인터페이스의 메소드 선언
	// 메소드는 public abstract 가 기본이며
	// 만약 예약어가 붙지 않는 경우 
	// 자동으로 public abstract가 생략되어 붙는다
	
	public abstract void abstMethod1();
	
	void abstMethod2();
}
