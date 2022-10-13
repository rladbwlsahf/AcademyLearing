package human02;

public class HumanEx03 {
	public static void main(String[]args) {
		int human1 = 99;
		int result1 = ++human1 * 10;
		// 위 한줄은 아래 2줄과 같은 의미임.
		// human = human1+1;			==> human1 = 100;
		// int result = human1 * 10;	==> result = 1000;
		System.out.printf("human1 = %d, result1 = %d \n", human1, result1);
		
		int human2 = 99;
		int result2 = human2++ *10;
		// int result2 = human2 * 10;	==> result2 = 990;
		// human2 = huamn2 +1;			==>	human2 = 100;
		System.out.printf("human2 = %d, result2 = %d \n", human2, result2);

		int human3 = 99;
		int result3 = --human3 *10;
		// human3 = huamn3 - 1;			==> huamn3 = 98;
		// int result3 = huamn3 * 10;	==> result3 = 980;
		System.out.printf("human3 = %d, result3 = %d \n", human3, result3);
		
		int human4 = 99;
		int result4 = human4-- *10;
		// int result4 = huamn4 * 10;	==> result4 = 990;
		// human4 = huamn4 - 1;			==> huamn4 = 98;
		
		System.out.printf("human4 = %d, result4 = %d \n", human4, result4);
	}
}
