package com.kh.field;

public class FieldTest {
	// 필드 연습용 클래스
	
	// static, final
	// static, 공유 용도로 사용하는 예약어
	// static 예약어는 공유의 목적으로 사용하기 때문에
	// 기본 캡슐화 원칙에는 위배된다.
	// 또한 프로그램 실행시에 전부 정적 메모리(static)에
	// 저장되기 때문에, 특별한 목적 이외에는 사용을 지양한다. ( 많이 사용하지 않는다)
	
	public static int num1;
	
	// final : 상수 선언 시 사용하는 예약어
	// 최초 선언 시 값을 1번 등록할 경우 그 이후로는
	// 값이 절대 바뀌지 않는 변수를 선언하고자 할 때 사용하며,
	// 만약 초기화 값을 처음에 등록하지 않으면
	// jvm이 명시한 초기값으로 들어가면서 상수가 되어 버리기 때문에
	// 반드시 초기값을 등록해야 한다.
	
	public final int FINAL_NUM = 10;
	
	//  일반적으로 상수를 선언할 때 공유 용도의
	// 사용목적도 함께 가지기 때문에 이 둘을 함께 붙여 사용한다.
	
	public static final double PI = 3.14;
	// public final static double PI = 3.14;
	// final 과 static의 순서가 바뀌어도 상관없다.
	
	// 접근 제한자
	// private(-) < default(~) < protected(#) < public(+)
	// 해당 클래스 해당패키지 패키지+자식 클래스 모두(단, import필요)
	
	private int test1; // 기본 접근 제한자(캡슐화)
	
	int test2;
	
	protected int test3;
	
	public int test4;
	
	// non-static method
	// 객체가 생성되어야만 접근이 가능한 메소드( 객체 안에 속한 메소드 )
	public void testField1() {
	
		// 지역 변수들은 stack 이라는 메모리 공간에 저장되기 때문에
		// static 예약어를 붙일 수 없다.
		// static int num2 = 100;
		
	}
	
	// static method
	// 별도의 객체 생성 없이도 프로그램 실행 시 생성되어
	// 접근이 가능한 메소드
	public static void testField2() {
		// 공유 용도인 static 메소드에서도
		// 안의 지역변수는 stack으로 관리한다
		// 따라서 메소드 내에서는 static 변수를 생성 할 수 없다. ***************
		// static int num2 = 100;
		
	}
	
	
}
