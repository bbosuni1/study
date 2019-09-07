package com.kh.inherit.sample.run;

import com.kh.inherit.sample.vo.Developer;
import com.kh.inherit.sample.vo.Owner;
import com.kh.inherit.sample.vo.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(18);
		
		p.printInfo();
		
		Developer dev = new Developer();
		
		dev.setName("김철수");
		dev.setAge(19);
		
		dev.printInfo();
		
		Owner o = new Owner();
		o.setName("김영희");
		o.setAge(20);

		o.printInfo();
		
		// toString 확인
		System.out.println(" p : " + p); // com.kh.inherit.sample.vo.Person@6442b0a6
															// 일반 객체를 생성하고 호출할 때
															// 단일로 부르게되면 자동으로 뒤에 (.toString())이 붙어 출력된다.
		System.out.println(" p : " + p.toString());
		
		System.out.println("dev : " + dev);
		System.out.println("o : " + o);
	}

}
