package com.kh.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoProgram {

	public static void main(String[] args) {
		// 1. 1 ~ 45 사이의 숫자 6개
		// 2. 중복이 있으면 안된다
		// 3. 오름차순이 되어야 한다.
		// 위 세 개의 조건을 만족하는 프로그램을 만드시.
		
		/*HashSet hset = new HashSet();
		Random rnd = new Random();
		
		for( ; hset.size() < 6; ) {
			hset.add(rnd.nextInt(46)+1);
		}
		
		System.out.println(hset);
		
		Object[] objArr = hset.toArray();
		
	}*/
		
		// 다형성
		// TreeSet 오름차순이 기본으로 제공된다
		Set<Integer> tset = new TreeSet();
		
		for( ; tset.size() < 6 ;) {
			tset.add(new Random().nextInt(45)+1);
		}
		System.out.println(tset);
		
	}	
}
