package com.kh.prac.model.vo;

public class Banana extends Fruit{
	
	public Banana() {
		super();
	}

	public Banana(String color, boolean presticide, String origin) {
		super(color, presticide, origin);
	}

	// 메소드
	public void toothwhite() {
		System.out.println("전 미백을 도와줍니다.");
		
	}

	@Override
	public void makeJuice() {
		System.out.println("전 바나나 주스를 만들 수 있어요");
	}

	@Override
	public void freeze(int time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
