package com.kh.poly;

public class AirPlane extends Plane {
	
	public AirPlane() {	}

	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - distance * 3); // 10 운항시 연료 30 감소
	}

}
