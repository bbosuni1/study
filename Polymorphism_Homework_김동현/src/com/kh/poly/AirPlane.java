package com.kh.poly;

public class AirPlane extends Plane {
	
	private int distance;
	
	public AirPlane() {
		super();
	}

	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	// 운행 메소드
	@Override
	public void flight() {
	setFuelSize(getFuelSize() - distance*3); // fuelsize 에서 거리*3 만큼 빼고 다시 fuelsize로 투입 
	}
	
	
	
}
