package com.hw3.model.vo;

public class Employee {
	 
		// 필드 생성
	
		private String empName;
		private String dept;
		private String job;
		private int age;
		private char gender;
		private int salary;
		private double bonusPoint;
		private String phone;
		private String address;
		
		// 생성자
		public Employee() {
		}
		public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String address) {
			this.empName = empName;
			this.dept = dept;
			this.job = job;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.bonusPoint = bonusPoint;
			this.address = address;
		}
		
		public String information() {
			return "사원명 : " + empName + "\n부서명 : " + dept + "\n직급명 : " + job + "\n나이 : " + age+
					"\n성별 : "+gender+"\n 급여 : "+salary+"\n보너스포인트 : "+bonusPoint+"\n전화번호 : "+phone+"\n주소 : "+address;
		}
		
		// setter
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public void setBonusPoint(double bonusPoint) {
			this.bonusPoint = bonusPoint;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		// getter
		
		
	}//class
