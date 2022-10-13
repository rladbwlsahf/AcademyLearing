package human01;

public class HumanExam02 {
	public static void main(String [] args) {
		int human;		// human 이란 변수 선언.
		human = 100;	// human 이란 변수에 100을 대입
		System.out.println(human);
			
		int result = human + 10;	//human(100) + 10 ==> 110
		System.out.println(result);
			
		char human1 = 'A'; //char 타입은 홑따옴표라는 거에 주의
		System.out.println (human1);
		char human2 = 66;
		System.out.println (human2);
		System.out.println ( (int) human1);
		System.out.println ("---------------------");
	
		long human3 = 20;
		System.out.println(human3);
		long human4 = 100000000000L;
		// int형 범주의 수치가 넘어갈 경우 L을 붙여서 long형 변수임을 알려야 함.
		System.out.println(human4);
		System.out.println ("---------------------");
		double human5 = 3.14159;
		System.out.println(human5);
		float human6 = 3.14159F;
		System.out.println(human6); // float 형을 사용할 때는 끝에 F를 써야함
		System.out.println ("---------------------");
		
		boolean human7 = 10>11; //참 거짓 확인 가능
		System.out.println (human7);
		
		System.out.println ("---------------------");
		byte human11 = 10;
		int human12;
		human12 = human11; // byte 타입 숫자를 int 타입 숫자로 자동변환.
		//작은크기의 타입을 큰 크기의 타입으로 자동변환
		System.out.println (human12);
		
		byte human13 = 97;
		char human14;
		human14 = (char) human13;  // 에러발생. 왜냐하면 char타입의 변수는 음수는 처리 불가
		System.out.println (human14);
		
		System.out.println ("---------------------");
		int human15 = 129;
		byte human16;
		human16 =(byte) human15;
		System.out.println (human16); //강제 타입 변환시 주의 필요
		
		
		
	};
	
}
