package workshop3.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 : ");
		System.out.println("결과 : " + calc.calculate(sc.nextInt()));
	}

}
