package com.kh.poly.vo;

public class Parents {

		protected int money; // 상속 받는 자식만 가능
		protected String firstName;
		
		public Parents() {	}
		
		public void sayMyName() {
			
			System.out.println("나는 부모 입니다.");
		}

		// getter & setter
		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
}
