package com.kh.io.subStream.objStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.subStream.objStream.model.vo.Car;

public class ObjectStreamTest {
	// DAO : Data Access Object
	// 데이터를 저장하는 역할을 담당한 클래스
	
	public void fileSave() {
		
		Car[] carArr = {
				new Car("제네시스",5000, 5),
				new Car("프라이드",2500, 4 ),
				new Car("에스페로",10000, 4),
		};
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cars.dat"))){

			
			for(int i = 0 ; i < carArr.length ; i++) {
				oos.writeObject(carArr[i]);
			}
			
			oos.flush();
			
			System.out.println("객체 저장 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void fileOpen() {
		Car[] carArr = new Car[3];
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cars.dat"))) {
			
			for(int i = 0 ; i < carArr.length; i++) {
				carArr[i] = (Car)(ois.readObject());
			}
			
			// 객체배열, 배열에 쓸 수 있는 for-each 반복문
			for( Car c : carArr) {
				System.out.println(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
