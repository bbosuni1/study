package com.kh.op.test;

public class 비교연산자 {
/*
 *  비교연산자 ( = 관계 연산자 )
 *  --> 두 개의 변수의 관계를 따지는 연산자. 
 *  	 	특정 조건을 만족하면 true로 ,
 *  							만족하지 못한다면 false.
 *  
 *   < : 				ex) A < B : A가 B보다 작다.
 *   > : 				ex) A > B : A가 B보다 크다.
 *   <= : 			ex) A <= B : A가 B보다 작거나 같다.
 *   >= : 			ex) A >= B : A가 B보다 크거나 같다.
 *   == : 			ex) A == B : A와 B가 같다.
 *   !=  :			ex) A != B : A와 B가 다르다.
 */
	
	public void testMethod() {
	/*
		int a = 10;
		int b = 20;
	*/
		int a = 10, b = 20;
		boolean result1, result2, result3;
		result1 = (a == b); // false
		result2 = (a <= b); // true
		result3 = (a >b); // false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		//System.out.println("");
		//System.out.println("");
		//System.out.println("");
		
	}
	
}
