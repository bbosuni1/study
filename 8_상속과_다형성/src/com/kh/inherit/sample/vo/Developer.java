package com.kh.inherit.sample.vo;

public class Developer extends Person {

	private String company;
	
	public Developer() {
		company = "구글";
		
	}
	@Override
	public void printInfo() {
		System.out.println(super.getName() + ", " + super.getAge() + ", ");
		// 부모가 가지고 있는 것을 꺼낼때 super.get변수명
		System.out.println("저는 " + company + " 에서 일합니다.");
		
	}
}
