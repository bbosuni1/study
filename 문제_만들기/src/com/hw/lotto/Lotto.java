package com.hw.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		
		
		// 1-1. 로또 번호 입력
		System.out.print("로또 번호를 입력 하세요 : ");
		String[] num1 = new String[7];
		for(int i = )
		int num = sc.nextInt();

		// 1-2 for 반복문으로 7개 까지만 반복하는 방법
		
		
		// 2. 내가 입력한 로또 번호 출력
		
		// 배열을 오름차순 대로 정리하는 기능 1.
		Arrays.sort(n); 
		// 배열의 순서를 반복문으로 정리
//				int temp;
//				for(int i=0; i<a.length-1; i++) {
//					for(int j=i+1; j<a.length; j++) {
//						if(a[i] > a[j]) {
//							temp=a[i]; a[i]=a[j]; a[j]=temp;
//						}
//					}
//				}


		 for(int  p : n) {
		System.out.print(p + " ");
	 }
		
		 System.out.println(); // 줄 내림
		 
		 
		// 3. 로또 번호 추첨
		int[] num2 = new int[7]; // 로또 뽑는 숫자 만큼 배열 생성
		Random rnd = new Random(); // 랜덤 클래스 객체 선언
		
		 for(int i=0 ; i<=6 ; i++)  // 랜덤 메소드를 담기위한 반복문
	        {
	            num2[i] = rnd.nextInt(45)+1; // 1 ~ 46 까지의 랜덤 변수를 배열에 담는다
	            for(int j=0 ; j<i ; j++) {	// 중복을 제거하기 위한 메소드
	                if(num2[i] == num2[j])  // 
	                {
	                    i--;
	                }
	            }//for 내부
	        }//for 외부
		 
		 // 4. 추첨된 로또 번호 출력
		 Arrays.sort(num2);
		 for( int p : num2) {
		System.out.print(p + " ");
		 }
		 
		 // 5. 로또 번호와 내 번호를 비교
		 // count 를 사용하여 num1 배열 과 num2 배열을 돌려서 
		 
		 
    }//method
	
	
}// class
