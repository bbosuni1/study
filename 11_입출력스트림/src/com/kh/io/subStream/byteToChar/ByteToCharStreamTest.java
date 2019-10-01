package com.kh.io.subStream.byteToChar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ByteToCharStreamTest {
		
		// 바이트 스트림을 문자 스트림으로 바꿔주는
		// 보조 스트림 클래스
		// 입력 : InputStreamReader
		// 출력 : OutputStreamWriter
	
	public void fileSave() {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Sample3.dat"))){
			
			osw.write("졸립다.");
			osw.write("배부르다.");
			osw.write("자고싶다.");
			osw.write("집에 가고싶다.");
			osw.write("집에 가자.");
			
			System.out.println("파일 저장 완료!");
			
		} /*
			 * catch (FileNotFoundException e) { e.printStackTrace(); }
			 */ catch (IOException e) {
			System.out.println("파일 저장 중 문제가 발생했습니다.");
		}
	}
	
	public void fileOpen() {
		try( InputStreamReader isr = new InputStreamReader(new FileInputStream("Sample3.dat"))){
			
			int value;
			while( (value = isr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
