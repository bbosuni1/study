package com.kh.prac.model.vo;

import java.io.Serializable;

public abstract class Fruit implements IceCreamPack, Serializable {
	// 미완성 클래스
	// 1. 미완성 메소드가 하나라도 있을 경우 선언
	// 2. 직접 객체를 생성할 수 없다
	// 3. 자식이 해당 클래스를 상속 받을 경우
	// 반드시 미완성 메소드를 오버라이딩 해야한다.
	
	// 색, 농약, 원산지
	
	// 1. 필드 변수
	private String color;
	private boolean presticide;
	private String origin;
	
	
	// 2. 생성자
	public Fruit() {};
	
	public Fruit(String color, boolean presticide, String origin) {
		super();
		this.color = color;
		this.presticide = presticide;
		this.origin = origin;
	}
	
	// 3. 기능 제공 메소드
	
	// 추상 메소드
	public abstract void makeJuice();
	
	// 오버라이드의 성립조건
	// 1. 부모 메소드와 반환 자료형, 메소드명, 매개 변수의 자료형(타입)과 객수가
	//		모두 같아야 한다.
	//	2. 접근 제한자는 부모 메소드 보다 같거나 더욱 큰 범위로 선언해야 한다.
	// 3. 예외가 발생하여 해당 예외를 throw	 해야 할 경우
	//		부모 메소드 보다 해당 예외의 갯수가 같거나 적어야 한다.
	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", presticide=" + presticide + ", origin=" + origin + "]";
	}

	// 4. getter & setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPresticide() {
		return presticide;
	}

	public void setPresticide(boolean presticide) {
		this.presticide = presticide;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
