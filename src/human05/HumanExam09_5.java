package human05;

public class HumanExam09_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	*****		// a=1; b는 없음		;	c=1,2,3,4,5
		 	 ****  		// a=2; b=1,2,		;	c=2,3,4,5
		 	  ***
		 	   **
		 		*		// a=5; b=1,2,3,4	;	c=5
		 
		 System.out.print("*");
		 System.out.println();
		 System.out.print(" ");
		  
		 */
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a - 1; b++) {
				System.out.print(" ");
			}
				for (int c = a; c <= 5; c++) {
					System.out.print("*");

			}
			System.out.println();
		}
	}
}
