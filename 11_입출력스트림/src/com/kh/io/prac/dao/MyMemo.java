package com.kh.io.prac.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyMemo {
	// 사용자가 입력한 저장하거나
	// 특정 파일의 내용을 출력해서 보여주는
	// 간단한 메모 작성 프로그램
	Scanner sc = new Scanner(System.in);
	
	public void fileOpen(String fileName) {
		
	}
	public void fileSave(String fileName) {
			
		try(FileReader fr = new FileReader(fileName)){
				
				int value;
				
				while( (value = fr.read())!= -1) {
					System.out.println((char)value);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
