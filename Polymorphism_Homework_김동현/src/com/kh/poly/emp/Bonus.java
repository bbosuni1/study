package com.kh.poly.emp;

public interface Bonus { // 인터페이스

	//static final int pay = 100;  인터페이스 상수 선언 후 인센티브 입금.
	// 인터페이스 클래스에서 상수로 인센티브를 설정하는 것인지 아닌지 잘 모르겠음. 
	// 그냥 메소드 내부로 변경
	
	public abstract void incentive(int pay); //
	
	
}
