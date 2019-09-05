package com.hw2.model.vo;

public class Book {
	
	// 필드 생성
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 생성자 생성
	public Book() {
	}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	
	// setter 
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double disccountRate) {
		this.discountRate = disccountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// getter
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return (int)(price-(price*discountRate));
	}
	
	public String information() {
		return (title +"\t"+ price +"\t"+ discountRate +"\t"+ author);
	}

}
