package com.kh.product;

// 추상 클래스
// abstract class
// 미완성 클래스로, 사용하기 위해서는 반드시 자식을
// 필요로 하는 클래스를 말한다.
// 만약 해당 클래스에 미완성된 메소드가 하나라도 있을 경우
// 반드시 명시해야 한다.

public abstract class Product {

	private String model;
	private String color;
	private String brand;

	public Product() {}

	public Product(String model, String color, String brand) {
		super();
		this.model = model;
		this.color = color;
		this.brand = brand;
	}
	
	// 메소드
	
	public void powerOn() {
		System.out.println("전원 켜기");
	}
	
	public void powerOff() {
		System.out.println("전원 끄기");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	// 미완성 메소드
	// 만약에 내부에서 실행할 내용을 굳이 적을 필요가 없을 경우
	// 다른 자식 클래스에게 공개하여 반드시 이 메소드를 구현하세요 
	// 라는 강제성을 부여하기 위한 메소드
	//public void display(); 미완선 메소드의 예
	public abstract void display();

	
}
