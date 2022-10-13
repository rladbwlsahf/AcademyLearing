package human05;
//for 문의 구구단
public class HumanExam03 {

	public static void main(String[] args) {
		// a, b 라는 것은 for 문안의 변수로 활용할 것이고. 이중 Loop (2중 for문)활용해서 출력문

		/*
		 * 1 X 1 = 1 1 X 2 = 2 ... 1 X 9 = 9 ----------------- 2 X 1 = 2 2 X 2 = 4 ....
		 * ----------------- 3단, 단
		 */

		int a, b;
		for (a = 1; a <= 9; a++) {
			System.out.printf("%d 단 입니다. \n", a);
			for (b = 1; b <= 9; b++) {

				System.out.printf("%d X %d = %d \n", a, b, a * b);

			}
			System.out.println("-------------");

		}
	}
}
