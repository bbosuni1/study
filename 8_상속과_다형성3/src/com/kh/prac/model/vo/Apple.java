package com.kh.prac.model.vo;

public class Apple extends Fruit {
	
	// 2. 생성자 ======> 생성자는 상속불가
	public Apple() {
		super();
	}

	public Apple(String color, boolean presticide, String origin) {
		super(color, presticide, origin);
	}

	// 3. 기능 제공 메소드
	public void stomach() {
		System.out.println("전 소화를 도와줘요");
	}

	@Override
	public void makeJuice() {
		System.out.println("전 사과 주스를 만들 수 있어요. ");
	}

	@Override
	public void freeze(int time) {
		System.out.println(time + "시간 만큼 얼립니다. ");
	}

	@Override
	public void eat() {
		System.out.println("사과 아이스크림을 먹습니다. ");
	}
	
}
