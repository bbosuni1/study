package com.kh.inherit.run;

import com.kh.inherit.vo.Chef;
import com.kh.inherit.vo.Developer;

public class Main {

	public static void main(String[] args) {

		String babo1 = "가나다";
		String babo2 = "가나다";
		
		Developer dev1 = new Developer("박문수", 20, "Google", "롤");
		Developer dev2 = new Developer("최문수", 70, "넥슨", "메이플스토리");
		Developer dev3 = new Developer("최문수", 70, "넥슨", "메이플스토리");
		
		Chef c1 = new Chef("최현석", 20, "캐논", "회뜨기");
		Chef c2 = new Chef("고든램지", 25, "무직", "화내기");
		
		//	toString 테스트
		dev1.toString();
		System.out.println(dev1.toString());
		System.out.println(c1); // 참조 자료형에선 toString이 자동으로 붙는다.

		
		System.out.println("========================================");
		
		// equals() 테스트
		System.out.println(dev1.equals(c1));
		System.out.println(dev2.equals(dev3));
		
		System.out.println(babo1.equals(babo2));
		
		System.out.println("========================================");
		
		// hashCode() 테스트
		System.out.println(dev1.hashCode());
		System.out.println(dev2.hashCode());
		System.out.println(dev3.hashCode());
		
		System.out.println("========================================");
	}

}
