package com.hw1.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc = new Scanner(System.in);

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		// “파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :”
		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		
		// 값을 Scanner로 입력 받아 StringBuilder에 저장하고, “exit”을 입력 했을시 빠져
		// 나가는 while문 생성
		String temp = null;
		do {
			temp = sc.nextLine();
			
			// equalsIgnoreCase()는 대소문자 무시!
			if(temp.equalsIgnoreCase("exit"))
				break;
			else {
				sb.append(temp + "\n");
			}
			
		} while(true);
		
		// “저장하시겠습니까? (y/n)”
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		// 저장할 파일명을 입력 받음
		System.out.print("저장하시겠습니까? (y/n)");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) {
			// “입력받은 파일명.txt”로 저장되게
			// BufferedWriter와 FileWriter 스트림 사용
			// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.”
			System.out.print("저장할 파일명을 입력하시오 : ");
			String fileName = sc.nextLine();
			BufferedWriter bw = null;
			
			try{
				bw = new BufferedWriter(new FileWriter(fileName+".txt"));
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {  // 열었던 스트림 close
				try {
					bw.close();					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}else {	
			// 입력 받은 값이 y가 아닌 어떤 값이든 “다시 메뉴로 돌아갑니다.” 출력과 메소드
			// 종료
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}

	public void fileOpen() {
		// “열기 할 파일명 : “
		System.out.print("열기 할 파일명 : ");
		
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		String fileName = sc.nextLine();
		BufferedReader br = null;
		String temp = null;
		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			br = new BufferedReader(new FileReader(fileName+".txt"));
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 열었던 스트림 close
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}catch(NullPointerException e) {
				System.out.println("파일 입력 객체 닫기 실패!");
			}
		}
	}

	public void fileEdit() {
		// “수정 할 파일명 : “
		System.out.print("수정할 파일명 : ");
		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		// 스트림 사용		
		String fileName = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String temp = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(fileName+".txt"));
			bw = new BufferedWriter(new FileWriter(fileName+".txt", true));	// 기존 파일 내용 그대로 두고 추가
			
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				temp = sc.nextLine();
				if(temp.equalsIgnoreCase("exit"))
					break;
				else {
					sb.append(temp + "\n");
				}			
			}
			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) {
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");		
			}else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 열었던 스트림 close
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
