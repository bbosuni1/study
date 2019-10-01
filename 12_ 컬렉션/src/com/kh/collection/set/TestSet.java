package com.kh.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	// set : 
	// List와는 대조되는 특성을 가진 자료 구조 기법.
	//	set은 중복을 허용하지 않으며
	// 순서가 유지되지 않는다.
	// 종류로는 크게 HashSet, TreeSet, LinkedHashSet이 있다.
	
	public static void main(String[] args) {
		// HashSet 테스트
		HashSet hset = new HashSet();
		
		hset.add("a");
		hset.add(12345); // 내부에서 래퍼클래스로 박싱처리가 되기 때문에 
		hset.add(3.14);		 // 값으로 넣어도 잘 들어간다.
		hset.add(true);		// int ---> Integer ...
		hset.add('B');		// byte --> Byte ...
		
		// 1. 저장 순서가 유지되지 않는다.
		// +@ : toString이 재정의 되어있다.
		System.out.println("hset : " + hset);
		
		hset.add("포도");
		hset.add("사과");
		hset.add("포도");
		hset.add("키위");
		
		// 2. 중복이 허용되지 않는다.
		System.out.println("hset : " + hset);		
		System.out.println("hest.size : " + hset.size()); // 중복될 경우 저장하지 않고 덮어씌운다
		System.out.println("사과 포함하는지? : " + hset.contains("사과"));
		
		// 순서가 유지되지 않는 Set의 각 요소들을 
		// 하나씩 차례대로 꺼내는 방법
		
		System.out.println("------------------------------------------");
		
		// 1. Set의 요소를 배열로 만들어서 꺼내는 방법
		Object[] oArr = hset.toArray();
		
		for(Object obj : oArr) {
			System.out.println(obj);
		}
		
		// 2. set 객체를 목록형태로 나열하여
		//		하나씩 꺼내오는 방법 (Iterator)
		
		Iterator iter = hset.iterator(); // Iterator에 hashset 내용을 담는다
		
		// 다음에 꺼내올 요소가 있는지 검사한다.true false 반환
		while(iter.hasNext()) {
			
			// 현재 요소를 꺼내오고, 다음 요소한테 이동하는 메소드 iter.next();
			Object obj = iter.next();
			System.out.println(obj);
		}
		//	set 자체를 통째로 비우는 방법
		hset.clear();
		System.out.println("hset : " + hset);
		System.out.println("hset 이 비었나요? : " + hset.isEmpty());
	}
}
