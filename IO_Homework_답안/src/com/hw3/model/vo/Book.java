package com.hw3.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {
	private String title;  		// 도서명
	private String author;  	// 저자
	private int price;		 	 // 가격
	private Calendar dates; 	 // 출판날짜
	private double discount; 	 // 할인율
	
	public Book() {	}

	public Book(String title, String author, int price, Calendar dates, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 출간 ");
		String published = sdf.format(dates.getTime());
		
		// 책 제목이 작더라도 빈칸을 넣어 문자열 공간 간격 맞추기
		if(title.length() < 5) title += "          ";
		
		// String.format()을 활용하시면 printf 같은 효과도 낼 수 있다.
		return String.format("%s\t%s\t%d\t%s\t%.1f", title, author, price, published, discount);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
