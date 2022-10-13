package human05;

public class HumanExam08 {

	public static void main(String[] args) {
		/*for (int i = 0; i < 10; i++) {// 랜덤 함수( )
			double a;
			// a = Math.random(); //0~1사이의 난수를 만들어줌
			// a = Math.random() * 6; //0~6사이의 난수를 만들어줌
			a = Math.random() * 6 + 1; // 1~7사이의 난수를 만들어줌

			int b = (int) a; // 실수인 a를 정수인 b로 강제 casting

			System.out.printf("%f / %d \n", a, b);

		}
	}*/

// 1~6까지의 주사위 눈을 생성하는 난수 프로그램(단 주사위는2개)
// 반복하면서 2개의 주사위의 합이 5이면 프로그램이 종료

		boolean z = true;
		while (z) {
			double a1,a2;
			a1=Math.random()*6 + 1; //1~7사이의 난수 (단,7을 미포함)
			a2=Math.random()*6 + 1;
			
			int x1,x2;		//주사위 눈은 정수형으로 선언
			x1 = (int) a1;	//첫번째 주사위 눈.
			x2 = (int) a2;
			
			System.out.printf("(%d, %d) ==> %d \n",x1,x2,x1+x2);
			
			if (x1+x2 == 5 || x1+2 == 10) {	// x1+x2=5 또는 10일때 종료 조건.
			 {
				z = false;
			}
		}
	}
	}
}
