package com.kh.silsub2.example;

import java.util.Scanner;

public class Munjae {
	
	Scanner sc = new Scanner(System.in);
	// 키보드 on
	
	public void test1() {
		// 국, 영, 수 과목 점수 키보드로 입력
		int kor, eng, mat;
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		// 합계와 평균 계산
		int sum = kor + eng + mat;
		double avg = (double)(sum/3);
		
		// 합격의 조건 처리
		if(avg > 59 && kor >39 && eng>39 && mat>39) {
			System.out.printf("합격입니다. 국어 : %d 영어 : %d 수학 : %d 총점 : %d 평균 : %.2f 입니다.", kor, eng, mat, sum, avg);
		}
		else {
			System.out.println("불합격 입니다.");
		} // if 문 종료
		
		
		
	}//메소드 종료
	
	public void test2() {
		// switch 문 사용
		
		// 초기 메뉴 출력
		System.out.println("*** 초기 메뉴 ver. 999 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		// 메뉴 번호 입력
		System.out.print("메뉴를 선택 하세요 : ");
		int num = sc.nextInt();
		
		// 처리 내용과 출력
		switch(num) {
		case 1 : System.out.println("입력메뉴가 선택 되었습니다."); break;
		case 2 : System.out.println("수정메뉴가 선택 되었습니다."); break;
		case 3 : System.out.println("조회메뉴가 선택 되었습니다."); break;
		case 4 : System.out.println("삭제메뉴가 선택 되었습니다."); break;
		case 7 : System.out.println("종료메뉴가 선택 되었습니다."); break;
		default : System.out.println("번호가 잘 못 입력되었습니다. 다시 입력하십시오."); // 처음으로 돌아가려면 반복문?
		return;
		
		}// 스위치 종료
		
		
		
	}
	
	public void test3() {
		// 정수 변수 선언
		int num;
		// 키보드로 부터 정수 값 입력
		System.out.print("정수 값 : ");
		num = sc.nextInt();
		// 입력받은 정수 판단
		if(num>0) {
			System.out.printf("입력한 값 : %d는 정수다", num);
		}
		else if (num == 0 ) {
				System.out.printf("입력한 값 : %d는 0이다", num);
		}
		else {
			System.out.printf("입력한 값 : %d는 음수이다", num);
		}
		
		
	}

	public void test4() {
		// 정수 변수 선언
		int num;
		
		// 문자열 변수 선언
		String str = "";
		
		// 정수 하나 입력 받기
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		// 단, 양수일때만?
		/* 지나치게 복잡함.		
  		if(num > 0){
		int result = num;
		}
		else {
			System.out.println("다시 입력하세요.");
			return;
		}
		
		
		// 조건 판단 후 문자열 기록
		if (num % 2 == 0) {
			str = "짝수다";
		}
		else {
			str = "홀수다";
		}
		// 출력
		System.out.printf("입력한 %d 는 %s.", num, str);
		*/
		
		// 7번의 다중 if 문 사용.
		if(num > 0) {
			if(num %2 == 0) {str = "짝수다";
			}
			else {str = "홀수다";
			}
		}// 첫 if 종료	
		else { System.out.println("잘못된 입력 입니다.");
			return;
		}//else 종료
		
		System.out.printf("입력한 %d 는 %s.", num, str);
		
	}//메소드 종료

	public void test5() {
		// 변수 선언
		String name;
		int age;
		double height;
		
		// 각 값을 입력 받아 변수에 저장
		System.out.print("이름을 입력하세요 :");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 :");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 :");
		height = sc.nextDouble();
		
		// 이름이 null이 아니면서 글자갯수가 0보다 크고,
		// 나이와 키가 양수일 때만 화면에 출력함.
		
		if(name.charAt(0) > 0 && age > 0 && height > 0) {
			System.out.println("asdas");
		}
		else {
			System.out.println("gg");
			return;
		}
		
		
	}

	public void test6() {
		// 두개의 정수 변수 선언
		int num1, num2;
		// 키보드로 두 개의 정수를 입력, 두 수 모두 양수일 때만
		System.out.print("두개의 정수를 입력하세요 : " );
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// 양수 확인 하고 출력
		if ( num1 > 0 && num2 > 0) {
			System.out.printf("첫번째 정수 : %d \n", num1);
			System.out.printf("두번째 정수 : %d \n", num2);
			System.out.printf("%d + %d = %d \n", num1,num2, num1+num2);
			System.out.printf("%d - %d = %d \n", num1,num2, num1-num2);
			System.out.printf("%d * %d = %d \n", num1,num2, num1*num2);
			System.out.printf("%d / %d = %d \n", num1,num2, num1/num2);
			System.out.printf("%d %% %d = %d \n", num1,num2, num1%num2);
		}
		
		else {
			System.out.print("잘못된 정수 입니다.");
			return;
		}
		
	}

	public void test7() {
		// 정수 변수와 문자 변수 선언
		int score;
		String grade ="" ;
		
		// 키보드로 점수를 입력 받아, 정수 변수에 저장
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		// 단 점수는 반드시 0 이상의 값이여야 함.
		if ( score > 0) { 
			if ( score > 90 ) { grade = "A";	
			}
			else if ( score < 90 && score >79) {
				grade = "B";
			}
			else if ( score < 80 && score >69 ) {
				grade = "C";
			}
			else if ( score < 70 && score > 59 ) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			
		} // if 처음
	
		// 출력
		System.out.printf("점수 : %d \n학점 : %s", score, grade);
	}// 메소드 종료
}//클래스 종료
