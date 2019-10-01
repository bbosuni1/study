package com.kh.collection.map;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestProperties {
	// Properties :
	// 특정 프로그램을 실행할 때
	// 함께 읽어오는 설정형식들( 언어 설정, 화면 사이즈, 로그인 정보 )
	// 저장하는 파일
	//	최근에 XML 방식으로 대체 되었으나
	// 아직 기존의 Properties 형식의 데이터를 사용하는 곳이 많아
	// 설정을 다룰 때 (유지보수, 운영) 알아둬야 할 문서
	
	// Properties는 Key도 , Value도 모두 문자열이다.
	// 따라서 형식은 map 형식이지만 값을 저장할 때는
	// 반드시 문자열만 저장해야 한다.
	
	public static void main(String[] args) {

		Properties prop = new Properties();
		
		// 값을 저장할 때는 setProperty() 메소드를 사용한다.
		prop.setProperty("id", "user01");
		prop.setProperty("pwd", "pass01");
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "드라이버 설정");
			prop.store(new FileWriter("driver.txt"), "JDBC 설정");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc oracle driver");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
