package com.kh.collection.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
	// Map : 
	// 데이터를 저장할 때 
	// 각각의 자료들을 구분짓는 고유의 값을 정하여
	// 해당 값으로 접근하는 실제 객체를 구성할 때
	// 사용하는 자료 구조.
	// Key 와 Value 라는 값으로 두 값을 하나로 묶어 사용하며
	// Key는 중복 허용 X, 순서 유지 X의 Set과 같은 모양으로, 
	// Value는 중복 허용 O,  값 안의 순서 유지 O의 List와 같은 모양을  가진다.
	// 주로 사용하는 클래스는 HashMap / HashTable, TreeMap , Properties 가 있다.
	
	
	public static void main(String[] args) {
		// HashMap 테스트
		
		HashMap hmap = new HashMap();
		// Map hmap = new HashMap(); 다형성
		
		// map 객체에 값을 저장할 때에는
		// Key 와 Value 두 값을 사용하며,
		// put() 메소드를 통해 값을 저장한다.
		
		hmap.put("one", new Date());
		hmap.put("two", "홍길동");
		hmap.put("three", 12345);
		
		System.out.println("hmap : "+hmap);
		
		System.out.println("one : " + hmap.get("one"));
		System.out.println("two : " + hmap.get("two"));
		System.out.println("four : " + hmap.get("four"));
		
		// 저장된 객체를 한 개씩 목록화 하여 꺼내 오는 방법
		// 1. Keyset() 메소드를 활용하는 방법
				Set keys = hmap.keySet();
				
				Iterator iter = keys.iterator();
				
				while(iter.hasNext()) {
					// Key 하나에 해당하는 내용 하나씩 꺼내 오는 방법
					Object obj = iter.next();
					System.out.println(hmap.get(obj));					
				}
					
		System.out.println("------------------------------------------"); 
		
		// 2. values() 메소드를 활용하는 방법
		
		Collection values = hmap.values();
		
		Iterator iter2 = values.iterator();
			while(iter2.hasNext()) {
				// value 값만 하나씩 꺼내오기
				System.out.println(iter2.next());
			}
		
		System.out.println("------------------------------------------"); 
			
		// 3. Map.Entry 객체를 활용하여
		//		Key와 Value를 각각 출력하지 않고
		//		모두를 꺼내어 오는 방법
			
		Set entrySet = hmap.entrySet();
		Iterator iter3 = entrySet.iterator();
		
		while(iter3.hasNext()) {
			// key 와 값을 모두 가지는 객체인 Entry로 꺼내오기
			Map.Entry entry = (Map.Entry)iter3.next();
			
			// key 와 value 각각 분할하기
			String key = (String)entry.getKey();
			Object value = entry.getValue();
			
			// key와 value 출력하기
			System.out.println(key + " = " + value);
		}
		
		
	}

}
