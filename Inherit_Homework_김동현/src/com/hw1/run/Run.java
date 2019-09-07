package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {

	public static final int max = 10;
	public static int count; // 숫카 카운트용
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열을 사용합니다.
		Student[] stuArr;
		Employee[] empArr;
		
		// 1. 학생 정보 출력
		// 초기화 블럭
		{
			stuArr = new Student[3];
			stuArr[0] = new Student(20, 178.2, 70.0, "홍길동", 1, "정보시스템공학과");
			stuArr[1] = new Student(21, 187.3, 80.0, "김말똥", 2, "경역학과");
			stuArr[2] = new Student(23, 167.3, 45.0, "강개순", 4, "정보통신공학과");
		}
		for(Student st : stuArr)	System.out.println(st.information());

		System.out.println("-----------------------------------------------------");
		
			// 최대 사원 배열 할당
			empArr = new Employee[max];
		
			// 사원 정보 입력
		while(true) { 		// while true 로 무한 반복
			if(count == max) {
				System.out.println("정원 초과 입니다."); // 정원 초과시 출력용
			} // if end
			
			else {
			empArr[count] = new Employee();
			
			System.out.print("이름을 입력하세요 : ");
			empArr[count].setName(sc.next());
			System.out.print("나이를 입력하세요 : ");
			empArr[count].setAge(sc.nextInt());
			System.out.print("키를 입력해 주세요 :");
			empArr[count].setHeight(sc.nextDouble());
			System.out.print("몸무게를 입력해 주세요 :");
			empArr[count].setWeight(sc.nextDouble());
			System.out.print("급여를 입력해 주세요 :");
			empArr[count].setSalary(sc.nextInt());
			System.out.print("부서를 입력해 주세요 :");
			empArr[count].setDept(sc.next());
			
			count++; // 카운트 수 증가

			System.out.print("계속 추가 하시겠습니까?");
			char yes = sc.next().toUpperCase().charAt(0);
			if (yes == 'N') break; // n or N이면 끝
			} // else end
			
		} //while 끝
		
		System.out.println("-----------------------------------------------------");
		
		// 회원 정보 출력
		for(int i = 0 ; i < count ; i++) {
			System.out.println(empArr[i].information());
		}
		
		
	} // main method end
}//class
