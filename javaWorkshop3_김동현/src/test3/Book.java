package test3;

import java.io.Serializable;

// 객체!!!!!!!! 를 파일에 저장하거나 불러올때 Serializable 인터페이스를 상속받아야 한다@!!!!!!!!!!!!!!!!!!!!!
public class Book implements Serializable {
	
	// 필드 변수
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	// 기본 생성자
	public Book() {}

	// 사용자 정의 생성자
	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	// toString 재정의
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate + "]";
	}

	// getter & setter 
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	};
	
}
