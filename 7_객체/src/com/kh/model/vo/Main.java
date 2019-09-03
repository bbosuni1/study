package com.kh.model.vo;

public class Main {

	public static void main(String[] args) {
		// 확인용
		
		// Person 접근하기
		
		// 클래스 : 객체를 찍어내기 위한 설계도
		// new를 통해 실제 값이 들어가 실체와한 것을 객체 ( 인스턴스 ) 라고 한다.
		// 참조 자료형 변수 == 객체
		
		Person p1 = new Person();
		Person p2 = new Person("홍길동"); // 전달인자
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p2.getMyName();
		
		p1.name = "김동현";
		p1.tel = "010-3316-6351";

		p1.getMyName();
		p1.getMyTel(); // 실제로 안에서는 "010-~~" 가 남아있다.
		
		System.out.println(p1.getMyTel());
		
		String p1Tel = p1.getMyTel();
	}

}
