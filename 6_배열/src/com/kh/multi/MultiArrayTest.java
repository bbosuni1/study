package com.kh.multi;

public class MultiArrayTest {

	public static void main(String[] args) {
		// 실행용 메소드

		MultiArrayTest mt = new MultiArrayTest();

		mt.testMethod3();

	}

	// ----------------------------------------- //

	public void testMethod1() {
		/*
		 * // 다차원 배열 사용하기 
		 * // 다차원 배열은 일반 배열을 여러개 묶은 배열을 말한다.
		 * 
		 * String[] room1 = {"홍길동", "고길동", "김길동", "최길동"}; 
		 * String[] room2 = {"김철수","최철수", "배철수", "고철수"}; 
		 * String[] room3 = {"도너츠", "햄버거", "스미스", "KFC"};
		 * 
		 * // 위의 형태로 배열을 여러 개 구성하다 보면 
		 * // 개수가 많아질 수록 각각의 배열도 관리하는데 어려움이 생긴다. 
		 * // 따라서 배열들을 묶는 다차원 배열을 선언하여 관리해야 한다.
		 * 
		 * String[][] room = { {"홍길동", "고길동", "김길동", "최길동"}, // 쉼표를 통해 다음 행과 구분
		 *  {"김철수", "최철수", "배철수", "고철수"}, {"도너츠", "햄버거", "스미스", "KFC"}, 
		 *  };
		 * 
		 */
	}

	public void testMethod3() {
		// case 1:
		// 0 : 1 2 3 4 5
		// 1 : 10 9 8 7 6
		// 2 : 11 12 13 14 15
		// 3 : 20 19 18 17 16
		// 4 : 21 22 23 24 25

		// 입력부
		int num = 1;
		int[][] arr = new int[5][5]; // 5행 5열 선언
		boolean sw = true; // switch 

		for (int i = 0; i < arr.length; i++) {

			if (sw) {
				// -->
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			} else {
				// <--
				for (int j = arr[i].length - 1; j > -1; j--) {
					arr[i][j] = num++;
				}
			}
			sw = !sw; // 스위치 작동
							// 처음 true 작동 후 sw 가 작동하여 false로 변환 따라서 else를 실행한다.
		}
		// 출력부
		// 출력부는 간단하게 출력이 가능하다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf(" %3d ", arr[i][j]);

			}
			System.out.println();
		}

		
		
	}
} // method