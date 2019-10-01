package com.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public void fileSave() {
		Book[] bk = new Book[5]; // Book객체를 받을 객체 배열
		// 객체 배열을 3번의 사용데이터로 초기화
		// (출판날짜는 아래 setCalendar 메소드를 활용)
		bk[0] = new Book("자바_소녀_네티", "정경석", 25000, setCalendar(2015,10,22), 0.1);
		bk[1] = new Book("이것이_자바다", "신용권", 30000, setCalendar(2015,1,5), 0.2);
		bk[2] = new Book("빨강머리_앤", "몽고메리", 16000, setCalendar(2019,5,10), 0.3);
		bk[3] = new Book("바다탐험대_옥토넛", "편집부", 11800, setCalendar(2015,5,1), 0.4);
		bk[4] = new Book("개미", "베르나르", 65000, setCalendar(2001,1,15), 0.5);
		
		// try with resource 구문으로 “books.dat”파일에 
		// 저장되게 ObjectOutputStream과 FileOutputStream을 생성
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			
			// 파일에 객체 배열의 값 저장
			for(int i=0;i<bk.length;i++) {
				oos.writeObject(bk[i]);				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public Calendar setCalendar(int year, int month, int date) {
		// 매개변수로 들어온 년, 월, 일로 설정된 Calendar형 반환
		Calendar pDate = new GregorianCalendar();
		pDate.set(year, month-1, date);
		
		return pDate;
	}

	public void fileRead() {
		Book[] readBook = new Book[10];
		// try with resource 구문 (FileNotFoundException과 
		// ClassNotFoundException, EOFException, IOException 처리)
		// 으로 “books.dat”파일을 불러오게
		// ObjectInputStream과 FileInputStream을 생성
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))){
			
			while(true) {
				System.out.println((Book)ois.readObject());
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			// 반복문을 통해 값을 다 읽어 들인 후 “books.dat 읽기 완료!” 출력
			// (EOFException 활용)
			System.out.println("books.dat 읽기 완료!");			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
