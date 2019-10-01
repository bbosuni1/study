package com.kh.io.byteStream.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
		// 특정 데이터를 Byte 단위로 읽고 쓰는 
		// 입출력 스트림
		// 입력 : InputStream
		// 출력 : OutputStream
	
		public void fileOpen() {
			// 특정 파일로 부터 바이트 단위 데이터를 읽어오는 메소드
			
			FileInputStream fin = null;
			try {
				// 만약에 읽어오려는 파일이 없으면 
				// fileNotFoundException이 발생
				// 따라서 해당 예외를 반드시 등록해야 한다.
				fin = new FileInputStream("test.dat");
/*
	// 파일의 사이즈를 확인해서
	// 해당 사이즈 만큼 파일 읽어오기
	int fileSize = (int) new File("test.dat").length(); // long 을 int로 형변환 해야함
	// ex) 100byte 짜리의 파일이면 100개의 배열
	
	// 읽어올 byte를 여러 개 저장할 배열 서언
	byte[] readData = new byte[fileSize];
	
	// 해당 파일 정보 읽어오기
	fin.read(readData);
	
	// 읽어온 데이터 한 바이트씩 확인하기
	for(int i = 0 ; i < fileSize ; i++ ) {
		System.out.println(readData[i] + " " + (char)readData[i]); // char로 형변환 하여 문자변환
		// 한글 데이터는 바이트 스트림으로 읽어 올 때 글자가 깨지는데
		// 이는 바이트는 1바이트 씩 읽어오지만
		// 한글은 2바이트가 있어야 하기 때문이다.
		
		// 이와 같은 사례로 바이트 스트림을 통해 변경된 한글들은
		// 다시 원래의 한글문자로 되돌릴 수 없다.
	}
*/	
				// 일반적으로 파일을 읽어 올 때
				// 파일의 끝에 도달하면 -1 이라는 값을 돌려준다
				// 그 값을 파일의 끝이라고 생각하고 반복을 돌리는 방법도 있다
			int value;
			while((value = fin.read()) != -1) {
				System.out.println(value + " " + (char)value);
			}
				
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println("파일을 찾을 수 없습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fin.close();
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("파일 실행 중 에러가 발생했습니다.");
				}
			}
			
		} // method
		
		public void fileOpen2() {
			// try with resource
			try(FileInputStream fin = new FileInputStream("test.dat")){
				
				int fileSize = (int) new File("test.dat").length();
				
				byte[] readData = new byte[fileSize];
				
				fin.read(readData);
				
				for(int i = 0 ; i < fileSize ; i++) {
					System.out.println(readData[i] + " " + (char)readData[i]);
				}
				
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("파일을 읽는 도중 문제가 발생했습니다.");
		}
	} // method		
		
		public void fileSave() {
			// 특정 내용을 작성하여 
			// 파일로 해당 내용을 출력하기
			
			try(FileOutputStream fout = new FileOutputStream("test.dat")){
				
				// 만약 파일이 없다면 새로운 파일을 만들어 저장하고
				// 이미 파일이 존재한다면 덮어쓰기를 통해 파일을 저장한다.
				
				fout.write(97);
				
				fout.write(122);
				
				// 배열
				byte[] writedata = {80, 70, 99, 100, 120};
				fout.write(writedata);
				// 특정 배열번호부터 일정 길이까지
				fout.write(writedata, 1, 3 );
				
		} /* 이미 파일이 위에서 존재하기에 주석처리
			 * catch (FileNotFoundException e) { e.printStackTrace(); }
			 */catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	
} // class

