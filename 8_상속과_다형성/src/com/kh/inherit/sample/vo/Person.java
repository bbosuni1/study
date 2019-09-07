package com.kh.inherit.sample.vo;

public class Person /* extends Object 라는 것을 상속받고 있다. */ {
		// 모든 클래스는 Object 클래스의 후손이다.
	
		// 부모 클래스
		private String name;
		
		// toString
		// 일반적으로 객체 자신을 풀 클래스명 (패키지명까지...) 과 해쉬코드를
		// 16진수로 변환한 결과를 출력하는 메소드이다.
		// 우리는 원래 방식으로 출력하면 확인하기 어렵기 때문에 
		// 이를 각 필드 변수를 나열한 문자열로 변환하여 사용한다.
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

		//Override : 오버라이드
		// 부모 클래스를 상속받은 자식클래스가 부모와 똑같은 이름을 가진 
		// 메소드를 만들고자 할 때 사용하는 재정의 방식을 말한다.
		// - [조건] -
		// 1. 부모의 메소드와 반드시 같은 이름, 같은 반환자료형, 같은 매개변수 를 가져야 한다.
		// 2. 접근 제한자를 변경할 수 있는데, 이는 부모와 같거나 부모보다 더 큰 범위로만 가능하다.
		
		// equals
		// 일반적으로 해당 객체의 주소값이 비교하고자 하는 다른 객체의 주소값과
		// 같은지 비교하는 메소드를 말한다.
		// 우리가 이를 사용할 때에는 주소값이 같은지 이전에
		// 해당 객체 안의 각 필드변수의 값이 같은지 비교하는 
		// 기능으로 재정의 하여 사용해야 한다.
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		private int age;
		
		public Person() {}

		public void printInfo() {
			System.out.println(name +", "+ age);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
}
