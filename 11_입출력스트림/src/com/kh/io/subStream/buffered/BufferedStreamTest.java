package com.kh.io.subStream.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamTest {
	// 입력 혹은 출력에 대한 임시공간(버퍼)을 만들어
	// 데이터를 한 줄 단위로 처리할 수 있는 보조 스트림
	// 입력 : BufferedInputStream / BufferedReader
	// 출력 : BufferedOutputStream / BufferedWriter
	
	public void fileOpen() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("Sample2.dat"))){
			
			String temp;
			
			while((temp = br.readLine()) != null) {
				
				System.out.println(temp);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave() {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Sample2.dat"))){
			
			bw.write("배고프다. \n");
			bw.write("오늘 뭐먹지. \n");
			bw.write("짬뽕이나 먹자. \n");
			
			// bufferedWriter는 입력한 문자열을
			// buffer에 담아둔다
			// 따라서 현재까지 작성한 내용을 모두 전송하고자 할 경우
			// flush()라고 하는 메소드를 사용하여 모두 전송하고 
			// 버퍼를 비우게 된다
			
			bw.flush(); // 생략하더라도 close 하게 되면 그전에 알아서 전소하고 비운다.
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

} // class
