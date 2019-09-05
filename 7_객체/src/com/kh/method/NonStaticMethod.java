package com.kh.method;

public class NonStaticMethod {
		// 매개변수 유무, 봔환 자료형 유무에 따라 
		// 크게 4가지로 나눌 수 있다.
	
		// 1. 매개변수가 없고, 반환값도 없는 메소드
		public void method() {
			
			// 아무 값도 반환하지 않고
			// 메소드의 내용만 수행하는 기능 제공 메소드
			// 자신의 역할을 수행한 뒤에 자신을 호출한 위치로 다시 돌아간다.
			
			System.out.println("매개 변수도 없고, 반환 값도 없는 메소드입니다.");
			
			// return; // 모든 메소드에 존재하나
							  // void 형태로 반환할 내용이 없을 경우
							 // 생략이 가능하다. ( JVM이 컴파일 시에 자동으로 추가한다 )
			
		}
		
		// 2. 매개변수가 없고, 반환값이 있는 메소드
		public String method2() { // 호출 했을때 문자열로 준다는 뜻
					// 메소드의 특정 기능을 수행한 뒤
					// 메소드 머리부분에 선언된 자료형으로 
					// 값을 돌려주는 역할 수행
			
			String str = "반환 자료형이 있는 메소드 입니다.";
			
			return str; // str 에 해당 자료형으로 돌려준다.
			
		}
		
		// 3. 매개변수가 있는 반환값이 없는 메소드
		public void method3(int num1, int num2) {
			// 호출받을 때 받아온 2개의 변수를 자신의 지역 변수로
			// 만들어 특정 기능을 수행하는 역할
			
			System.out.println("sum : " + (num1 + num2));
			
		}
		// 4. 매개변수가 있고 반환값도 있는 메소드
		public int method4(int num1, int num2) {
			// 매개변수로 받은 num1과 num2로 특정 기능을 수행한 후
			// 그 결과를 return에 담아 호출한 위치로 돌려준다
			
			return (num1+num2);
			
		}
		
}
