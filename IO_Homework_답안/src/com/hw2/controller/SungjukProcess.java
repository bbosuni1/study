package com.hw2.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {
	Scanner sc = new Scanner(System.in);

	public void sungjukSave() {
		int num = 0; // 학생을 구분할 변수
		// try with resource 구문으로 “score.dat”파일에 저장되게 DataOutputStream과
		// FileOutputStream을 생성
		try(DataOutputStream dos = new DataOutputStream(
				               new FileOutputStream("score.dat"))){
			while(true) {
				// "======다음의 성적들을 입력하시오======"
				// "국어 : "
				// "영어 : "
				// "수학 : "
				// 각 입력값들을 변수에 저장하고 sum과 avg를 도출해서 파일에 값 저장
				System.out.println("======다음의 성적들을 입력하시오======");
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				System.out.print("수학 : ");
				int mat = sc.nextInt();
				
				int sum = kor + eng + mat;
				double avg = sum / 3.0;
				
				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(mat);
				dos.writeInt(sum);
				dos.writeDouble(avg);
				String ans =null;
				
				num++;
				
				// “x번째 학생 정보 기록”
				System.out.println(num + "번째 학생 정보 기록");
				
				// "계속 저장하시겠습니까? (y/n)"
				// “y”나 “n”이 아닌 값을 입력받으면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
				// 나오고 다시 계속 저장하겠냐는 문구가 나옴
				while(true) {
					System.out.print("계속 저장하시겠습니까? (y/n)");
					ans = sc.next();
					if(ans.equalsIgnoreCase("y")||ans.equalsIgnoreCase("n")) {
						break;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						continue;
					}
				}
				// “y”를 입력했다면 다음 학생의 정보를 입력 받고
				// “n”을 입력했다면 “score.dat 파일에 저장 완료”라는 출력문구가 나옴
				if(ans.equalsIgnoreCase("y")) {
					continue;
				}else if(ans.equalsIgnoreCase("n")) {
					System.out.println("score.dat 파일에 저장 완료");
					break;
				}
			}
			num++;
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void scoreRead() {
		int kor = 0, eng = 0, mat = 0, sum = 0, sumS = 0;
		double avg = 0.0, avgS = 0.0;
		int count = 0; // 몇명의 학생인지 or 반복문이 실행된 횟수(둘 다 같은 개념)
		// try with resource 구문(FileNotFoundException과 EOFException, IOException 처리)
		// 으로 “score.dat”파일에 저장되게 설정하고,
		// EOFException을 활용한 반복문을 통해 파일에 저장된 값을 읽어와서
		try(DataInputStream dis = new DataInputStream(
				              new FileInputStream("score.dat"))){
		// "x번째 학생"
		// "국 영 수 총점 평균"
		// 을 출력하고 각 학생에 대한 국어, 영어, 수학, 총점, 평균이 아래에 출력되게 함
			while(true) {
				// 입력했던 순서에 맞게 사용하지 않으면 에러가 발생됩니다!
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();
				
				sumS += sum;
				avgS += avg;
				
				count++;
				System.out.println(count + "번째 학생");
				System.out.println("국     영     수     총점     평균");
				System.out.printf("%d  %d  %d  %d  %.2f\n", kor, eng, mat, sum, avg);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(EOFException e) { // EOF : End Of File 파일의 끝에 도달했을 때!
			// EOFException이 발생하면,
			// "읽은 횟수 전체 총점 평균 전체 평균"
			// 을 출력하고 데이터를 읽은 횟수(몇명의 학생인지), 전체 총점 평균, 전체 평균에
			// 대한 정보가 아래에 출력되게 함
			// 그리고 마지막에 “score.dat 파일 읽기 완료!” 문구가 출력됨
		
			System.out.println("읽은 횟수     전체 총점 평균        전체 평균");
			System.out.printf("  %d        %.2f         %.2f\n", count, sumS/(double)count, avgS/(double)count);
			
			System.out.println("score.dat 파일 읽기 완료!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
