package com.hw1.test;

import java.util.Scanner;

public class ExceptinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cc = new Calculator();

		try {
	
			System.out.print("정수를 입력하세요 : ");
			System.out.print("결과 값 : " + cc.getSum(sc.nextInt()));
			
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
