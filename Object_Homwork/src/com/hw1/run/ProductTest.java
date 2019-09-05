package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 메인 메소드
		
		System.out.println("==============================================");
		
		Product p1 = new Product("ssgnot10", "갤럭시노트10", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgnote6", "LG스마트폰6", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote5", "kt알뜰폰5", "서울시 강남", 250000, 0.3);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==============================================");
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);

		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==============================================");
		
		System.out.println(p1.getProdutName());
		System.out.println(p1.gerPirce());
		System.out.println(p2.getProdutName());
		System.out.println(p2.gerPirce());
		System.out.println(p3.getProdutName());
		System.out.println(p3.gerPirce());
		
		
	}

}
