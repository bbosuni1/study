package com.kh.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	// List : 
	// 	자료 구조 중 순서가 유지되며,
	// 	중복을 허용하는 기법을 말한다.
	// 	자바에서는 ArrayList, Vector, LinkedList
	//		존재하며, 이 중 ArrayList와 Vector는 기능이 동일하다.
	//		Vector는 ArrayList의 이전 버전으로 쓰레드세이프 기능을
	//		가지고 있다.
	
	
	
	public static void main(String[] args) {
			//	ArrayList 테스트
			
			ArrayList list = new ArrayList();
			
			//	 List와 같은 컬렉션 객체들은 배열과 다르게
			// 여러 자료형을 모두 담을 수 있다.
			
			list.add("a");
			list.add(1234);
			list.add(true);
			list.add(3.14);
			list.add('B');
			
			// 1. 순서가 유지된다.
			// +@ : toString() 도 재정의 되어 있다. ( 오버라이딩 되어 있다.)
			System.out.println("list : "+ list);
			
			// 안에 들은 값을 하나씩 순서대로 꺼내기
			for(int i = 0 ; i < list.size() ; i++) { // .length 가 아니라 .size
				
				System.out.println(list.get(i)); // 배열의 arr[i] 와 같
			
			}
			
			// 2. 중복이 허용된다.
			list.add("식당");
			list.add("식당");
			
			System.out.println("list : " + list);
		
			// list 안에 어떤 값이 들어있는지 확인하기 .contains(값)
			boolean check = list.contains(3.14);
			System.out.println("3.14 가 들어있나? : " + check);
			
			// 배열(list)의 중간 값을 쉽게 추가하거나
			// 삭제할 수도 있다.
			
			list.add(3, "추가 내용");
			System.out.println("list : " + list);
			
			list.remove(4);
			System.out.println("list : " + list);
			
			// 배열의 중간 값을 변경할 수도 있다.
			list.set(5, "사과");
			System.out.println("list : " + list);
			
			// list를 사용해 정렬 해보기
			ArrayList sortList = new ArrayList();
			sortList.add("가오리");
			sortList.add("사과");
			sortList.add("코알라");
			sortList.add("마늘");
			sortList.add("파프리카");
			
			System.out.println("list : " + sortList);
			
			// 오름차순 정렬
			Collections.sort(sortList);
			System.out.println("list : " + sortList);
			
			// 내림차순 정렬
			Collections.reverse(sortList);
			System.out.println("list : " + sortList);
			
			Iterator iter = new LinkedList(sortList).descendingIterator();
			
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
	}

}
