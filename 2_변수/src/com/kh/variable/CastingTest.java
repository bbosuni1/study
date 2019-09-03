package com.kh.variable;

public class CastingTest {
	// 각 데이터 간 형 변환 테스트하기 
	
public void testVariable1() {
		// 자동  형 변환
		// byte = 1byte;
		// short = 2byte;
		// int = 4byte;
		// long = 8byte;
		
		byte num1 = 10;
		short num2 = num1;
		
		//	byte result = num1 + num2; 
		// byte 와 short 는 계산 시 오버 플로우 가 발생할 것을 대비하여 자바에서 직접 자동으로 int자료 형으로 바꾸어 버린다. 
		// 따라서 byte나 short로 계산을 수행 했을때 int형 변수 공간으로 받아줘야 한다.
		int result = num1 + num2;
		
		char ch = 'a';
		int num3 = ch; // 문자를 숫자로 바꾸어도 자동 형 변환이 가능하다
		
		int num4 = 100;
		double db = num4;
		
	
	}
	
	public void testVariable2() {
		// 강제 형 변환 
		
		byte num1 = 10;
		short num2 = num1;
		
		byte result = (byte)(num1 + num2);
		
		System.out.println("result : "+ result);
		
		// 숫자를 문자로
		int chNum = 44000;
		char ch = (char)chNum;
		
		System.out.println("ch : "+ch);

		// 실수를 정수형 데이터로 
		
		double db1 = 190.96;
		int result2 = (int)db1;
		
		System.out.println("result2 :  "+ result2);
		
	}
	public void testVeriable3() {
		// 출력  메소드 
		
		// System.out.println();
		// System.in -- 입력장치 (키보드);
		// System.out -- 모니터 (모니터);
		// System.err -- 화면에 에러를 표시하는 역할
		
		// System.out.print() : 한 줄에 ()안의 내용을 출력하는 메소드
		// System.out.println() : 한줄에 ()안의 내용을 출력하고 한 줄 띄는 메소드
		// System.out.printf() : 특정 모양(형식)으로 원하는 내용을 출력하는 메소드 
		
		// \n : 다음 줄로 이동 
		// \r : 해당 줄의  첫번째 자리로 이동 
		// \t : tab과 동일한 효과를 부여 
		
		//%d : 10진수 표현
		//%f : 실수 표현
		//%c : 한 문자 
		//%s : 문자
		
		System.out.printf("%d \n", 100); 
		System.out.printf("%5d \n", 100); // 5d 5자리를 남겨두고 오른쪽부터
		System.out.printf("%-5d \n", 100); // 5자리를 확보하고 왼쪽부터
		System.out.printf("%05d \n", 123); // 5자리를 확보하고 0의 자리로 빈자리를 채워라 
		
		
		// --------------------------------------- //
		
		System.out.printf("%f \n", 123.456);
		System.out.printf("%.2f \n", 123.456); // 반올림해서 올려
		System.out.printf("%.2f \n", 123.1);
		System.out.printf("%d, %s, %f", 100, "안녕하세요", 1.23);
		
		
	}
	
}
