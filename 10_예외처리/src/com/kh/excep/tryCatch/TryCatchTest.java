package com.kh.excep.tryCatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryCatchTest {
		// 원래 예외 처리는 예외를 발생시키는
		// 메소드를 호출한 쪽에서 처리하는 것이 바람직하다.
	
		public void methodA() {
			System.out.println("methodA() 호출 확인!");
			
			
			try{
				
				methodB(); // 에러 있는 코드 호출
				
				System.out.println("문제가 발생하지 않았다면, 여기까지 실행 됩니다.");
				
			}catch(Exception e) { 
				
				System.out.println(e.getMessage()); // Exception에 담겨있는 에러메시지 호출
			
			}finally {
				System.out.println("문제 발생 여부와 상관없이 실행할 내용");
			}
			
			System.out.println("methodA() 종료!");
		
		}

		public void methodB() throws Exception  { // 에러를 던진다.
			System.out.println("methodB() 호출 확인...!");
			
				throw new Exception("강제로 예외 발생  ! !"); // 강제로 문제를 발생시키는 코드 ()안에 에러 메시지 담기 가능
			
			
		}
		
		public void ioTest2() {
			// try with resource
			// try 와 함께 사용하고 난
			// 입출력 객체 자원을 반납해주는 try문장
			// 사용형식
			// try( 반납할 자원 선언) {
			// .....
			// }catch(Exception e){
			// ....
			// }
			
			//try 선언하기
			try(
					// 입력 객체 선언하기 
					// 안녕 하세요 --> ㅇㅏㄴㄴㅕㅇ....
					
					BufferedReader bin = new BufferedReader(new InputStreamReader(System.in)); // 원래 스케너
					
					// 출력 객체 선언하기
					BufferedWriter bout = new BufferedWriter(new OutputStreamWriter(System.out));
					
					) {
				System.out.print("숫자 한 개 입력 : ");
				//bin 은 무조건 문자열만 가져온다.
				String str = bin.readLine();
				
				int num = Integer.parseInt(str); // 문자를 숫자로 변환
				
				bout.write("입력한 숫자의 2 배 값 : " + (num*2));
				
			}catch(Exception e) {
				
			//	e.printStackTrace(); 
			// 화면에 에러 메시지를 출력하는 메소드
				
				// Exception 클래스가 최상위 클래스이기 때문에
				// 여러 개의 클래스 예외를 선언하지 않아도
				// 다형성으로 인해 Exception 만으로 전부 캐치 할 수 있다.
				
			}
			
		}
		
		
}
