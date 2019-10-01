package com.kh.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties2 {

	public static void main(String[] args) {
		// properties 로 작성했던 내용 불러오기
		
		Properties prop = new Properties();
		
		try {
			// prop.load(new FileInputStream("driver.dat"));
			// prop.load(new FileReader("driver.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("pwd"));
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));

			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
