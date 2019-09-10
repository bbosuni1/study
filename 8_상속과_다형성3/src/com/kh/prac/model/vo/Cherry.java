package com.kh.prac.model.vo;

public class Cherry extends Fruit{
	
	public Cherry() {
		super();
	}

	public Cherry(String color, boolean presticide, String origin) {
		super(color, presticide, origin);
	}

	// 3. 기능 제공 메소드
	public void earn() {
		System.out.println("전 가격이 저렴합니다.");
	}

	@Override
	public void makeJuice() {
		System.out.println("전 체리 주스를 만들 수 있어요");
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
