package com.kh.member.view;

import java.util.Scanner;

import com.kh.member.controller.MemberManager;

public class MemberMenu {
	
	
	// 회원 정보 관리 위한 화면 클래스
	
	public static void mainMenu() {
		MemberManager mm = new MemberManager();
		Scanner sc = new Scanner(System.in);
		
		do {
		
			System.out.println("***** 회원 관리 프로그 *****");
			System.out.println("총 가입 가능 회원 수 : " + mm.SIZE);
			System.out.println("현재 가입한 회원 수 : " + mm.getCount());
			System.out.println("==========================");
			System.out.println("1. 회원 가입하기");
			System.out.println("2. 회원 정보 수정하기");
			System.out.println("3. 회원 탈퇴하기");
			System.out.println("4. 모든 회원 정보 조회");
			System.out.println("5.회원 1명 정보 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("==========================");
			
			System.out.print("메뉴를 선택 하세요 : ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : mm.intputMember(); break;
			case 2 : updateMenu(mm); break;
							// mm 이 updateMenu로 이동해서 작동하고 돌아옴
							//
			case 3 : mm.deleteMember(); 
				break;
			case 4 : mm.printAllMember(); break;
			case 5 : mm.selectOneMember(); break;
			case 9 : System.out.println("프로그램을 종료합니다.");
			return;
			default :
				System.out.println("잘못 누르셨습니다.");
			}
		
		}while(true);
		
		
	}

	public static void updateMenu(MemberManager mm) { // 받아온 mm을 MemberManager 로서 대우
		Scanner sc = new Scanner(System.in); // static 메소드 안에서는 직접 선언해야 함
		
		do {
			
			System.out.println("=== 수정 메뉴 입니다. ===");
			System.out.println("1. 연락처 수정 ");
			System.out.println("2. 성별 수정 ");
			System.out.println("3. 이전 메뉴로...");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel){
				case 1 : mm.updateTel();
					break;
				case 2 : mm.updateGender();
					break;
				case 3 : 
					return;
				default : 
					System.out.println("잘못 누르셨습니다. ");
				
			}
			
			
		}while(true);
		
		
	}
	
} // class

