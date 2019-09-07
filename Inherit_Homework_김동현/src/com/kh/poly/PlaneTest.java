package com.kh.poly;

public class PlaneTest {

	public static void main(String[] args) {
		
		
		// 객체 배열 생성
		Plane[] pl = new Plane[2];
		pl[0] = new AirPlane("L747", 1000);
		pl[1] = new CargoPlane("C40", 1000);
		
		
		System.out.println("Plane\t fuelSize");
		System.out.println("=============");
		
		// 객채 정보 출력
		// infomation 메소드를 만들어서 간단하게 출력 가능하나 생략
		System.out.println(pl[0].getPlaneName() + "\t" + pl[0].getFuelSize());
		System.out.println(pl[1].getPlaneName() + "  \t" + pl[1].getFuelSize());
		
		System.out.println(); // 줄 내림
		
		// -----------------  100 운항 ----------------//
		System.out.println("Plane\t fuelSize");
		System.out.println("=============");
		
		AirPlane move = (AirPlane) pl[0]; // pl 은 부모 클래스를 통해 만들었다. airplane 을 통해 자식클래스 형변환
		move.setDistance(100); // 100 운항
		pl[0].flight(); //  메소드
		System.out.print(pl[0].getPlaneName() + "\t" + pl[0].getFuelSize() +"\n");  
		
		CargoPlane move2 = (CargoPlane) pl[1];
		move2.setDistance(100);
		pl[1].flight();
		System.out.print(pl[1].getPlaneName() + "  \t" + pl[1].getFuelSize() +"\n");  
		
		System.out.println();  // 줄 내림
		
		// ------------------ 200 주유 ----------------//
		System.out.println("Plane\t fuelSize");
		System.out.println("=============");
		pl[0].setFuel(200);
		pl[0].reFuel();
		System.out.print(pl[0].getPlaneName() + "\t" + pl[0].getFuelSize() + "\n");
		pl[1].setFuel(200);
		pl[1].reFuel();
		System.out.print(pl[1].getPlaneName() + "  \t" + pl[1].getFuelSize() + "\n");
		
	}

} // class
