package com.kh.poly;

public class PlaneTest {

	public static void main(String[] args) {
		 // Airplane 과 Cargoplane 객체 생성
		AirPlane air = new AirPlane("L747", 1000);
		CargoPlane cargo = new CargoPlane("C40", 1000);
		
		 // 생성된 객체의 정보 출력
		System.out.println("Plane fuelSize"); 
		System.out.println("--------------");
		System.out.println(air);
		System.out.println(cargo);
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		System.out.println("100 운항");
		air.flight(100);
		cargo.flight(100);
		
		// 100 운항 후 객체 정보 출력
		System.out.println("Plane fuelSize"); 
		System.out.println("--------------");
		System.out.println(air);
		System.out.println(cargo);
		 
		 //Airplane 과 Cargoplane 객체에 200 씩 주유
		System.out.println("200 주유");
		air.refuel(200);
		cargo.refuel(200);
		
		 // 200 주유 후 객체 정보 출력
		System.out.println("Plane fuelSize"); 
		System.out.println("--------------");
		System.out.println(air);
		System.out.println(cargo);
	}

}
