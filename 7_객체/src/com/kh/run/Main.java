package com.kh.run;

import com.kh.field.FieldTest;

public class Main extends FieldTest {

	public static void main(String[] args) {
		// static은 공유용도이기 때문에 
		// new를 하지 않아도 접근이 가능하다.
		FieldTest.num1 = 10;
		
		// public 부터 확인하기
		FieldTest ft = new FieldTest();
		
		ft.test4 = 10; // public
		
		Main ftChild = new Main();
		
		ftChild.test3 = 100; // protected
	}

}
