package com.kh.method;

public class StaticMethod {
		
		// 프로그램 실행 시에 static 영역에 저장되어
		// 프로그램 종료 시에 사라지는 공유 용도의 메소드
	
		// 1. 매개변수 x , 반환값 x
		public static void method1() { // 반환값이 없으면 void
			int num1 = 100;
			int num2 = 200;
			System.out.println("sum : "+ (num1 + num2));
		}
		
		// 2. 매개변수 x, 반환값 o
		public static int method2() {
			int num1 = 200;
			int num2 = 300;
			
			return (num1 + num2);
			
		}
		
		// 3. 매개변수 o, 반환값 x
		public static void method3(String name){
			System.out.println(name + "님이 로그인 하셨습니다. ");
			
		}
		
		// 4.매개변수 o, 반환값 o
		public static int method4(int point) {
			int max = 10000;
			
			return (max - point);
			
		}
}
