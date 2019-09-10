package com.kh.wrapperTest;

public class WrapperTest {

	public static void main(String[] args) {

		// Wrapper 클래스
		// 기존의 기본 자료형을 참조 자료형처럼
		// 쓸 수 있도록 모양을 변환해주는 클래스
		
		// 문자열 "5" 를 숫자로 바꾼다면

		byte num1 = Byte.parseByte("5");
		short num2 = Short.parseShort("5");
		int num3 = Integer.parseInt("5");
		
		float num4 = Float.parseFloat("5.5");
		double num5 = Double.parseDouble("5.5");
		boolean check = Boolean.parseBoolean("true");
		
		char ch = "test".charAt(0);
		
		// ----------------------------------------------------
		
		// 기본 자료형을 문자열로 변경할 때 && 오버로딩
		String str = String.valueOf(100);
		String str2 = String.valueOf(5.5);
		
		// String str3 = "Hello" + 'A';
		String str3 = String.valueOf('A');
		
		String str4 = String.valueOf(true);
		
		
		
		
		
	}

}
