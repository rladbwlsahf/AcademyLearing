package human05;

public class HumanExam09_2 {

	public static void main(String[] args) {
		
		/*		// a=1; b=1
		  		// a=2; b=1,2
		 		// a=3; b=1,2,3
		 		// a=4; b=1,2,3,4
		 		// a=5; b=1,2,3,4,5
		 		 *밑에꺼처럼 되는이유
 		*
 		**
 		***
 		****
 		*****
 */
		// 2중 for 문을 사용할 것이고
		// System.outprint ("*")
		// System.out.println ()
		for (int a=1 ; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}