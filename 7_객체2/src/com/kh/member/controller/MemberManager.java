package com.kh.member.controller;

import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberManager {
		Scanner sc = new Scanner(System.in);
		
		
		// 화면(view)과 객체 (Member) 를 연결하는 클래스
	
		// 회원 목록을 관리할 객체 배열
		private Member[] mArr;
		
		// 회원 수를 최대로 담을 수 있는 공간 숫자
		public final static int SIZE = 10; // 회원수는 공개가 가능하기 때문에 public && 공유의 목적 static
		
		// 현재까지 가입한 회원 수 카운트
		private static int count;  // 공유 목적이기 때문에 static
		
		
		// 초기화 블럭
		// 보통 테스트 용도로 사용
		{
			mArr = new Member[SIZE];
			mArr[0] = new Member("hong", "1234", "홍길동","A+","010-1234-1234",'남',"abc@example.com" );
			
			mArr[1] = new Member("sunsin", "532", "이순신","A+","010-2334-1234",'남',"abc@example.com" );
			
			// 미리 회원 등록하기
			count = 2;
		}

		// 2. 생성자
		public MemberManager() {
		//	mArr = new Member[SIZE]; 
		// 초기화 블럭 사용후 다시 생성자를 쓰면 초기화 블럭 데이터가 날아감
		
		}

		// 3. 기능 제공 메소드
		// 현재 회원을 모두 출력하는 메소드
		public void printAllMember() {
			for( int i = 0 ; i < count ; i++) {
				System.out.println(mArr[i].memberInfo());
			}
		}

		// 4. 회원 가입 메소드
		public void intputMember() {
			if( count == SIZE) {
				System.out.println("정원 초과 입니다. ");
			}
		else {
			mArr[count] = new Member();
			
			System.out.print("아이디 : ");
			mArr[count].setMemberId(sc.next());
			System.out.print("비밀번호 : ");
			mArr[count].setPwd(sc.next());
			System.out.print("이름 : ");
			mArr[count].setName(sc.next());
			System.out.print("등급 : ");
			mArr[count].setGrade(sc.next());
			System.out.print("연락처 : ");
			mArr[count].setTel(sc.next());
			System.out.print("이메일 : ");
			mArr[count].setEmail(sc.next());
			System.out.print("성별 : ");
			mArr[count].setGender(sc.next().charAt(0));
			
			count++; // 입력후 카운트 증가
		}
	}	
	
		// 현재 회원 수를 확인할 수 있는 getter 등록하기 
		// count는 private 이기 때문에 getter로만 가져올 수 있다.
		public int getCount() {
			return count;
		}
		
		
		// 회원의 아이디를 통해 해당 회원의 인덱스 반환하기
		
		public int selectMember() {
			
			int idx = -1; // 해당 회원이 없다면 에러 발생시키는 코드
			
			System.out.print("찾고자 하는 회원 아이디 입력 : ");
			String id = sc.next();
			
			for(int i = 0 ; i < count ; i++) {
				if(mArr[i].getMemberId().equals(id)) { // equals 를 통해 비교
																					// == 연산자는 주소값을 통해 비교하지만 equals 는 내용 자체로 비교한다.
																					// String 의 경우 내용은 같을 수 있지만 주소값이 다름으로 비교를 하기 위해서 equals사용.
					idx = i ;
					break;
				}
			}
			return idx;
		}
		
		// 회원 1명 정보 조회 메소드
		
		public void selectOneMember() {
			int idx = selectMember();  // ---------------> 위 메소드에 있는 내용을 끌어다 쓴다.
			
			if( idx == -1 )	 System.out.println("해당하는 회원이 없습니다.");
			else {
				System.out.println(mArr[idx].memberInfo());
			}
		
		}
		
		// 회원 연락처 수정 메소드
		
		public void updateTel() {
			int idx = selectMember(); // 위에서 빌려옴
			
			if(idx == -1 ) {
				System.out.println("없는 회원 입니다. ");
			}
			else {
				System.out.println("현재 연락처 : " + mArr[idx].getTel()); // 멤버에서 불러오는 get
				
				System.out.print("변경할 연락처 입력 : "); // 멤버로 입력하는 set
				
				mArr[idx].setTel(sc.next()); // 스캐너를 바로 mArr[idx].setTel에 입력
			}
			
			
		}
		
		public void updateGender() {
			int idx = selectMember();
			
			if(idx == -1) System.out.println("없는 회원 입니다.");
			else {
				System.out.println("현재 성별 : " + mArr[idx].getGender());
				System.out.print("변경할 성별 입력 : ");
				mArr[idx].setGender(sc.next().charAt(0));
			}
		}

		// 회원 삭제 메소드
		public void deleteMember() {
			int idx = selectMember();
			
			if(idx == -1 )System.out.println("없는 회원 입니다. ");
			else {
				System.out.print("정말 탈퇴 하실껀가요? (Y/N)");
				char answer = sc.next().toUpperCase().charAt(0);
				if(answer == 'Y') {
					for(int i = idx ; i < count ; i++) {
						
						// 만약에 삭제하는 회원이 마지막 회원이면 
						// 자리 변경이 필요없다
						// 따라서 그 방만 null로 만들면 된다.
						if( idx == count -1 ) {
							mArr[i] = null;
						}
						else {
							mArr[i] = mArr[i+1]; //  ========== > i+1 번방의 내용을 i번 방으로 이동
						}
					}
					count--; // 삭제 하였음으로 가입 가능한 회원 증가
				}
				else {
					System.out.println("메뉴로 돌아갑니다.");
				}
			}
			
		}
		
} // class
