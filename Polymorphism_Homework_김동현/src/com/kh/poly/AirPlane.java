package com.kh.poly;

public class AirPlane extends Plane {
	
	public AirPlane() {
		super();
	}

	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	// 운행 메소드
	@Override
	public void flight(int distance) {
	setFuelSize(getFuelSize() - distance*3); // fuelsize 에서 거리*3 만큼 빼고 다시 fuelsize로 투입 
	}
	
	
	
}
