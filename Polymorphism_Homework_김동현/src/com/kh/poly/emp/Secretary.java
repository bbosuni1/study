package com.kh.poly.emp;

public class Secretary extends Employee implements Bonus {  // Employee 클래스 상속 & Bonus 다중 상속

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive() {
		
	}
	
	

}
