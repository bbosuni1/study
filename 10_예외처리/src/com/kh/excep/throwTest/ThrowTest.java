package com.kh.excep.throwTest;

public class ThrowTest {
	// 에러 상황이 발생할 때
	// 개발자가 미연에 방지할 수 있는
	// 에러들은 예외(Exception)라고 한다.
	
	public void methodA() throws Exception{ // A도 넘긴다.
		System.out.println("methodA가 호출 되었습니다!");
		
		methodB(); // 메소드 b 호출
		
		System.out.println("methodA를 종료합니다.");
		
	}
	
	public void methodB() throws Exception { // 호출된 메소드C가 문제가 발생할 것을 알기때문에 메소드B도 넘긴다.
		System.out.println("methodB가 호출 되었습니다!");
		
		methodC(); // 문제 있는 메소드 호출
		
		System.out.println("methodB를 종료합니다.");
		
	}
	
	public void methodC() throws Exception { // 문제를 넘긴다는 표시 === > 문제가 발생할 것을 감안하고 사용
		System.out.println("methodC가 호출 되었습니다...");
		
		// throw : 문제 상황을 발생시키는 명령어
		//throw new Exception();
		
		// 문제가 발생하면 아래 까지 갈 수 없다.
		// 해당 에러까지만 일을 수행하고
		// 그 밑의 코드는 수행하지 않는다.
		// System.out.println("methodC를 종료합니다.....");
		
	}
	
}
