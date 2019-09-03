package com.kh.loop.test;

public class ContinueTest {
	// Continue 문
	// 반복문 내에서 특정 조건에 맞을 떄
	// 해당 잔복문을 건너 뛰는 용도로 사용하는
	// 분기문
	
	// 일반적으로 if 문과 함께 쓴다.
	
	// continue 를 사용할 경우 
	// 해당 소스 아래의 내용은 무시하고 바로 증감식으로 올라간다. ( for문 기준)
	
	
	public void testMethod() {
		// 1	부터 100 까지의 합 구하기
		// 단. 4의 배수는 제외하기
		// (N % 4 == 0 )
		
		int sum = 0;
		
		for (int i = 1; i<=100 ; i++ ) {
			if( i % 4 == 0) {
				System.out.println(i + "는 무시");
				continue;
			}
			sum += i ;
		} // for
		
		System.out.print(sum);
		
	}//method
	
	public void testMethod2() {
		// 구구단을 for문을 활용하여
		// 중첩 for문을 통한 홀수 단만 출력하기
		
		for(int dan = 2; dan <= 9 ; dan++) {
			
			if ( dan % 2 == 0 ) 	continue; // if 조건을 만족할 경우 continue 아래는 실행하지 않고
																  // 외부 for문으로 돌아가 다음을 반복한다.
			
			System.out.println("-------------" + dan + "단 ------------");
			
				for ( int su = 1; su <=9 ; su ++) {
					
					System.out.println(dan + " + " + su + " = " + dan*su);

				} // 내부 for 
			}  // 외부 for
		} // method
}// class
