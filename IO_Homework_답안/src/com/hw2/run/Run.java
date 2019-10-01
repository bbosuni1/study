package com.hw2.run;

import com.hw2.controller.SungjukProcess;

public class Run {

	public static void main(String[] args) {
		// SungjukProcess 객체를 생성
		SungjukProcess sj = new SungjukProcess();
		
		// sungjukSave(), scoreRead() 메소드를 순차적으로 실행
		sj.sungjukSave();
		sj.scoreRead();
	}

}
