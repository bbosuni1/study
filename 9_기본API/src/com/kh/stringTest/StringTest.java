package com.kh.stringTest;

import java.util.StringTokenizer;

public class StringTest {

	// 문자열 특성 확인하기
	
	public void test1() {
		
		// 문자열
		// 1. 값이 변경될 때마다 Heap 영역의
		// 문자열 저장소에 값을 일일히 저장한다.
		
		// 2. 만약 이미 동일한 값이 저장되어 있다면,
		// 문자열 저장소에서 해당 값의 주소만을 꺼내온다.
		// 즉, 새로 만들지 않는다.
		
		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = new String("Hello World");
		
		// 본래 주소값이 서로 달라야 하지만
		// 실행시에 "Hello World"라는 문자열이
		// 문자열 저장소에 이미 존재 한다면 같은 주소값을 꺼내온다.
		System.out.println(str1 == str2); 
		System.out.println(str1.equals(str2));
		
		// new String으로 새로운 문자열을 할당할 경우
		// 안에 있는 값을 비교하여 만약 존재하는 값이라면
		// 그 값을 주소를 기록한 새로운 String 객체를  만들어 준다
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		// 3개 객체 모두 같은 주소를 가진다.
		// new의 경우 새로운 객체를 만들고 그 객체에 문자열의 주소값을 저장한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
	}
	
	public void test2() {
		
		// 문자열은 불변성이라는 특성 때문에
		// 안의 내용이 변경될 때 마다 하나하나의 문자열로 각각 저장된다.
		//	H
		// He
		// Hel
		// Hell
		// Hello
		// ....
		// 이를 막기 위해 별도의 임시 공간(buffer) 을 만들어 문자열 변경 과정을 다 처리한
		// 결과만을 반환하는 Class를 제공한다.
		// StringBuffer / StringBuilder
		// StringBuffer 와 StringBuilder의 사용법은
		// 동일하지만 하나의 공간에서 동시에 여러 일을 처리하는
		// 개념에 대한 threadSafe 기능 유무에 따라 Buffer와 Builder가 나뉜다.
		
		// StringBuffer의 경우 동시 제어를 막기 위해 
		// threadSafe 기능을 제공하지만, 간단한 프로그램 구현이나
		// 동시제어를 굳이 필요로 하지 않는 경우 이는 짐이될 수 있다.
		// 따라서 일반적으로 threadSafe 기능이 없는 StringBuilder가 더 자주 쓰인다.
		
		StringBuilder stb = new StringBuilder();
		
		stb.append("Hello");
		System.out.println(stb.hashCode());
		
		stb.append(" World");
		System.out.println(stb.hashCode());
		
		String result = stb.toString();
		System.out.println("result : " + result);
	}
	
	public void test3() {
		// 어떠한 문자열을 받을 때
		// "000, XXX, ZZZ" 여러 문자열을
		// 합하여 받는 경우 해당 문자열을 다시 여러 개의 각각의 문자열로 분리할 경우
		
		String str = "잠시만요, 맥주창고, 백반, 햄버거, 떡볶이";
		
		String[] strArr = str.split(", "); // split 문자열을 알아서 꺼내옴
		
		// 1. 일반 for 문
//		for(int i = 0 ; i < strArr.length ; i ++) {
//			System.out.println(strArr[i]);
//		}
		
		// 2. forEach 문 ( 배열 각각을 알아서 꺼내오는 반복문 )
		for ( String p : strArr ) {
			System.out.println(p);
		}
		
		// split() 하고 유사한 객체
		// 하나의 문자열을 특정 구분자로 나누어
		// 한 번씩 조회하는 클래스
		StringTokenizer strToken = new StringTokenizer(str);
		
		while(strToken.hasMoreTokens()) { // 남아있는 토큰이 더 없을 때 까지
					System.out.println(strToken.nextToken(", "));
		}
		
		// join()
		// 특정 문자열 배열을 하나의 문자열로 만드는 메소드
		
		String[] strArr2 = new String[5];
		strArr2[0] = "저는 ";
		strArr2[1] = "자바를 ";
		strArr2[2] = "정말 ";
		strArr2[3] = "너무나도 ";
		strArr2[4] =  "gg ";
			
		//System.out.println(new String().join(" ", strArr2));
		System.out.println(str.join(" ", strArr2));
		// join은 static 메소드이다
		// 실제 저장되지 않는다.
		// 따라서 일반적으로 쓸땐
		// System.out.println(String.join(" ", strArr2));
		
		System.out.println(str);
				
		
	}
	
}// class
