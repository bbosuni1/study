package com.kh.poly;

public class CargoPlane extends Plane {
	
	public CargoPlane() {
		super();
	}

	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - distance*5);
	}

}
