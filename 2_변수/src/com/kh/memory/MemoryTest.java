package com.kh.memory;

public class MemoryTest {
	
	// 클래스 바로 밑에 선언하는 변수를
	// 클래스 변수 / 맴버 변수 / Field 라고 한다.
	// - 때때로 전역 변수라고 하기도 하지만 이건 틀린 표현입니다.
	// 이렇게 선언된 변수는 Heap 메모리 영역에 담기며, 같은 클래스 안의 모든 메소드들이 사용할 수 있게 된다.
	// 같은 클래스 안의 모든 메소들이 사용할 수 있게 된다.
	// Heap 메모리에 담긴 이 변수들은 JVM이 정한 기본값으로 초기화가 이루어 진다.
	
	int num1;
	
	public void testMethod1() {
		// 메소드 내부에서 선언된 변수를
		// 지역 변수라고 말한다.
		// 지역변수는 Stack 메모리 영역에 저장되며
		// 메소드 호출 시 생성되고, 메소드가 종료되면 함께 사라진다.
		
		int num2 = 100; // 해당 메소드 안에서만 작동 = Heap
		
		System.out.println("필드변수 : " + num1); // num1은 밖에 있지만 사용가능하
		System.out.println("지역변수 : " + num2); 
	}
	
	public void testMethod2() {
		// 만약 지역 변수의 이름이 필드 변수의 이름과 같다면 
		// 지역 변수를 우선한다.  
		
		int num1 = 500;
		
		System.out.println("변수의 값 확인 : " + num1);
		// System.out.println("지역 변수 확인 : " + num2);
		// 지역 변수는 해당 메소드 안에서만 작동 = Stack
		
	}
}
