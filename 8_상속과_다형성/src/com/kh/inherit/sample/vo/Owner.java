package com.kh.inherit.sample.vo;

public class Owner extends Person {
	
	private String where;
	
	public Owner() {
		where = "KFC타워";
	}

	@Override
	public void printInfo() {
		System.out.println("나는 " + where + " 를 소유하고 있는 " + this.getAge() + " 살 " + this.getName() + " 입니다.");
	}
	
}
