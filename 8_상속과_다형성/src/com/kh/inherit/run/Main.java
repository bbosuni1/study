package com.kh.inherit.run;

import com.kh.inherit.test.Child1;
import com.kh.inherit.test.Child2;
import com.kh.inherit.test.GrandChild;
import com.kh.inherit.test.Parents;

public class Main {

	public static void main(String[] args) {
		// 실행용 
		
		Parents p = new Parents();
		p.printStr();
		
		Child1 c1 = new Child1();
		c1.printStr();
		
		c1.printStr2();
		
		// p.printStr2(); 자식 클래스에 있는 것을 부모 클래스에서 실행 불가능.
		
		Child2 c2 = new Child2();
		c2.printStr(); // 자식 간에는 영향이 없다.
		
		GrandChild grc = new GrandChild();
		grc.printStr();
		
	}

}
