package com.kh.logic;

public class BeforeLogic {

	public static void main(String[] args) {
		// 조건문 : 어떠한 상황에 처했을 때 선택의 기로에서 
		// 		      선택하는 것을 코드로 표현하는 문법
		
		//	** 비교연산자 익숙해지기
		// ** 조건문에 들어가는 조건들이 대부분 
		//		비교 연산자로 이루어져 있기 때문이다.
		
		int num1 =10;
		double num2 = 10.0;
		int num3 = 20;
		
		// ------------------------- //
		// 위의 세 변수를 비교연산자와 함께 사용하여 true / false 를 각각 15개씩 만들
		
		// -- true 15 개 --
		System.out.println( "true1 : " + ( num1 == num2 ));
		System.out.println( "true2 : " + ( num3 != num2 ));
		System.out.println( "true3 : " + ( num3 != num1 ));
		System.out.println( "true4 : " + ( num3 > num1 ));
		System.out.println( "true5 : " + ( num3 > num2 ));
		System.out.println( "true6 : " + ( num1 >= num2 ));
		System.out.println( "true7 : " + ( num1 <= num2 ));
		System.out.println( "true8 : " + ( num1 + num2 >= num3));
		System.out.println( "true9 : " + ( num3 + num1 >= num2));
		System.out.println( "true10 : " + ( num3 * num1 >= num2));
		System.out.println( "true11 : " + ( num3 * num2 == num3 * num1));
		System.out.println( "true12 : " + ( num1 * 2 == num2 * 2));
		System.out.println( "true13 : " + ( (num3 % num2) == (num3 % num1)));
		System.out.println( "true14 : " + ( (num1 * num2) == 100 ));
		System.out.println( "true15 : " + ( (num3 * num1 +1) != num3 % num2));
		
		
		// -- false 15 개 --
		System.out.println( "false1 : " + ( num3 == num2 ));
		System.out.println( "false2 : " + ( num3 == num1 ));
		System.out.println( "false3 : " + ( num2 * num1 == num2 * num3 ));
		System.out.println( "false4 : " + ( num2 + num3 == 25 ));
		System.out.println( "false5 : " + ( num2 % num3 >= num3 ));
		System.out.println( "false6 : " + ( num2 != num1 ));
		System.out.println( "false7 : " + ( num3 % num1 != num3 % num2));
		System.out.println( "false8 : " + ( num2 / num3 >= num3 ));
		System.out.println( "false9 : " + ( num2 * num3 <= num3 ));
		System.out.println( "false10 : " + ( num2 * 2  >= num3 + 1 ));
		System.out.println( "false10 : " + ( --num3 ==  num3 - 1 ));
		System.out.println( "false12 : " + ( ++num2 == 10));
		System.out.println( "false13 : " + ( num1++ != 10));
		System.out.println( "false14 : " + ( num2 != num1));
		System.out.println( "false15 : " + ( ++num2 != num2++) );
		


	}

}
