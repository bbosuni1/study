package com.kh.poly.emp;

public class Secretary extends Employee implements Bonus {  // Employee 클래스 상속 & Bonus 다중 상속

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	
//	Employee 클래스로 부터 오버라이딩 하여 사용
	@Override 
	public double tax() {
		return super.tax() * 0.1 ; // tax 10% 계산
	}

// Bonus 클래스( 인스턴스) 를 상속 받았기 때문에 추상메소드를 상속하여 완성해야함
	@Override
	public void incentive() {
		setSalary((int)( getSalary() + pay*0.8 )); 
	}
	

}
