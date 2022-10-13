package human02;

import java.util.Scanner;

public class HumanExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//키보드로 부터 입력 받겠다.
		int age;
		System.out.print("당신의 나이를 입력하세요.");
		age = sc.nextInt();					//	정수만 받음
		System.out.printf("age = %d \n", age);
		sc.nextLine();						// 강제로 찌꺼기 소화.
	
		System.out.print("당신의 이름은? ==> ");
		String name;
		name = sc.nextLine();				//	문자형으로 받음
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		
		System.out.print("오늘의 온도는? ==>");
		double temperature;
		temperature = sc.nextDouble();
		System.out.printf("오늘의 온도는 %4.1f도 입니다.\n", temperature);
		sc.close();
		System.out.printf("나이 = %d\n이름 = %s\n오늘의 온도 = %4.1f도", age , name, temperature);
		
	}

}
