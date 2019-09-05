package com.kh.member.model.vo;

public class Member {
		// 회원 관리 프로그램에서 사용할 객체 틀
		// 1. 필드 변수
		// [접근 제한자] [예약어] 자료형 변수명
		// ( - private < ~default < #protected < +public )
		private String memberId;// 아이디
		private String pwd;// 비밀번호
		private String name;// 이름
		private String grade;// 등급
		private String tel;// 연락척
		private char gender;// 성별
		private String email;// 이메일주소
		
		// 2. 생성자
		// 기본 생성자 : 별도로 선언하지 않으면 jvm이 만들어 주지만
		//							상속을 받게 되면 만들지 않는다. 따라서 지금부터는 직접 만들어 준다.
		// [접근 제한자 ] 클래스명(){}
		public Member() {}
		
		// 사용자 정의 생성자 : 처음 객체 생성 시 우리가 원하는 내용을 필드 변수에 미리 초기화 하여 
		//									  사용할 목적으로 만드는 생성자
		
		// cmd + option + s ==> macOX
		// alt + shift + s ==> windowsOS
		
		public Member(String memberId, String pwd, String name, String grade, String tel, char gender, String email) {
			// super 혹은 this 는 반드시 가장 위에 있어야 함
			// super(); 부모를 상속받는다
			this(); // 내 자신의 생성자를 가지고온다. ====> 같은 이름의 생성자가 여럿일 경우 중복되는 내용을 가져올 수 있다. =====> 중복 제거 가능.
			this.memberId = memberId;
			this.pwd = pwd;
			this.name = name;
			this.grade = grade;
			this.tel = tel;
			this.gender = gender;
			this.email = email;
		}
		
		// 3. 기능 제공 메소드
		/*
		 * 회원의 모든 정보 출력하는 메소드
		 * @author KIm_View
		 * @since 2019-09-05
		 */
		public String memberInfo() {
			return memberId + ", " + pwd + ", " + name + ", " + grade + ", " + tel + ", " + gender + ", " + email;
		}
		
		// Getter & Setter
		
				// Getter
				// 현재 객채의 특정 필드 변수의 값을 
				// 밖으로 꺼내어 주는 역할을 하는 기능
				//	[접근제한자] 반환자료형 get변수명(){
				//	return [this.]변수명
				// }
				
				// Setter
				// 밖에서 가져온 매개변수의 값으로
				// 특정 변수의 내용을 변경하는 역할을 하는 기능 제공 메소드
				// [접근제한자] void set변수명(받아올 자료형 변수명){
				//	this.변수명 = 변수명
				// }
		
			// 자동으로 생성가능
			// cmd + option + s ==> macOX
			// alt + shift + s ==> windowsOS
		
		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

}	//class
