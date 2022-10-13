package human03;

public class HumanExam05_2 {

	public static void main(String[] args) {
		int grade = 'A';
		System.out.printf("grade = %d \n", grade);
		 { 
			if (grade >=90) {
				grade = 'A';
				System.out.println ("당신은 VIP 회원입니다.");
			}
			else if (grade >=80) {
				grade = 'B';
				System.out.println ("당신은 일반 회원입니다.");
			}
			else if (grade >=70) {
				grade = 'C';
				System.out.println ("당신은 비회원입니다.");
			}
		}
		System.out.println ("프로그램을 종료합니다.");
	}

}
