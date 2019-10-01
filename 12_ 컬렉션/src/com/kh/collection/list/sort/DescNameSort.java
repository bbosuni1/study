package com.kh.collection.list.sort;

import java.util.Comparator;

public class DescNameSort implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		int result = 0;
		
		if(o1.getName().compareTo(o2.getName()) > 0) {
			result = -1;
		}
		else {
			result = +1;
		}
		return result;
		//return (o1.getName().compareTo(o2.getName()) * -1) 로도 가능
	}

}
