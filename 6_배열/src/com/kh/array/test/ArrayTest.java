package com.kh.array.test;

public class ArrayTest {
	// 기능 제공 메소드를 담은 클래스
	
	// Arr = heap 의 배열 주소
	// Arr[] = 행 번호속 내용
	//		  ^  = 행 번호
	
	public void testArray() {
		// 배열 사용하기
		
		// 50명의 학생 번호 기록하기 ( 변수 ver)
		int stuNo1 = 1;
		int stuNo2 = 2;
		int stuNo3 = 3;
		// ...
		// 변수가 50개나 필요하게 된다.
		
		// 모든 학생의 번호의 합을 구하시오.
		int sum = 0;
		
		sum += stuNo1;
		sum += stuNo2;
		sum += stuNo3;
		// ...
		
		// 변수의 이름 자체가 다르기 때문에
		// 반복문 조차도 사용할 수 없다.
		// 따라서 일일히 손으로 값을 더해줘야 한다.
		
		// 위의 코드를 배열로 풀어본다면
		
		int[] stuNos = new int[50];  // 변수의 이름 stuNos 가 50개 // 단순히 방의 갯수를 나타냄
		// int stuNos[] = new int[50];
			
		// 각 배열의 공간(방)에 선언한 자료형과
		// 일치하는 값(리터럴)을 저장한다.
		// 단, 시작은 0부터 
		
		// 방번호는 0 부터 시작 하지만 방의 수와 다름 ***** 주의
		// ex) stuNos[0] 부터 시작
		
		/*
		 초기화 방법
		 1. 
		stuNos[0] = 1;
		stuNos[1] = 2;
		stuNos[2] = 3;
		*/
		
		// 초기화 방법 2.
		for(int i = 0 ; i < stuNos.length ; i++) {
			stuNos[i] = i+1 ;
			// stuNos[0] = 1
		}
		
		int sum2 = 0;
		/*
		sum2 += stuNos[0];
		sum2 += stuNos[1];
		sum2 += stuNos[2];
		*/
		
		// ...
		
		// 값을 연속적으로 계산할 때도 배열을 사용하면
		// 반복문과 함께 해결할 수 있다.
		
		for( int i = 0 ; i < stuNos.length ; i ++ ) {
			sum2 += stuNos[i];
		}
		
	}
	
	public void testArray2() {
		// 배열 사용 방법
		// 선언 방식
		// 자료형[] 변수명;
		// 자료형 변수명[];
		
		// 배열을 선언하면 heap 메모리에 
		// 배열의 크기만큼 공간이 할당되고
		// 가장 앞에 있는 공간의 주소값을 
		// 가져와 Stack에 저장하여 사용한다.
		
		// 생성 및 초기화 방식
		// 1. 공간만 먼저 할당하는 경우
		int[] arr1 = new int[10];
		
		// 2. 배열의 값으로 초기화하며 할당하는 경우
		int[] arr2 = new int[] {1, 2, 3 ,4 , 5 }; // 5개 만큼의 방을 만듬
		
		// 3. 배열의 값으로 할당 사에 앞의 'new 자료형[]'를 생략하는 경우
		int[] arr3 = {10, 20 , 30, 40 ,50 };	// 값을 넣고 시작하는 경우 일반적으로 가장 많이 사용
		
		// ** 배열 선언 시에
		// 배열의 크기와 값을 같이 선언할 수 없다.
		// int[] arr4 = new int[10]{10, 20, 30 ....};  이와 같은 방식은 사용 할 수 없다.
		
		
		
		
		// 참조 자료형
		// String, 배열 과 같이
		// Heap 메모리에 저장되는 변수들은 별도의 주소값을 가지고 있다.
		// 그래서 new로 생성되는 변수들은 별도의 주소값으로
		// 참조해서 가져온다고 하여 '참조 자료형' 이라고 말한다.
		// 이러한 참조 자료형을 사용하면 해당 주소값을 통해
		// 본래의 값에 접근한다.
		
		int[] arrTest1 = new int[10];
		char[] arrTest2 = new char[10];
		
		// Heap 메모리는 우리가 직접 접근할 수 없다.
		// 그래서 고유의 값 이라는 것을 간접적으로 밖에 확인할 수 없다.
		// 주소값 조차 없는 상태를 null 이라고 함
		
		System.out.println("arrTest1 : "+ arrTest1);
		System.out.println("arrTest2 : "+ arrTest2);
		
		
		
	}

