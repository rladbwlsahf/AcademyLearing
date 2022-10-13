package human05;

import java.util.Scanner;

public class HumanExam10 {

	public static void main(String[] args) {
		// while문과 Scanner 이용해서 키보드로 입력된 데이터 예금,출금,조회,종료
		
		boolean run = true; //	반복 조건. 만약 사용자가 4선택하면 종료
		int balance = 0; //		현재 내 잔고
		Scanner scanner = new Scanner(System.in);
				
		while (run){
			System.out.println("----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("----------------------");
			System.out.println("선택 > ");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.print("예금액 > ");
				int x = scanner.nextInt();
				balance = balance + x;
				break;
			case 2:
				System.out.print("출금액 > ");
				balance = balance - scanner.nextInt();
				break;
			case 3:
				System.out.printf("잔고 > %d \n", balance);
	
				break;
			case 4:
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
		}scanner.close();
		
	}

}
