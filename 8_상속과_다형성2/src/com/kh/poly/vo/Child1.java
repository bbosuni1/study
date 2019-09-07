package com.kh.poly.vo;

public class Child1 extends Parents {

		private String lastName;
		private int loan;
		
		public Child1() {}

		@Override
		public void sayMyName() {
			System.out.println("나는 첫번째 자식 입니다.");
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		
}
