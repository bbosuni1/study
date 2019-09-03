package com.kh.model.vo;

public class Person {
		// 객체 지향 언어
		// -> 객체를 사용하여 프로그램을 작성하는 언어

		// 객체는 클래스에 의해 만들어짐
		// java : heap 메모리 안에 할당되어 값이 들어간 변수
		// c++ : 클래스에 의해 만들어진 변수
	
		// 일반적인 형식
		// 클래스명 변수명 = new 클래스명();
	
		// -- 클래스 작성 순서 --
	
		// 1. 클래스 내에서 범용적으로 사용하는 변수(필드 | 맴버 | 클래스)
		
		String name; // 이름
		int age; // 나이
		char gender; //성별
		String tel; // 연락처
	
		// 2. 해당 클래스를 생성하기 위한 생성자
		// new 할 때 사용하는 특수한 메소드
		// 선언 방식 : 접근제한자 클래스명 ([매개변수] ... ) { ... }
		// 객체 생성 전용 메소드로 처음 객체를 생성할 때 
		// 초기값을 가지고 시작할 목적으로 사용하는 메소드
		
		public Person() { 	} // 기본 생성자(default Constructor)
		
		public Person(String name) {
			// 사용자 정의 생성자
			// new 를 통해 호출할 때 전달받는 매개 변수로
			// 현재 비어있는 필드 변수에 값을 대입하기 위한 목적으로 사용
			
			this.name	= name;
		}
		
		// 3. 기능 제공 메소드
		// 현재 클래스의 정보를 활용하여
		// 특정 기능을 제공할 목적으로 만드는 메소드
		
		// 선언 형식 :
		// 접근제한자 [예약어] 반환 자료형 메소드명([매개변수]){ ...... }
		
		public void getMyName() {
			
			System.out.println("내이름은 " + name + " 입니다.");		// 직접 출력
			
		}
		
		public String getMyTel() {
			
			return tel;	// 단순히 값만 돌려주는 목적 출력x
			
		}
		
		
		
}
