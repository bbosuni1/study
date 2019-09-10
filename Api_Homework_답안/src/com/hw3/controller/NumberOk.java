package com.hw3.controller;

import java.util.Scanner;

public class NumberOk {
	private int ran;

	public NumberOk() { }
	
	public void numGame() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) { // 게임 반복 실행 용 while문
			ran = (int)(Math.random()*100+1);
			// System.out.println(ran);	// 정답 체크용으로 미리 확인하기
			int i=0;
		
			while(true) { // 문제 반복 실행 용 while문
				i++; // 반복횟수
				System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();
				sc.nextLine(); // 엔터값 제거
				
				if(ran < num) {
					System.out.println(num+"보다 작습니다."+i+"번째 실패!! ");
				}	
				else if(ran > num) {
					System.out.println(num+"보다 큽니다."+i+"번째 실패!! ");
				}
				else {
					System.out.println(i+"번 만에 맞췄습니다!");
					while(true) {  // 계속할 것인지 반복해서 묻는 whlie문
						System.out.print("계속  하시겠습니까?(y/n) : ");
						str = sc.nextLine();
						if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
							break;
						else
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
							continue;
					}
				}
				if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
					break;
			}
			if(str.equalsIgnoreCase("y")) {
				System.out.println("\n새로운 게임을 시작합니다!!");
				continue;
			}
			else if(str.equalsIgnoreCase("n")) {
				System.out.println("게임을 종료합니다.");
				return;
			}
		}
	}
}
