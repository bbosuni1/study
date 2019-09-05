package com.kh.cafe.run;

import com.kh.cafe.model.vo.Coffee;

public class Main {

	public static void main(String[] args) { // 가게 오픈 시 ~ 영업 끝났을 때
		
		// 1. 일반 커피 주문하기

		System.out.println("커피 하나 주세요.");
		Coffee cup1 = new Coffee(); // 기본 생성자를 부름
		
		System.out.println("-- 커피 내용 확인 --");
		cup1.coffeeInfo();
		cup1.setName("녹차라떼");
		cup1.setPrice(6000); // Coffee 클래스의 setPrice를 삭제할 경우 가격은 변동할 수 없게
		cup1.coffeeInfo();

		// 상세한 내용의 커피 주문하기
		System.out.println("녹차라떼, 아이스로 해주시고, 이라크산, 레귤러로 주시구요, 가격은 60000원");
		Coffee cup2 = new Coffee("녹차라떼" , "이라크산" , 60000, "레귤러", true);
		
		System.out.println("--- 주문 확인 ---");
		
		cup2.coffeeInfo();
		
		System.out.println("두 개 합쳐서 얼마에요?");
		
		int sum = cup1.getPrice() + cup2.getPrice();  // coffee 라는 큰 틀(class)을 이용하여 new 생성자를 통해여 다른 객체를 생성하였다.
		
		System.out.println("총 가격은 " + sum+ " 원 입니다.");
	}
	
}
