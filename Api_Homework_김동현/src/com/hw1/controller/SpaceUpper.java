package com.hw1.controller;

import java.util.*;

public class SpaceUpper {

	
	// 1. 기본 생성자
	public SpaceUpper() {}
	
	// 2. 기능 메소드
		public void spaceToUpper() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("영문을 입력하세요 : ");
			
			StringTokenizer strToken = new StringTokenizer(sc.nextLine(), " ");
			StringBuilder stb = new StringBuilder();
			
			while(strToken.hasMoreTokens()) { 
				 	stb.delete(0, stb.length()); // 초기화를 위해서
					stb.append(strToken.nextToken());
					stb.replace(0, 1, stb.substring(0,1).toUpperCase()); //charAt 사용 불가
					System.out.print(stb.toString() + " ");
			}
	} // method
		
}// class

							// 강사님 풀이

							//public void spaceToUpper() {
							//	
							//	Scanner sc = new Scanner(System.in);
							//	
							//	System.out.print("영문 입력(띄어쓰기 포함) : ");
							//	String str = sc.nextLine();
							//	
							//	StringBuilder stb = new StringBuilder();
							//	
							//	StringTokenizer st = new StringTokenizer(str);
							//	
							//	while(st.hasMoreTokens()) {
							//		String temp = st.nextToken(" ");
							//		
																		// "" 를 추가해 문자열로 바꾸거나
																		// valueof 를 이용
							//		stb.append(temp.replaceFirst(temp.charAt(0) + ""," "+temp.toUpperCase().charAt(0)));
							//	}
							//	
							//	System.out.println(stb.toString());
							//	
							//	
							//}

							// 혹은
							// replaceFirst 를 사용해도 쉬움 pdf 참조
