package com.kh.excep.myExcep;

import java.util.Scanner;

public class MyExceptionTest {

	public void inputAge() throws MyException {
		// 나이를 입력받아 19세 이상이면 성인 입니다
		// 19세 미만이면 예외를 발생시키는 프로그램 만들기
		
		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age > 18 ) {
			System.out.println("성인 입니다. ");
		}
		else {
			throw new MyException("미성년자 입니다! "); // 성인이 아니면 에러 발생
		}
	}
	
}
