package com.kh.collection.list.sort;

import java.util.Comparator;

public class AscPriceSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 만약 o1 의 내용이 o2의 내용보다 크다면 양수를,
		// o1의 내용이 o2의 내용보다 작다면 음수를 반환하여 
		// 정렬에 사용한다.
		// ex) num1, num2 / num1- num2 = 양수 
		
		Fruits f1 = (Fruits)o1;
		Fruits f2 = (Fruits)o2;
		int result = 0;
		
		// if -else 
		if(f1.getPrice() > f2.getPrice()) {
			result = 1;
		}else result = -1;
		
		// 삼항 연산자도 사용가능
		
		return result; // f1.getPrice() - f2.getPrice();
	}

}
