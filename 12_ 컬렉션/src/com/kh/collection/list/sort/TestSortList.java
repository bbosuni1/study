package com.kh.collection.list.sort;

import java.util.ArrayList;
import com.kh.collection.list.sort.Fruits;

public class TestSortList {

	public static void main(String[] args) {
		// 객체 리스트 정렬하기
		
		// 샘플 데이터 추가하기
		ArrayList<Fruits> list = new ArrayList<Fruits>();
		
		list.add(new Fruits("복숭아", 300));
		list.add(new Fruits("돌복숭아", 500));
		list.add(new Fruits("천도복숭아", 100));
		
		System.out.println("list : " + list);

		for(Fruits f : list) {
			System.out.println(f);
		}
	
		// 가격 기준으로 오름차순 정렬하기
		list.sort(new AscPriceSort());
		
		for(Fruits f : list) {
			System.out.println(f);
		}
		
		// 내림차순으로 정렬
		list.sort(new DescPriceSort());
		
		for(Fruits f : list) {
			System.out.println(f);
		}
		
		// 이름순으로 오름차순 정렬
		list.sort(new AscNameSort());
	
		for(Fruits f : list) {
			System.out.println(f);
		}
		
		// 이름순으로 내림차순
		list.sort(new DescNameSort());
		
		for(Fruits f : list) {
			System.out.println(f);
		}
		
	}

}
