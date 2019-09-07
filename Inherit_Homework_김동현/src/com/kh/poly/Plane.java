package com.kh.poly;

public abstract class Plane { // 추상 클래스
	private String planeName;
	private int fuelSize;
	private int fuel;
	
	public Plane() {}
	
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

//	클래스 구현에 없어서 생략
//	// 정보출력 메소드
//	public void information() {
//		System.out.println(planeName + fuelSize);
//	}
//	
	
	// 주유 메소드
	public void reFuel() {
		setFuelSize(getFuelSize() + fuel);
	}
	
	// 운항 거리에 따른 연료감소 메소드
	// 추상 메소드
	public abstract void flight();
	
	
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
		
	
	
	
}
