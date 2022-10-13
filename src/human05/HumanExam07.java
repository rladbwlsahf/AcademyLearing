package human05;

public class HumanExam07 {

	public static void main(String[] args) {
		// 1~100까지의 정수 중 3의 배수 총합을 구하는 코드 작성
				
		/*
		// Case -1 (나머지를 이용함) if (a%3 ==0)
		
		 
		 
		int total = 0;
				
		for (int a=0; a<=100; a++) {
			if (a%3 ==0) {			//a=9 ==> a=12
				total = total+a;	// 3+6=9	//	9+9=18  ==> 18+12=30
			System.out.printf("%d까지의 누적합 ==> %d \n", a,total);
		}
	}
*/
		
		// Case -2 (증감을 3씩 증감)
		int total = 0;
		
		for (int a=0; a<=100; a+=3) { 	// a=a+3
			if (a%3 ==0) {			//a=9 ==> a=12
				total = total+a;	// 3+6=9	//	9+9=18  ==> 18+12=30
			System.out.printf("%d까지의 누적합 ==> %d \n", a,total);
			}
		}
	}
} //1683
		
	
