package com.kh.prac.run;

import com.kh.prac.model.vo.*;

public class Main {

	public static void main(String[] args) {

		// 1. 상속 확인하기
//		Apple a = new Apple("붉은 색", true, "장수");
//		Banana b = new Banana("노란색", true, "부산");
//		Cherry c = new Cherry("자주색", true, "평택");
//		
//		System.out.println(a);
//		a.stomach();
//		System.out.println(b);
//		b.toothwhite();
//		System.out.println(c);
//		c.earn();
		
		// 2. 다형성
		Fruit f1 = new Apple("보라색", true,"러시아");
		Fruit f2 = new Banana("초록색", true,"러시아");
		Fruit f3 = new Cherry("푸른색", true,"러시아");
		
		// 객채 배열
		Fruit[] fruits = new Fruit[3];
		fruits[0] = f1;
		fruits[1] = f2;
		fruits[2] = f3;
		
		for( int i = 0 ; i < fruits.length ; i++) {
			System.out.println(fruits[i]);
			// fruits[i].stomach(); // ERROR!
			if( fruits[i] instanceof Apple) {
				((Apple)fruits[i]).stomach(); // 다운 캐스팅
			}
			else if( fruits[i] instanceof Banana) {
				((Banana)fruits[i]).toothwhite(); // 다운 캐스팅
			}
			else if( fruits[i] instanceof Cherry) {
				((Cherry)fruits[i]).earn(); // 다운 캐스팅
			}
		
		}

	}
}
