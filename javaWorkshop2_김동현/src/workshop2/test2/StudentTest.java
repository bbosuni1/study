package workshop2.test2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {

		// 배열 객체 생성
		Student studentArray[] = new Student[3];
		 studentArray[0] = new Student("홍길동" ,15 , 170, 80);
		 studentArray[1] = new Student("추사람" ,12, 150, 40);
		 studentArray[2] = new Student("유관순" ,20 , 175, 45);
		
		 // 객체 정보 출력
		for ( Student p : studentArray) {
			System.out.println(p);
		}
		
		// 최대값 변수 설정 및 초기화.
		int maxH = 0;
		int maxW = 0;
		double sum = 0 ;
		
		for (int i = 0 ; i < studentArray.length ; i++) {
			if( studentArray[maxH].getHeight() < studentArray[i].getHeight() ){
				maxH = i ;
			}
			if ( studentArray[maxW].getWeight() < studentArray[i].getWeight() ){
				maxW = i ;
			}
			sum += studentArray[i].getAge();
			
		}
		System.out.println("신장이 가장 큰 학생 : " + studentArray[maxH].getName() + " 신장 : " + studentArray[maxH].getHeight());
		System.out.println("몸무게가 가장 큰 학생 : " + studentArray[maxW].getName() + " 신장 : " + studentArray[maxW].getWeight());
		System.out.printf( "나이 평균 : %.3f ",  sum/3);
		
		
		
		 
	}// method

}//class
