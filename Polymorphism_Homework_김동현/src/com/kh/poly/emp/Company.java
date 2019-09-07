package com.kh.poly.emp;

public class Company {

	public static void main(String[] args) {

		// Employee 클래스로 배열 선언 
		Employee[] employees = new Employee[2];
		// 객체 배열에 정보 입력
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println("name\t department \t salary");
		System.out.println("---------------------------------------");
		
		// 반복문으로 출력
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(employees[i].getName() + "\t" + employees[i].getDepartment() + "\t" + employees[i].getSalary());
		} // for
		
		System.out.println();
		System.out.println("name\t department \t salary \t  tax");
		System.out.println("---------------------------------------");
		
	
	
	
	} // main

	
} //class

