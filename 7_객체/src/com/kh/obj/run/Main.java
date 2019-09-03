package com.kh.obj.run;

import java.util.Scanner;

public class Main {
	// Cafe ver 1.0
	
	public static void main(String[] args) {
		// 실행용 메소드
		
		String origin[] = new String[4]; // 원산지
		int roasting[] = new int[4]; // 로스팅
		String type[] = new String[4]; // 커피 종류
		int sugar[] = new int[4]; // 설탕스푼
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페 입니다.");
		
		for(int i = 0 ; i < 4 ; i ++) {
			
			System.out.print("원산지 : ");
			origin[i] = sc.next();
			
			System.out.print("커피 종류 : ");
			type[i] = sc.next();
			
			System.out.print("설탕 몇 스푼? : ");
			sugar[i] = sc.nextInt();
			
			System.out.println("고객 님이 주문한 커피는 : " + origin[i] + " 산 " + type[i] + " 입니다.");
			System.out.println("설탕은 " + sugar[i] + " 스푼 입니다.");
		
		}

	} // method

} // class

