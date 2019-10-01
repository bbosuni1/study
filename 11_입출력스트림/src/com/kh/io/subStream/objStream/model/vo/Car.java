package com.kh.io.subStream.objStream.model.vo;

import java.io.Serializable;

public class Car implements Serializable{
	
	// VO (Value Object)
	// 1. 모든 필드는 private 이여야 한다.
	// 2. setter와 getter가 구현되어야 한다.
	// 3. 직렬화 처리가 되어야 한다.
	
	// 직렬화란,
	// 어떤 객체의 내용을 한 줄 짜리 데이터로 나열하는 것을 말한다.
	
	// 직렬화의 목적
	// int 값 | double 값 | int 값 | char 값 |	.	.	.
	// 객체를 다른 프로그램이나 컴퓨터에 전달할 때
	// 여러 필드를 한 줄로 구성하여 처리함으로써
	// 서로 다른 구조를 지닌 컴퓨터라도 해당 객체를
	// 올바르게 인식시키기 위함이다.
	
	// transient : 직렬화 목록에서 제외하겠다.
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 같은 클래스 내에 겹치지 않도록 번호를 정해준다.
	
	private /* transient */ String brand;
	private int price;
	private int size;
	
	public Car() {}
	
	public Car(String brand, int price, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + price;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	
	
}
