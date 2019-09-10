package com.kh.excep.inherit;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
		// 자식 메소드는
		// 부모의 메소드를 오버라이딩 할 때
		// 그대로 부모의 것을 사용하거나
		// 부모에 정의된 예외 객체보다 하위에 있는 것들만 사용이 가능하다.
	
	// 부모보다 자식은 더 큰 예외를 발생 시킬 수 없다.
	// IOException < Exception
	//	@Override
	//	public void testExcep() throws Exception {
	//		super.testExcep();
	//	}
	
	// 자식 메소드는 부모 메소드의 예외보다 더 하위에 있는 예외는 사용이 가능하다.
	@Override
	public void testExcep() throws FileNotFoundException {
		System.out.println("자식 메소드로 예외 재정의하기");
	}
	
	
		
}
