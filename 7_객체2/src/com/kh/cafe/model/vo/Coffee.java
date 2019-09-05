package com.kh.cafe.model.vo;

public class Coffee {
		// 1. 필드 변수 ( 클래스 변수 )
		// 이름 name : String
		// 가격 price : int
		// 원산지 origin : String
		// 사이즈 size : String
		// 얼음유무 Ice : boolean
	
		private String name; // 커피 이름
		private int price; // 가격
		private String origin; // 원산지
		private String size; // 사이즈
		private boolean ice; // 얼음 유무
	
		// 2. 생성자
		// 기본이든 사용자 정의든 둘 중 하나는 무조건 있어야 new로 생성가능
		
		// 기본 생성자
		public Coffee() {
			name = "아메리카노";
		} // new Coffee 하면 만들어짐
		
		// 사용자 정의 생성자
		public Coffee(String name, String origin, int price , String size, boolean ice) {
			this.name = name; // name 을 위에 있는 name에 넣어준다
												// this 를 사용하여 위에 있는 name 에 넣어줌 사용하지 않을 경우 내부에서 끝남
			this.origin = origin;
			this.price= price;
			this.size = size;
			this.ice = ice;
			
		} // 내가 직접 입력
		
		// 3. 기능 제공 메소드
		// Getter & Setter
		
		// - Getter -
		// public 반환자료형 get변수명(){
		//		return 변수명;
		// }
		
		public String getName() { //변수명 표기는 카멜형으로
			return	 this.name; // this는 생략가능
		}
		public int getPrice() {
			return price;
		}
		public String getOrigin() {
			return origin;
		}
		public String getSize() {
			return size;
		}
		public boolean getIce() {
			return ice;
		}
		
		// - Setter -
		// public void set변수명(String 변수명){
		// 	this.변수명 = 변수명;
		// }
		
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public void setIce(boolean ice) {
			this.ice = ice;
		}
		
		public void coffeeInfo() {
			System.out.println("주문하신 커피는 " + name + " 이고, 가격은 "  + price + " 원 입니다.");
			System.out.println("사이즈는 " + size + " 원산지는 " + origin + " 입니다.");
		}
		
}//class

