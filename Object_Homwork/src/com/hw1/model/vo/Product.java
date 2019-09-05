package com.hw1.model.vo;

public class Product {
	
	// 틀을 만든다
	
	// 필드 변수 등록
	private String productId; // 상품 아이디
	private String productName; // 상품명
	private String Area; // 생산지
	private int price; // 가격
	private double tax; // 부가세 비율
	
	// 기본 생성자
	public Product(){
	}
	// 매개변수 생성자
	public Product (String productId, String productName, String Area, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.Area = Area;
		this.price = price;
		this.tax = tax;
	}
	public	String information() {
		return  productId + "\t" + productName + "\t" + Area + "\t" + price + "\t"  + tax;
	}
	
	// getter & setter 만들기
//	public int getPrice() {
//		return this.price;
//	}
//	public double getTax() {
//		return this.tax;
//	}
	public void setPrice(int price) {
		this.price = price;  // ---------------> this.price ( 위의 price)에 입력받은 price를 준다
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public int gerPirce() {  // 밖에서 계산하지 않고 바로 계산해서 돌려준다.
		return (int)(price + (price*tax));
	}
	
	public String getProdutName() {
		return productName;
	}
	
	
	
}// class

