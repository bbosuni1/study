package workshop1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double sum = 0;
		double avg = 0;
		double mul = 1; // mul 값은 곱연산 임으로 초기화를 1로 시작 
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 4 && num < 10) { // 범위 안
			
			for (int i = 1 ; i <= num ; i++) {
				sum += i ;
			} // 합
			
			avg =(sum / num ); // 평균 
			
			for (int i = 1 ; i <= num ; i++) {
			mul = i * mul  ;
			}// 곱
			
			// 출력
			System.out.println("합 : " + sum);
			System.out.println("곱 : " + mul);
			System.out.println("평균 : " + avg);
		
		}
		else { // 범위 밖
		System.out.println("다시 입력하세요");
		}
		
	}

} 
