		package com.kh.poly.emp;

public class Company {

			public static void main(String[] args) {

				// Employee 클래스로 배열 선언 
				Employee[] employees = new Employee[2];
				
				// 객체 배열에 정보 입력
				employees[0] = (Employee) new Secretary("Hilery", 1, "secretary", 800); // 업캐스팅 확인 (Employee) 생략 가능
				employees[1] = new Sales("Clinten", 2, "sales", 1200);
				
				System.out.println("name\t department \t salary");
				System.out.println("---------------------------------------");
				
				// 반복문으로 출력
				for(int i = 0 ; i < 2 ; i++) {
					System.out.println(employees[i].getName() + "\t" + employees[i].getDepartment() + "\t" + employees[i].getSalary());
				} 
				
				System.out.println();
				System.out.println("name\t department \t salary \t  tax");
				System.out.println("---------------------------------------");
				
				// 인센티브 100 씩 지급 후 tax 까지 출력
				for(int i = 0; i <2 ; i ++) {
						if(employees[i] instanceof Secretary) {  // employees 의 자료형이 Secretary  일때
							//Secretary money1 = (Secretary) employees[i]; // 다운캐스팅
							((Secretary)employees[i]).incentive(100);  // 다운캐스팅 방법1
						}
						else if(employees[i] instanceof Sales) { // employees 의 자료형이 Salse  일때
							Sales money2 = (Sales) employees[i]; // 다운캐스팅 방법2
							money2.incentive(100); 
						}
				
				// 정리용
				// 개념적으로는 부모클래스가 자식 클래스 보다 범위가 넓지만 
				// 기능적으로 보면 부모클래스를 상속받은 자식클래스의 기능이 더 많다
				
				// 즉 자식 클래스는 자식 클래스 기능을 가지면서 동시에 부모 클래스의 기능도 가진다.
				// ex) Employee emp = [Employee] new Sales(); ===== > [Employee] 생략 가능
				// 	- 부모 클래스를 자료형으로 선언된 객채 emp는 부모의 정보를 전부 필요료 한다. ====> 부모로 부터 상속 받은 Sales는 부모로 부터 받은 정보를 다 가지고 있기 때문에 문제가 없다.
				// 자식클래스가 필요한 정보를 다 가지고 있기 때문에 컴파일러가 알아서 형변환을 생략해 준다.
				// 이러한 내용을 업케스팅이라고 함.
						
				// 반대로 보면 부모 클래스는 자식 클래스의 기능을 다 가지지 못한다.
				//	ex) Secretary money = new Employee();
				// 	- 자식 클래스를 자료형으로 만들어진 객채 money는 위에서 부모 클래스로 부터 모든 정보를 받을 수 없다. 
				// 따라서 원하는 정보를 다 주지 못하기 때문에 오류가 뜬다.
				// 컴파일러에게 강제로 형변환 하여 처리하게 하는 것을 
				// 다운캐스팅 이라 한다.
				
				// 일반적으로 강제로 형변환시 출력시 오류가 발생하나
				// 조건에 따라서 사용이 가능하다.
				// ex) 업캐스팅 이후 다운 캐스팅 
				
				// 반복문 출력
				System.out.printf("%s \t %s \t %s \t %.1f \n", employees[i].getName(), employees[i].getDepartment(), employees[i].getSalary(), employees[i].tax());
				}
				
				// 강사님 질문용
				//	Sales money2 = (Sales) employees[i];
				//	money2.incentive();
				// instanceof 를 사용하지 않아도 가능하던데 사용하는 이유는?
				// 조건문을 위해서 사용?
				// 다운캐스팅시 성립 조건

				
	}

}	// class
