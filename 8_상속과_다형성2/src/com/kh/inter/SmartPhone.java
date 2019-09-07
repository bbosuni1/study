package com.kh.inter;

import java.io.Serializable;

import com.kh.product.Product;

// 상속 : 
// 추상 클래스, 일반 클래스 : extends
// 인터페이스 : implements ( 다중 상속이 가능 )

public class SmartPhone extends Product implements IProduct, Serializable {

	@Override
	public void display() {
		
	}

	@Override
	public void abstMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstMethod2() {
		// TODO Auto-generated method stub
		
	}
}
