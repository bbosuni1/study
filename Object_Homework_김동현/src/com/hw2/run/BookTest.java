package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// 실행용
		
		// 기본 생성자 이용
		Book book1 = new Book();
		// 매개변수 생성자 이용
		Book book2 = new Book("자바의 정석", 20000, 0.2, "남궁성");
		// 출력
		System.out.println(book1.information());
		System.out.println(book2.information());
		
		System.out.println("========================");
		// setter 값 입력
		book1.setTitle("씨앗의 정석");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("Daniel_Yu");
		
		// 입력된 값 출력 확인
		System.out.println(book1.information());
		//book1.information();
		
		System.out.println("========================");
		// 할인된 가격 출력s
		
		System.out.println("도서명  = " + book1.getTitle());
		System.out.println("할인된 가격  = " + book1.getPrice());
		System.out.println("도서명  = " + book2.getTitle());
		System.out.println("할인된 가격  = " + book2.getPrice() + " 원");
		
		
		
		
	}//method
	

}//class
