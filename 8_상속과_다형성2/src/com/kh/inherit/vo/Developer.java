package com.kh.inherit.vo;

public class Developer extends Person {
	// 1. 필드 변수
	
	// 2. 생성자
	public Developer() {
		super(); // 부모의 기본 생성자를 호출한다. ( 생략 가능)
		
	}

	public Developer(String name, int age, String comp, String hobby) {
		super(name, age, comp, hobby);
		// 부모 클래스가 가진 사용자 정의 생성자도 호출이 가능하다.
	}
	
	// 3. 메소드 
	
	// 오버로딩 (OverLoading)
	// 하나의 클래스 안에 같은 이름을 가지는 메소드를 
	// 여러개 만들고자 할 경우 사용하는 기술
	
	// 일반적으로 메소드는 주어진 매개변수를 사용하여
	// 정해진 코드를 실행하는 기능 제공 메소드 이다.
	// 하지만 동일한 역할을 수행하는 메소드라면 
	// ex) 1 + 10 메소드 // 1.0 + 12.5 메소드 ====> 자료형이 다름
	// 같은 이름을 사용할 수 있도록 여러 상황을 고려한
	// 메소드 이름 짓기를 제공해야 한다.
	
	public void workTime( int time ) {
		System.out.println(time + " 시간 일했습니다.");
	}
	public void workTime( double time ) {
		System.out.println(time + " 시간 일했습니다.");
	}

	// --- 실용 사례 ---
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public double sum( double num1, double num2) {
		return num1 + num2;
	}
	public double sum( int num1, double num2) {
		return num1 + num2;
	}
	public double sum(double num1 , int num2) {
		return num1 + num2;
	}
	
	public void test() {
		sum(1, 10);
		sum(1.5 ,10);
		sum(10, 5.5);
		sum(1.3,1.8);
	}
	
	// 오버로딩이 선언되기 위한 규칙
	// 1. 메소드 이름이 반드시 같아야 한다.
	// 2. 매개 변수의 개수나 자료형, 매개 변수의 순서가 반드시 달라야 한다.
	// 3. 반환 자료형 , 접근제한자가 오버로딩 조건에 포함되지 않는다.
	// 	즉, 오버로딩과는 상관이 없다.
	
	// 안되는 사레 3가지
	public void test1(int num1) 	{}
	
	// 1. 매개 변수도 같고 메소드 명도 같을 때...
	//public void test1(int num1) {} 중복명 불가
	
	// 2. 반환 자료형만 다를 경우
	//	public int test1(int num1) {
	//		return num1;
	//	}
	
	// 3. 접근 제한자가 다를 경우
	// private void test1(int num1) {}
	
	
	
}//class
