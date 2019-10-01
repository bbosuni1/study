package com.kh.excep.myExcep;

public class Run {

	public static void main(String[] args) {

		MyExceptionTest met = new MyExceptionTest();
		
		try {
			met.inputAge();
		} catch (MyException e) {
			// 1. 사용자에게 에러의 메시지를 보여준다면
			System.out.println(e.getMessage());
		
			// 2. 에러 메시지 추적
			// e.printStackTrace();
		
		}
		
	}

}
