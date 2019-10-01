package com.kh.collection.list.sort;

import java.util.Comparator;

public class DescPriceSort implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {

		Fruits f1 = (Fruits)o1;
		Fruits f2 = (Fruits)o2;
		int result = 0;
		
		// if -else 
		if(f1.getPrice() > f2.getPrice()) {
			result = -1;
		}else result = 1;
		
		return result;
	}

	
	
}
