package workshop1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// ArrayList & Collections 임포트하여 사용
		ArrayList<Integer> testList = new ArrayList<>(); // 정수를 담는다.
																						 // 정수형을 설정하지 않아도 담을 수 있다 ArrayList는 모든 자료형을 담을 수 있다.
		testList.add(num1);
		testList.add(num2);
		testList.add(num3);

		System.out.println(" 최대값 : " + Collections.max(testList));
		System.out.println(" 최소값 : " + Collections.min(testList));
	}

}
