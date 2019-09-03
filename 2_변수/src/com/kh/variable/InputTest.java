package com.kh.variable;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTest {
// 기능 제공용 메소드만 가진 클래스
	
	/*public void inputMethod1() {
	      // 컴퓨터 내장 키보드 입력 자원과
	      // 현재 자바 파일 간의 연결 통로를 만들어서
	      // 우리가 입력하는 키보드의 값을
	      // 자바에서도 읽을 수 있게 하는 방법
	      
	      BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	      
	      System.out.print("숫자를 한 개 입력하세요 : ");
	      
	      String str;
	      
	      try {
	         // readLine() : 
	         // 사용자가 입력하는 값을 받아 올 수 있는 메소드
	         str = br.readLine();
	      
	         // 입력한 값을 문자열에서 숫자로 변환하는 과정을 거쳐야 하는데
	         // 이를 파싱이라고 한다.
	         int num = Integer.parseInt(str);
	      
	         System.out.printf("입력하신 숫자는 %d 입니다. \n", num);

	      } catch (IOException e) {
	      
	         e.printStackTrace();
	      }
	   }
*/
	public void inputMethod2() {
		// Scanner :
		// 사용자가 입력한 값을 자료형 별로 담을 수 있는 클래
		
		//java.util.Scanner sc = new java.util.Scanner(System.in); 
		// java.util 을 사용할 경우 임포트가 필요없다
		// 문장이 길어지지만 import를 하려고 할때 클래스 이름이 같을 경우 명시해야 할 필요가 있어서 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("당신의 이름은 " + name + " 입니다");
		System.out.println("당신의 나이는 " + age + "세 입니다");
		System.out.println("당신의 키는 " + height + "cm 입니다");
		

		
	}
	
	public void inputMethod3() {
		// 변수를 미리	선언하고 값을 미리 입력한 후 변수에 저장된 값을 화면에 출력해보고 
		// 스캐너를 사용해 새로운 값을 각각의 변수에 다시 대입하여 값을 변경한 후 다시 화면에 출력해보
		
		// 1. 변수 선언하기 (개인정보)
		String name; 
		int age; 
		String addr;
		char gender;
		
		// 2. 선언 한 변수에 값 입력하기
		name = "고길동";
		age = 56;
		addr = "서울시 강남구 역삼동";
		gender = 'M';
		
		// 3. 입력한 값의 정보 확인하기(출력하기)
		System.out.println("이름 : " + name);
		System.out.println("나이 : "+ age);
		System.out.println("주소 : "+ addr);
		System.out.println("성별 : "+ gender);
		
		// 4. 스캐넌 선언하기
		Scanner sc = new Scanner(System.in);
		
		// 5. 이미 등록되어 있는 변수의 안에 스캐너로 입력받은 값을 대입하기
		System.out.print("이름을 입력하세요 : ");
		name = sc.next(); 				// sc.next
														// 문자열을 띄어쓰기나 엔터 전 까지 읽는 메소
	
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		// 스캐너에 남아있는 엔터 값을 제거하기 위한 nextLine()을 한 번 호출 한다
		// -----> sc.next()의 경우 엔터 전까지 읽기 때문에 엔터가 남아 있어서 다음 sc.nextline()이 남아있는 엔터를 읽어 들여서
		// 			이미 입력된 값이 있다고 판단 하기 때문에 문제가 생긴다.
		sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		addr = sc.nextLine();				// 문자열을 엔터까지 읽어오는 메소드
		
		System.out.print("성별을 입력하세요(M/F) : ");
		gender = sc.next().charAt(0);			
																		// .charAt(X)
																		// 만약 male 이라고 입력했다면  
																		// 		^--------------이 부분의 문자의 순서로 가져온다. (0번째)
	
		// 6. 변경한 값을 출력하여 다시 확인하
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("성별 : " +gender);
		
		
		
		
		
		
		
		
		
	}
	
}