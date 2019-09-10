package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() { }
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시오(띄어쓰기 포함): ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuilder stb = new StringBuilder();
		
		// 어려워 하셔서 좀 더 쉬운 방법으로 풀어 보았습니다.
		
		while(st.hasMoreTokens()) { // 1. 더 쪼갤 문자열이 있는지 확인!
			String token = st.nextToken();  // 2. 쪼갠 문자열 하나
			for(int i=0;i<token.length();i++) {  // 3. 쪼갠 문자열 길이만큼 한 문자씩 저장하기
				if(i==0)	// 만약 첫번째 문자라면 대문자로 바꿔서 stb에 저장!
					stb.append(token.toUpperCase().charAt(i));
				else		// 아니라면 그대로 stb에 저장!
					stb.append(token.charAt(i));
			}   // abcd --> A, b, c, d 순으로 하나씩 저장됩니다.
			stb.append(" ");
		}
		
		// 수업 때 코드
		/*
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			stb.append(token.replaceFirst(token.charAt(0) + "", token.toUpperCase().charAt(0) + ""));
			
			stb.append(" "); // 띄어쓰기 용
		}
		*/
		
		System.out.println(stb);
	}
}
