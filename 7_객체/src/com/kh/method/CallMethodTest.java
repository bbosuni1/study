package com.kh.method;

public class CallMethodTest {
		// 메소드는 다른 메소드를 호출할 수 있다.
	
	public static void main(String[] args) {
	
		// new CallMethodTest().method1();
		NonStaticMethod nsm = new NonStaticMethod(); 
		
		
		nsm.method(); //  자기 자신만 호출하여 수행하고 끝나는 메소드
		
		String str = nsm.method2(); // 수행 후 return 으로 저장된 값을 받는다.
		System.out.println(str);
		
		nsm.method3(10, 20);
		
		int sum = nsm.method4(20, 30);
		System.out.println("sum : " + sum);
		
		//---------------------------------------------//
		// static 메소드
		StaticMethod.method1();
		System.out.println("sum : " + StaticMethod.method2());
		StaticMethod.method3("홍길동");
		System.out.println("차감 포인트 : " + StaticMethod.method4(500));
		
	}

	public void method1() {
		
		System.out.println("저는 메소드1 입니다. ");
		method2(); // 다른 메소드 호출 = Call
	}
	
	public void method2() {
		
		System.out.println("저는 메소드2 입니다. ");
		method3();
	}
	
	public void method3() {
		
		System.out.println("저는 메소드3 입니다. ");
	
		// method3(); ----> method3 이 method3 을 계속 호출하여 반복하게 함
		// 재귀 호출
		// 하나의 메소드가 자기 자신을 반복적으로 재 호출하는 것을 말한다.
		// 무한 반복이나 메모리 용량초과, 시스템 자원 누수 현상을 발생시킬 수 있기 때문에
		// 사용이 권장되지 않는다.
		// 하지만, 수학적 계산이나 어떠한 규칙적인 업무를 수행하고자 할 때 
		// 종종 활용할 수는 있다.
	}
	
	// 재귀 호출의 예
	public int factorial( int num ) {
		if (num ==1 ) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
	
}
