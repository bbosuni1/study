package com.hw1.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc = new Scanner(System.in);
	
	// 기본 생성자
	public FileController() {}
		
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder(); // 배열의 길이를 정하지 않고 StringBuilder의 배열 생성
		
		// 파일 내용 입력하기
		System.out.print("파일에 저장할 내용을 입력하시오 : ");
		String str = sc.nextLine();
	
	}
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
	
}
