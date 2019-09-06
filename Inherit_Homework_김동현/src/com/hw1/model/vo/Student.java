package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade; // 학년
	private String major; // 전공
	public Student() {}

	public Student(int age, double height, double weight, String name, int grade, String major) {
		super(age, height, weight);
		super.setName(name); // 부모로 부터 직접 set로 해봄
		this.grade = grade;
		this.major = major;
	}

	// 부모꺼 상속 받아 오버라이드 하여 추가
	@Override
	public String information() {
		return super.information() +" , " +  grade + " , "+ major;
	}
	
	
	
}//class

