package com.kh.excep.throwTest;

public class Run {
	
	// 메인 메소드에서 까지 예외처리 구문을 던지게 되면
	// 프로그램이 강제 종료된다.
	
	public static void main(String[] args) /*throws Exception*/ { 

		ThrowTest tt = new ThrowTest();
		
		// 문제가 발생하는 메소드 위 아래로 
		// try-catch 구문으로 묶어
		// 직접 문제를 처리할 수 있다.
		
		try {
			// try 내부에는 문제가 발생할 수 있는 코드
			tt.methodA(); // 에러가 호출되어서 실행 불가
		
			}catch ( Exception e) { // catch ( 받을 내용 == > 여기선 exception )
					// 문제가 발생한 시점에 동작할 코드
					// 문제가 없다면 넘어간다.
					
					// e.printStackTrace(); // 빨간 에러 코드 출력 기능 , 사용자는 볼 필요가 없기 때문에 주석처리
				
					System.out.println("예외가 발생하여 catch로 넘어왔습니다.");
				
			} finally {
				
				// 예외 발생 여부와 관계 없이 실행할 코드 (예외에 상관 없이 무조건 실행)
				System.out.println("여긴 finally 부분 입니다.");
			}
		
		System.out.println("프로그램을 정상 종료합니다.");
		
	}

}
