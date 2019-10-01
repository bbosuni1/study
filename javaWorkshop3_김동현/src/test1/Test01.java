package test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		
		System.out.print("정수를 입력하세요 : ");
		System.out.println("결과 : " + c.calculate(sc.nextInt()));
		
	}

}
