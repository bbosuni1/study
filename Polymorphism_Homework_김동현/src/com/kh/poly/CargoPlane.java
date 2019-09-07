package com.kh.poly;

public class CargoPlane extends Plane {
	
	private int distance;

	public CargoPlane() {
		super();
	}

	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight() {
		setFuelSize(getFuelSize() - distance*5);
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
