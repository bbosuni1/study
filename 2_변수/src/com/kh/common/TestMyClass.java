// -- 한줄 주석 --
/*
 * -- 여러줄 주석 --
 * 설명하고자 할 내용이 길어질 경우 사
 */

// 1. 패키지 선언
//		- 해당하는 자바 소스 파일이 어떤 그룹에 속해 있는지 나타내는 그룹의 명칭
package com.kh.common;

/**
 * -- javaDoc(자바 문서용) 주석
 * @author donghyunkim 작성
 * @since 2019.08.26  생성날자
 */

// 2. 클래스 선언
//		- 사용하는 기능에 대한 메소드(함수), 변수의 집합체
public class TestMyClass {

	// 3. 메소드
	//		- 특정 기능을 수행하는 함수 코드
	//		- 종류 : 실행하는 실행용(1개) / 기능을 제공하는 기능 제공용(나머지)
	
	public static void main(String[] args) {

			new TestMyClass().TestMethod1();
			new TestMyClass().TestMethod2();
			new TestMyClass().TestMethod3();
			new TestMyClass().TestMethod4();
			new TestMyClass().TestMethod5();
						
	}
	
	// 기능 제공용 메소드
	public void TestMethod1() {
		// 자바의 기본 데이터 자료형
		
		// 논리 자료형 (true/false (참/거짓)) : 1byte
		boolean result1 = true;
		
		System.out.println(result1);
		
		// 문자 한 개 자료형
		char result2 = 'A'; // 문자 하나 '',  문자 여러개 ""
		
		System.out.println(result2);
		
		// 숫자 자료형 (정수/실수)
		byte resultByte = 10;
		short resultShort = 3000;
		int resultInt = 5000000;
		long resultLong = 100l;
		
		System.out.println(resultByte);
		System.out.println(resultShort);
		System.out.println(resultInt);
		System.out.println(resultLong);
		
		
		// 실수 자료형
		float resultFloat = 3.14f; // 4byte
		double resultDouble = 3.14; // 8byte ** 여기서는 더블이 대표 실수 자료형 
		
		System.out.println(resultFloat);
		System.out.println(resultDouble);
		
		// 참조 자료형
		String Str = "배고파요, i'm hungry :( ";
		
		System.out.println(Str);
		
		
	}
	
	
	// 연습2
	public void TestMethod2() {
		// 기본 자료형을 활용하여 개인정보 입력하기
		// 이름, 나이, 주소, 연락처, 성별,
		// String, Int, String, String, char
		
		String name = "김동현";
		int age = 30;
		String addr = "경기도 성남";
		String tel = "010-3316-6351";
		char gender = 'M';
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(tel);
		System.out.println(gender);
	

		
	}
	
	// 연습3
	
		public void TestMethod3() {
		// 변수와 상수 테스트
	
			int num = 100;
		
		System.out.println(num);
		
		num = 777;
		
		System.out.println(num);
	
		// ---------------------------------//
		
		final int NUM =100;
		
		System.out.println(NUM);
		
		// NUM = 777;
		// 변수 앞에 final을 붙이면  한 번 값을 넣은 절대 값을 바꿀 수 없는 '상수'가 된다.
		//    변수							상수
		// testNum <-----> TEST_NUM		
		
		
	}
		
		// 연습4
		
		public void TestMethod4() {
			// 문자열 표현하기
			// 문자열 끼리 더하면 그 문자열을 합한 더 큰 문자열이 된다.
			
			String str1 = "노는 게 ";
			String str2 = "제일 좋아";
			String str3 = "노는 게 " + "제일 좋아";
			String str4 = new String (str1 + str2);
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(str4);
			
			//------------------------------------------------//
			// 문자열과 다른 데이터 합치기
			
			String str5 = "자바는 재밌어요.";
			String str6 = "자바시간이 행복해요.";
			
			System.out.println(str5 + 123 + 456);
			System.out.println(str5 + 123 + str6);
			System.out.println(222 + 333 + str5);
		
		}
		
		// 오버플로우 테스트
		
		public void TestMethod5() {
			
			// 만약 어떠한 값을 계산했을 때 표현하고자 하는 값이 
			// 해당 자료형의 최대 혹은 최소값을 넘어갈 경우 발생하는
			// 현상을 허용 가능 범위를 초과했다고 하여 오버 플로우라고 한다.			
			
			// byte : -128 ~ 127
			// 만약 -128 보다 작은 값이 들어간다면 / 127 보다 큰 값이 들어간다면.. ?
			
			byte b = 127;
			
			b++; // b+1;
			
			System.out.println(b);
			
				b = -128;
				
				b--; // b-1;
				
			System.out.println(b);
			
			
		}
		
		
	
}
