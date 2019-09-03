package com.logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	// 실제 문제를 풀어야할 메소드만을 가진 클래스
	// 과제 4 ~
	Scanner sc = new Scanner(System.in); // 스캐너 사용
	Random rnd = new Random();  // 랜덤 변수 클래스
	
	public void calculator() {
		
		System.out.println("***** 간단 계산기 *****");
		
		// 변수 지정 및 입력
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산문자 : ");
		char ch = sc.next().toUpperCase().charAt(0); // x or X 둘다 대문자 변환
		
		int result = 0;
		
		switch (ch) {
		case '+' :
			 result = num1 + num2;
		  break;
		  
		case '-' :
			result = num1 - num2;
			break;
		
		case 'X' :
			result = num1 * num2;
			break;
	
		case '/' :
			
			if(num2 ==0) {System.out.println("0으로 나눌 수 없습니다."); // num2 가 0일 때를 위한 조건문 
			//result = 0; 스위치 밖에서 이미 0으로 초기화 해두었음으로 필요없음.
			break;
			}
			result = num1 / num2; 
			
		}//switch
		
		System.out.printf("%d %s %d = %d \n", num1, ch , num2, result); // 출력
	
	}//method 
	
	public void totalCalculator() {
	   
			System.out.println("***** 작은수에서 큰수까지 합계 구하기 *****");
		
			// 1. 두개 정수 입력받기
	     	System.out.print("첫번째 정수 : ");
	        int num1 = sc.nextInt();
	        System.out.print("두번째 정수 : ");
	        int num2 = sc.nextInt();
	     
	        // 2. 합 변수
	        int sum = 0;
	     
	        // 3. if 문과 for문 같이 사용.   
	        
	        // num2가 num1보다 큰 경우
	        if(num1 < num2) {  
			        for(int i = num1 ;i <= num2; i++) {
			           sum += i;
			       }
	       System.out.println(num1 + "부터 " + num2 + "까지 정수들의 합계 : " + sum); 
	        }
	        // num1 이 num2 보다 큰 경우
	        else{ 
			        for(int i = num2 ;i <= num1; i++ ) {
			           sum += i;
			        }
	      System.out.println(num2 + "부터 " + num1 + "까지 정수들의 합계 : " + sum);
	        
	        	}
	        
	      }//method
	
	public void profile() {
		
		System.out.println("***** 신상정보 확인하기 *****");
		
		//변수 기록
		String name = "김동현", gender ="남성", chara = "노답";
		int age = 30;
		
		//변수 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + chara);
		
		}//method
	
	public void sungjuk() {

		  System.out.println("***** 학생정보 확인하기 *****");
		  
	      String name;
	      int grade;
	      int room;
	      int num;
	      char gender;
	      double result;
	      char score;
	      
	      System.out.print("이름 : ");
	      name = sc.next();
	      
	      System.out.print("학년 : ");
	      grade = sc.nextInt();
	      
	      System.out.print("반 : ");
	      room = sc.nextInt();
	      
	      System.out.print("번호 : ");
	      num = sc.nextInt();
	      
	      System.out.print("성별(M/F) : ");
	      gender = sc.next().toUpperCase().charAt(0);
	      
	      System.out.print("성적 : ");
	      result = sc.nextDouble();
	      
	      if(result >= 90.0) {
	         score = 'A';
	      } else if(result >= 80.0 && result < 90.0) {
	         score = 'B';
	      } else if(result >= 70.0 && result < 80.0) {
	         score = 'c';
	      } else if(result >= 60.0 && result < 70.0) {
	         score = 'D';
	      } else {
	         score = 'F';
	      }
	      
	      System.out.print("학점 : ");
	      System.out.println(score);
	      
	      System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f이고, %c학점 입니다. \n", grade, room, num, (gender == 'M') ? '남' : '여' , name, result, score);      
	   }
	   
	public void printStarNumber() {
		   
		   System.out.println("***** 별과 숫자 출력하기 *****");
		  
	       // 정수 하나 입력받기
			// if 문 과 2중 for 문
			System.out.print("정수를 입력 하시오 : ");
			int num = sc.nextInt();
			
			// num 이 양수
			if(num > 0) {
			for ( int i = 1 ; i <= num ; i++) {
				
				for(int j = 2 ; j <= i ; j++){
						System.out.print("*"); // * 출력 i2=2 로 시작하여 첫번째 별 생략
				} // for2
					System.out.printf("%d \n", i); // 줄내리기 + 숫자 출력
				
				}// for1
			}//if	
			else {
				System.out.println("양수가 아닙니다.");
			}//else
		}//method
	    
	public void sumRandomNumber(){
		System.out.println("***** 난수까지의 합계 구하기 *****");
		// 팀원 설명용 random class 
		/*	1. Random class
		 *  java.util 에서 임포트 하여 사용
		 * Random 객체명 = new Random(); 형식
		 *                   ^------ 객체 생성 Scanner 사용할때를 생각하면 이해가 쉽다. 
		 * 객체명.nextInt()
		 * 객체명.nextDouble() / nextLong() / nextFloat() 등등
		 * 이중 int 의 경우 ------------> 객체명.nextInt(n)
		 * 																				 ^---------- 0 부터 (n-1) 까지의 n개의 랜덤 정수 발생 (zero-based-index)
		 * 
		 * 2. Math class
		 * Math.random() 형식 
		 * 비교적 간단하나 0~1 사이의 무수한 실수형 난수 발생
		 * 따라서 원하는 값으로 사용하기 위하여 형변환이 필요하다.
		 * ex)		 (int)Math.random()*100 --------------> 0~99 사이의 랜덤 정수
		 * 
		 */
		
		int num = rnd.nextInt(100)+1; // 1~100 까지 랜덤 정수 지정
		int sum = 0 ; // 정수의 합 변수 지정
		
		System.out.println("랜덤 정수 확인 : " + num);
	
		// 반복문을 통하여 sum 구하기
		for ( int i = 1 ; i <= num ; i++) { 
			sum += i;
		}
		
		//출력
		System.out.println("1 부터 임의의 정수 " + num +" 까지의 합은 " + sum + " 입니다.");
		
	}
	
	public void conutinueGugudan() {
		System.out.println("***** 구구단 *****");
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt(); // 정수 입력
		
		if(num > 0) { // 양수일때
			
			for( int i = 1 ; i <10 ; i++) {
				if(i % num == 0) continue; // i가 num의 배수일때 반복문으로 돌아감
				System.out.println(num + "*"+ i + "=" + num*i);
			}//for
			
		}//if
		else { // 0 혹은 음수
			System.out.println("입력된 수는 : " + num);
			System.out.println("양수가 아닙니다.");
			
		}

	}//method
	
	public void shutNumber() {
		System.out.println("***** 주사위 숫자 알아 맞추기 *****");
		
		// 변수 지정
		int num;
		int r1, r2; // 랜덤 주사위
		char stop; // y/n 확인용
		
		// 난수 뽑기
		
		do {
				r1 = rnd.nextInt(6)+1;
				r2 = rnd.nextInt(6)+1;
				
				// System.out.println("난수1 확인용 : " + r1);	// ** 확인용
				// System.out.println("난수2 확인용 : " + r2);	// ** 확인용
		
				
			// 정답 맞출때 까지 자동 반복하고
			// 정답을 맞춘 후 새로운 주사위로 새로하고 싶은 경우 y or n 로 선택
				
			// 같은 주사위로 정답 혹은 틀렸을 때마다 계속 할 것인지 묻는경우
			// 랜덤 주사위를를 do-while 밖으로 빼고 내부 while문을 지운다. 
				
				
				 //---------------------------------------------------------//
						while(true) {
								// 정수 입력 및 저장
								System.out.print("정수를 입력하세요 : ");
								num = sc.nextInt(); 
								
								if ( r1 + r2 == num) {
									System.out.println("**** 정답입니다. ****");
								}
								else {
									System.out.println("xxxx 틀렸습니다. xxxx"); continue;
								}
						
									// 계속 확인
									System.out.print("계속하시겠습니까?(Y/N)");
									stop = sc.next().toUpperCase().charAt(0); // y or n 저장 대문자로 
									if(stop == 'N' ) return; // N 일경우 나가기
									
									else break; // n아 아닐 경우 외부 do - while 문으로 리턴
						}//while
				//-----------------------------------------------------------//
						
		}while(true); // do - while
	
	}//method
	
}// class
