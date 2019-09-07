package com.kh.inherit.vo;

import java.util.Objects;

public class Person {
	// 1. 필드 변수
	private String name;
	private int age;
	private String comp;
	private String hobby;
	
	// { 초기화 블럭} 
	//필요없을시 생략 가능
	
	// 2. 생성자
	// 부모 생성자는 자식 생성자를 선언하게 될 때
	// 반드시 필요하나, 자동으로 생성해 주지 않는다.
	// 따라서 class를 선언할 때 생성자를 직접 만들어 줘야 한다.
	
	public Person() {
	}
	public Person(String name, int age, String comp, String hobby) {
		this.name = name;
		this.age = age;
		this.comp = comp;
		this.hobby = hobby;
	}
	
	
	// 3. 기능 제공 메소드
	
	// @ = 알림문자( 어노테이션 )
	// 메소드 위에 @표시와 함께 특정 예약어를 붙여 
	// jvm이 컴파일 할 때 유의해야 할 사항을 지시하는 표시

	// @Override : 부모 클래스의 메소드를 자식이 다시 작성할 때 사용
	// @Deprecated : 예전 버전 혹은 사용을 권장하지 않는 메소드를 정의할 때 사용
	// @SuppressWarnings(" 경고문 ") : 특정 경고문(노란줄) 을 무시하고자 할 때 사용
	// @FunctionalInterface : 현재 클래스가 함수형 인터페이스로 작성되었음을 알리는 문자
	
	
	@Deprecated
	public void test() {
		// 가능하면 쓰지 마세요
		@SuppressWarnings("unused") // 노란 줄 무시
		int num1 = 10;
	}
	
	// toString()
	// 해당하는 객체가 가지는 값을 확인하기 위한 메소드
	// 재정의하지 않을 경우 클래스명@해쉬값 으로 고유의 존재라는 것을 
	// 표현하지만, 우리가 확인하기엔 어렵기 때문에 
	// 직접 재정의하여 어떤 값을 가지는 지 확인해야 한다.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", comp=" + comp + ", hobby=" + hobby + "]";
	}
	
	// equals()
	// equals() 는 두 객체가 가지는 주소값으로 
	// 서로 같은 내용을 가지는 객체인지 확인한다 .
	
	// 하지만, 주소값만을 비교하고 실제 안의 값을
	// 비교하지는 않기 때문에 이를 재정의하여
	// 실제 안의 값까지 비교하도록 만들어 주어야 한다.

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
		if (comp == null) {
			if (other.comp != null)
				return false;
		} else if (!comp.equals(other.comp))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	// hashCode()
	// 현재 객체가 가진 값을 기준으로 고유의 객체임을
	// 나타내기 위한 고유 숫자를 계산하는 메소드
	
	// 해시코드 3 원칙
	// 1. equals() 메소드로 나온 결과가 true 였다면 
	// 	두 객체의 hashCode() 가 같아야 한다.
	// 2. equals() 메소드의 결과가 false라도
	// 	hashCode()의 결과는 같을 수 있다.
	// 	단, 이후에 이를 활용할 때 문제가 생길 수 있다.
	//	 3. hashCode()의 결과가 같다고 해서 
	//		equals()가 반드시 true일 필요는 없다.
	
	@Override
	public int hashCode() {
		// JDK 1.7 버전 부터
		// 해시코드 전용 계산 메소드를 제공하게 되었다.
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((comp == null) ? 0 : comp.hashCode());
//		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return Objects.hash(name,age,comp,hobby); // jdk 1.7 이후 제공 기능이용
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

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
