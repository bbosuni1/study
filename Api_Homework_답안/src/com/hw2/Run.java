package com.hw2;

import com.hw2.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		SetDate tw1 = new SetDate();
		// todayPrint()을 출력한다.
		System.out.println(tw1.todayPrint());
		
		// setDay()을 출력한다.
		System.out.println(tw1.setDay());
	}

}
