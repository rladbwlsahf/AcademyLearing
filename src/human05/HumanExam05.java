package human05;

public class HumanExam05 {

	public static void main(String[] args) {
		//홀수 단만 출력할 수 있도록 프로그램 번경할 예정.
		
		int a, b;
	
		for (a = 1; a <= 9; a++)
		{
			System.out.printf("%d단 입니다.\n", a);
			
			for (b = 1; b <= 9; b++) {
				if (b % 2 == 1)
			System.out.printf("%d X %d = %d \n", a, b, a * b);
			}
			System.out.println("-------------");

		}
	}

}
