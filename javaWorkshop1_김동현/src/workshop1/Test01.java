package workshop1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 % num2 >= 1) {
			System.out.println("나머지가 1보다 크거나 같다!");
		}
		else {
			System.out.println("나머지가 1보다 작거나 같다!");
		}

	}

}
