package human05;

public class HumanExam04 {
	//while문의 구구단
	public static void main(String[] args) {
		int a, b;

		a = 1;
		while (a <= 9) {		// a =1 ==>2
			System.out.printf("%d 단 입니다. \n", a);
			b = 1;
			while (b <= 9) {	// b = 10
				System.out.printf("%d X %d = %d \n", a, b, a * b);
				b++;
			}
			a++;
			System.out.println("--------------");
		}

	}

}
