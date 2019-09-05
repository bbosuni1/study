package com.hw3.view;

import java.util.Scanner;
import com.hw3.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	
	// 메인 메뉴 프로그램
	public void mainMenu(){
		
		do {	// do while 반복
			
			System.out.println("=== 사원 정보 관리 프로그램 ===");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("=======================");
			
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : inputEmployee();
				break;
			case 2 : modifyEmployee(emp);
			case 4 : 
				System.out.println(emp.information()); break;
			case 9 : return; // 종료
			}
			
		}while(true);
	}//method

	public Employee inputEmployee() {
		
		System.out.print("이름을 입력 하세요 : ");
		emp.setEmpName(sc.next());
		System.out.print("부서를 입력 하세요 : ");
		emp.setDept(sc.next());
		System.out.print("직급을 입력 하세요");
		emp.setJob(sc.next());
		
		return emp;
	}
	
	public void modifyEmployee(Employee emp) {
		
	}
	
	
	
	
	
}//class
