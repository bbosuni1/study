package com.kh.product;

import java.nio.channels.Channel;

public class SmartPhone extends Product{

	private boolean tel;

	public SmartPhone() {
	}

	public SmartPhone(String model, String color, String brend) {
		super(model, color, brend);
		
	}

	@Override
	public void display() {
		// 자식 클래스가 직접 생성하도록 강제성을 부여하는 메소드가
		// abstract 메소드이다
		
		System.out.println(this.getModel() + " : " + "Digital Exciting AnyCall");
	}

	
}
