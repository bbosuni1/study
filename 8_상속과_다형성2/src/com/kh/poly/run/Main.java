package com.kh.poly.run;

import com.kh.poly.vo.*;

public class Main {

	public static void main(String[] args) {
		// 다형성 테스트
		
//		
//		Parents p = new Parents();
//		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//		
//		p.sayMyName();
//		c1.sayMyName();
//		c2.sayMyName();
//
		
		// 다형성을 적용했을 때
		Parents p = new Parents();
		Parents c1 = new Child1();
		Parents c2 = new Child2();
		
		p.sayMyName();
		c1.sayMyName();
		c2.sayMyName();
		
		
	}

}
