package com.kh.poly;

public abstract class Plane {

	private String planeName;
	private int fuelSize; 
	
	public Plane() { }

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) { // 주유한 만큼 fuelSize에 추가하기
		fuelSize += fuel;
	}
	
	public abstract void flight(int distance); // 운항(Abstract method)

	
	
	@Override
	public String toString() {
		return planeName + "\t" + fuelSize;
	}

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
	
	
}