	public void testArrayCopy(){
		
		// 얕은 복사와 깊은 복사
		// (shallow copy & deep copy)
		// 얕은 복사란, 배열의 주소값만을 복사하는 방법
		// (바로가기 아이콘 개념)
		// 실제 원본이 변했을 경우 원본의 내용이 사본에도 영향을 준다.
		
		// 깊은 복사란, 배열의 실제 내용까지 복사하는 방법
		// 실제 원본의 내용과 사본의 내용이 변경되었을 때 
		// 서로 영향을 미치지 않는 복사방식
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;
		
		// 반복문을 활용하면 배열의 요소를 출력할 때도 편리하다.
		
		// 원본
		for (int i = 0 ; i < originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println();
		
		// 사본
		for (int i = 0 ; i < copyArr.length ; i++) {
		System.out.print(copyArr[i] + " ");
		}

		// ----------- 원본 배열 변경하기 ------------//
		System.out.println();
		
		System.out.println("원본 배열 변경하기");
		System.out.println("originArr[0] = 100");
		
		// 0번 방 내용 100으로 변경
		originArr[0] = 100;
		
		// 변경 확인하기
		for (int i = 0 ; i < originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println();
		
		// 사본
		for (int i = 0 ; i < copyArr.length ; i++) {
		System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("배열 주소 확인 : " + originArr);
		System.out.println("배열 주소 확인 : " + copyArr);
		
	}// method
	
	public void testArrayCopy2() {
		// 깊은 복사 방법 1
		// for 문을 활용한 깊은 복사 구현하기
		
		int[] originArr = { 4, 1, 21, 10, 13};
		int[] copyArr = new int[originArr.length]; // 원본의 길이만큼 복사
		
		// 복사하기 전 값 비교
		// 원본 배열, 사본 배열 각 각 출력
		
		System.out.println("원본 배열 값 : ");
		
		for( int i = 0 ; i < originArr.length ; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("사본 배열 값 : ");
		
		for( int i = 0 ; i < copyArr.length ; i++) {
		System.out.print(copyArr[i] + " ");
		}
		
		// 원본 배열의 길이 만큼만 복사하고 내부 내용은 0
		
		
		// 원본 배열 데이터를 사본 배열로 복사하기
		
		for(int i = 0 ; i < originArr.length; i++) {
			copyArr[i] = originArr[i] ;
		}
		System.out.println();
		System.out.println("********************");
		System.out.println("사본 배열 데이터 복사한 값 : ");
		
		for( int i = 0 ; i < copyArr.length ; i++) {
		System.out.print(copyArr[i] + " ");
		}
		
		
		System.out.println();
		System.out.println("*****************");
		originArr[0] = 100;
		
		System.out.println("원본 배열 값 변경 확인(originArr[0] = 100) : ");
		
		for( int i = 0 ; i < originArr.length ; i++) {
		System.out.print(originArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("사본 배열 값 변경 확인 : ");
		
		for( int i = 0 ; i < copyArr.length ; i++) {
		System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("*****************");
		System.out.println("origin 배열 주소 확인 : " + originArr);
		System.out.println("copy 배열 주소 확인 : " + copyArr);
		
	}//method

	public void testArray3() {
/*		
			// 각 자료형의 변수들은 heap에 저장될 때
			// 초기값을 정해주지 않으면, jvm이 명시(정)하는 초기값으로 자동 선언된다.
		
			boolean booleanChk; // 논리형 기본값
			
			char charChk;
			
			byte byteChk;
			short shortChk;
			int intChk; // int 확인 변수
			long longChk; // long 확인 변수
			
			float floatChk;
			double doubleChk; // double 확인 변수
			
			String str ;
			
			System.out.println("boolean 확인 : " + booleanChk);
			System.out.println("char  확인 : " + charChk);
			System.out.println("byte 확인 : " + byteChk);
			System.out.println("short 확인 : " + shortChk);
			System.out.println("int 확인 : " + intChk);
			System.out.println("long 확인 : " + longChk);
			System.out.println("flaot 확인 : " + floatChk);
			System.out.println("double 확인 : " + doubleChk);
			System.out.println("string 확인 : " + str);
*/			
		
	}// method

	public void testArray4() {
		
		// 배열은 기본적으로 특정 길이를 할당 하였을 때,
		// 즉, new int[10] 와 같이 공간을 선언했을 때
		// 이미 할당한 크기를 다시 수정할 수 없다.
		
		// 따라서 처음 지정한 길이 이상, 이하로 값을
		// 유동적으로 저장할 수 없는 고정된 길이만을 가진다.
		
		int[] arr1 = new int[5];
		// 값 추가하기
		for(int i = 0 ; i < arr1.length ; i++) arr1[i]= 10*i; 
		// 이렇게 지정한 크기 만큼만 문제는 없다
		
		// 지정한 길이를 초과할 경우 에러가 발생
		// arr1[5] = 1214;
		
		// index 값이 음수일 때도 안된다.
		// arr1[-1] = 4121;
		
	} //method
} // class
