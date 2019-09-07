package com.kh.product;

public class Main {

	public static void main(String[] args) {
		//	Product pro = new Product(); 
			
			Product tv = new Tv();
			Product smp = new SmartPhone();
			
			// 다형성
			Product[] prolist = new Product[3];
		//	prolist[0] = new Product("Pavv","회색","SS");
		// 미완성된 클래스는 객체를 (즉, new를) 직접 생성하지 못한다.
		// 자식들로만 만들어야 한다.
			prolist[0] = new SmartPhone("Noto10+", "블랙", "SS");
			prolist[1] = new Tv("QLED","흰색","LG");
			prolist[2] = new SmartPhone("아이폰","스페이스그레이","애플");

//			for( int i = 0 ; i < 3 ; i++) {
//				System.out.println(prolist[i]);
//				prolist[i].powerOn();
//				// prolist[i].setChannel(); 
//				// 공통적으로 가지고 있는 기능만 실행가능 
//				// == > 즉 여기선 product의 기능만 사용가능하다.
//			
//				// instanceof 연산자
//				// TV, SmartPhone을 Product로 만들었다고 하더라도
//				// 서로 전혀 다른 기능들을 가지고 있을 수 있다.
//				
//				// 이를 비교하기 위해 원래 무엇으로 만들었는지 확인하는
//				// 연산자가 instanceof 연산자 이다.
//				System.out.println(prolist[i] instanceof Product); // 자식은 부모의 기능을 가능
//				System.out.println(prolist[i] instanceof Tv);
//				System.out.println(prolist[i] instanceof SmartPhone);
//			
//				// instanceof 연산자로같을 경우 기능 수행 + 형변환 필요
//				if(prolist[i] instanceof Tv) {
//					Tv myTv = (Tv) prolist[i]; // 부모 자식간에 형변환이 가능하다
//					myTv.setChannel(50);
//					System.out.println(myTv.getChannel()+" 만큼 돌렸습니다.");
//				}
//			}
//			
			// 각각의 화면 확인하기 ( for -each문)
			for(Product p : prolist) {
				p.display();
			}
			
	}

}
