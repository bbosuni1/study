package com.kh.poly;

public class CargoPlane extends Plane {

	public CargoPlane() { }

	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - distance * 5); // 10 운항시 연료 50 감소
	}

}
