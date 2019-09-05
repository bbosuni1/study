package com.kh.cafe.run;

import java.util.Scanner;

import com.kh.cafe.model.vo.Coffee;

public class Cafe {
	
	public static final int CUP = 5;
	public static int count ;

	public static void main(String[] args) {
		// 커피 판매점 ver2
		// 객체 배열 활용하기
		
		Coffee[] coffeeArr = new Coffee[CUP]; // 커피 누적을 위한 배열
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("----- Cafe 2호점 -----");
			System.out.println("1. 오늘의 커피");
			System.out.println("2. 고객 주문 커피");
			System.out.println("3. 당일 판매 내역 조회");
			System.out.println("4. 영업 종료 하기");
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				//System.out.println(count); // 0 으로 들어감
				coffeeArr[count++] = new Coffee(); // 기본생성자
				//System.out.println(count); // 1이 되어서 나옴
				coffeeArr[count -1].coffeeInfo(); // 주문한 커피 안내 메시지
				//System.out.println(count-1); // 따라서 1-1 한 0 번째 배열의 내용이 출력
				break;
			case 2 : inputCoffee(coffeeArr);
				coffeeArr[count -1].coffeeInfo();
				break;
			case 3 : printAllCoffee(coffeeArr);
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :	
				System.out.println("잘못 입력 하셨습니다.");
			
			}
		}while(true);

	}
	
	public static void inputCoffee(Coffee[] coffeeArr) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 명 : ");
		String name = sc.next();
		System.out.print("원산지 : ");
		String origin = sc.next();
		System.out.print("Size : ");
		String size = sc.next();
		System.out.print("얼음 : ");
		boolean  ice = sc.nextBoolean();
		
		coffeeArr[count++] = new Coffee(name, origin ,4000, size, ice );
		
	}

	public static void printAllCoffee(Coffee[] coffeeArr) {
		int sum = 0 ;
		for(int i = 0 ; i < count ; i++) {
			coffeeArr[i].coffeeInfo();
			sum += coffeeArr[i].getPrice();
			
		}
		System.out.println("총 합계 : " + sum + " 원");
	}
	
}
