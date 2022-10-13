package human05;

public class HumanExam09_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	    *		// a=1; b=1,2,3,4	;	c=5
		 	   **		// a=2; b=1,2,3		;	c=4,5
		 	  ***
		 	 ****
		 	*****		// a=5; b는 없음		;	c
		 
		 System.out.print("*");
		 System.out.println();
		 System.out.print(" ");
		  
		 */
		for (int a = 1; a <=5; a++) {
			
			for (int b = 1; b <=5-a; b++) {
				System.out.print(" ");}
				
				for (int c =6-a; c<=5 ; c++) {
					System.out.print("*");

			}
			System.out.println();
		}
	}

}
