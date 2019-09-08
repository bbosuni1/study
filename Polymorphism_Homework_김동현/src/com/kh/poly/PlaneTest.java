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
		
		if( pl[0] instanceof AirPlane) { // pl 의 자료형이 AirPlane 일때
		AirPlane move1 = (AirPlane) pl[0]; // pl은 부모타입으로 자식개체를 참조하여 만들었다. 따라서 부모객체에 있는 메소드만 사용가능하다.
																	// 자식객체에 있는 메소드를 사용하기 위해선 강제로 자식객체로의 형변환 과정이 필요하다.
		move1.flight(100);
		System.out.print(pl[0].getPlaneName() + "\t" + pl[0].getFuelSize() +"\n");  
		}		
		
		if( pl[1] instanceof CargoPlane) {
		CargoPlane move2 = (CargoPlane) pl[1];
		move2.flight(100);
		System.out.print(pl[1].getPlaneName() + "  \t" + pl[1].getFuelSize() +"\n");  
		}
		
		
		
		System.out.println();  // 줄 내림
		
		// ------------------ 200 주유 ----------------//
		System.out.println("Plane\t fuelSize");
		System.out.println("=============");
		pl[0].reFuel(200);
		System.out.print(pl[0].getPlaneName() + "\t" + pl[0].getFuelSize() + "\n");
		pl[1].reFuel(200);
		System.out.print(pl[1].getPlaneName() + "  \t" + pl[1].getFuelSize() + "\n");
		
	}

} // class
