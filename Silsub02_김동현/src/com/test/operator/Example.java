package com.test.operator;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		
		
		// 국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
		int kor, eng, math, sum;
		double avg;
		// 스캐너 사용
		Scanner sc = new Scanner(System.in);
		// 각 점수를 키보드로 입력
		
		//	System.out.print("국어, 영어, 수학 : ") 엔터 전까지 읽음으로 가능 함으로 한번에 입력 할 수 있다.
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		// 합계 와 평균 계산
		sum = ( kor + eng + math );
		avg = (double)sum/3;
		//	avg = sum/3.0;  ** 3.0으로 처리하면 자동 형변환이 일어남.
		
		// 합격의 조건 
		String result = ( kor < 40 ) ? "불합격입니다" : ( (eng < 40) ? "불합격입니다": ( ( math < 40) ? "불합격입니다": (avg < 60) ? "불합격입니다." : "합격입니다"));
		
		// String result = (result (kor>=40) && 2 && 3 && 4 ) ? "합" : "불";
		// 이런 식으로도 가능할 듯 어느 방법이 더 좋은지 모르겠음
		
		//출력
		System.out.println("결과는 : "+ result);
		
	}

	public void example2() {
		
		//변수를 선언하고 키보드로 입력받은 값들을 변수에 기록하고  변수값을 화면에 출력 확인함
		// 변수선언
		String name;
		int grade, cls, num;
		char gen;
		double result;
		
		Scanner sc = new Scanner(System.in);
		// 키보드로 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		//		System.out.print("학년, 반, 번호를 입력하세요 : "); 도 가능할 듯 
		//		그러나 문자열과 섞여 있음으로 하나씩 처리하는게 좋다
		System.out.print("학년을 입력하세요 : ");
		grade = sc.nextInt();
		System.out.print("반을 입력하세요 : ");
		cls= sc.nextInt();
		System.out.print("번호을 입력하세요 : ");
		num = sc.nextInt();
		System.out.print("성별을 입력하세요(M/F) : ");
		//gen = sc.next().charAt(0);
		gen = sc.next().toUpperCase().charAt(0); // toUpperCase() : 대문자로 변환해 주는 기능
		
		// 성별이 'M' 이면 남학생 아니면 여학생으로 출력
		gen = (gen == 'M') ? '남' : '여';
		
		System.out.print("성적을 입력하세요 : ");
		result = sc.nextDouble();
		
		//화면 출력
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f 다", grade, cls, num, gen ,  name, result);
			
	}

	public void example3() {
		// 정수 변수 선언
		int num;
		
		Scanner sc = new Scanner(System.in);
		// 키보드로 부터정수 하나 입력받음
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		//String str = ( num > 0  ) ? "입력한 값은 양수다" : "입력한 값은 양수가 아니다" ; 도 가능
		
		// System.out.print("정수를 입력하세요 : ");
		// System.out.println(( sc.nextInt() > 0  ) ? "입력한 값은 양수다" : "입력한 값은 양수가 아니다" );
		// 짧게도 가능
		
		// 출력
		System.out.println(( num > 0  ) ? "입력한 값은 양수다" : "입력한 값은 양수가 아니다" );
	
	}

	public void example4() {
		// 정수 변수 선언
		int num;
		// 문자열 변수 선언
		String str;	
		
		Scanner sc = new Scanner(System.in);
		// 키보드로 부터 정수 하나 입력
		System.out.print("정수 값을 입력하세요 : ");
		num = sc.nextInt();
		
		// 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록
		// 짝수가 아니면 "홀수다"를 문자열 변수에 기록
		str =((num % 2 == 0) ? "짝수다":"홀수다");
		
		// 문자열변수 값 출력
		System.out.println("입력한 정수는 : " + str);
		//System.out.println("입력한 정수는 : " + (str =((num % 2 == 0) ? "짝수다":"홀수다")));
		
		
	}
		
}
