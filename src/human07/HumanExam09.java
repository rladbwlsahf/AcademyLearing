package human07;

import java.util.Scanner;

public class HumanExam09 {

	public static void main(String[] args) {
		// 5장 -9 연습문제
		// 최고점수 및 평균점수 구하는 프로그램
		// 전역변수
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------");
			System.out.println("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				score = new int[studentNum];
				
			} else if (selectNo == 2) {
				for(int x=0; x<studentNum; x++) {
					System.out.printf("score [%d] = ", x);
					score[x] = scanner.nextInt();
					
				}
				
			}
			
			else if (selectNo == 3) {
				for (int x=0; x<studentNum; x++) {
					System.out.printf("score [%d] = %d \n", x,score[x]);
				}

			} else if (selectNo == 4) {
					int max = 0;	//최대값을 구하기 위해서는 작은수부터 탐색 필요함.
					int min = 100;	//최소값을 구하기 위해서는 큰수부터 탐색이 필요함.
					int sum = 0; 
					for (int x=0; x<studentNum; x++) {
						if (max < score[x]) {
							max = score[x];
						}
						if (min < score[x]) {
							min = score[x];
						}
						sum = sum + score[x];
					}
					System.out.printf("MAX = %d \n", max);
					System.out.printf("MIN = %d \n", min);
					System.out.printf("SUM = %d \n", sum);
					System.out.printf("AVG = %f \n", (double)sum/studentNum);
					
			} else if (selectNo == 5) {
				run = false; // or break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
