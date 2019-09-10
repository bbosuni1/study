package com.hw3.controller;

import java.util.Random;
import java.util.Scanner;

public class NumberOk {

	private Random ran = new Random();
	
	public NumberOk() {}
	
	public void numGame() {
		Scanner sc = new Scanner(System.in);
		
		
		
		label:
		do {
				int random = ran.nextInt(100)+1;
			
			 System.out.println("난수 확인용 : " + random);	// ** 확인용

			for(int i = 1 ; ; i ++) {
					System.out.print("정수를 입력하세요 : ");
					int num = sc.nextInt(); 
					
					if ( random == num) {
						System.out.println("**** 정답입니다. ****");
						System.out.println(i + "번 만에 맞추셨습니다.");
					}
					else if(num > random) {
							System.out.println(num + "보다 작습니다." + i +"번째 실패 !!"); 
						continue;
					}
					else {
						System.out.println(num + "보다 큽니다." + i +"번째 실패 !!"); 
					continue;
					}
							while(true) {
							System.out.print("계속하시겠습니까?(Y/N) : ");
							String stop = sc.next();
							
							if("Y".equalsIgnoreCase(stop)) continue label;
							else if("N".equalsIgnoreCase(stop)) return;
							else System.out.println("잘못 입력하셨습니다."); continue;
							}
			} // for	
			
		}while(true); // do - while
	
	
	}//method
}// class
