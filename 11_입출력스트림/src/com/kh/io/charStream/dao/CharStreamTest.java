package com.kh.io.charStream.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTest {
		// 문자 기반 데이터 입출력 클래스
		// 입력 : Reader ( 컴퓨터 기준으로 읽는다)
		// 출력 : Writer
	
	public void fileOpen1() {
		
		try( FileReader fr = new FileReader("sample.txt")){
			
			int value;
			
			// 바이트 스트림과 다르게
			// 2바이트씩 묶어서 읽어온다.
			
			while((value = fr.read()) != -1 ) { // fr.read 로 2바이트 식 읽어서 value에 담는다
																		// - 의 값을 꺼내올수 없는 구조이다 따라서 중간의 내용이 -1이더라도 끝나지 않는다
																		// ' -1 ' 이라는 값은 존재하지 않는다.
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileSave1() {
		
		// 만약 이전 내용을 유지하고, 이어스기를 하고 싶다면
		// fileWirter / OutputSgream을 선언할 때 파일 명 뒤에 true를
		// 붙여 생성하면 된다.
		
		try(FileWriter fw = new FileWriter("sample.txt",true)){
			
			fw.write("Hello World \n");
			fw.write("졸립니다 \n");
			fw.write("ruel - painkiller \n");
			fw.write("300번 \n");
			
			char[] chArr = {'a' , 'p','p','l','e'};

			fw.write(chArr );
			fw.write("\n" );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	} // class
