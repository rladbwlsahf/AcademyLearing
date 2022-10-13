package human01;

public class humanEx03 {
	
	public static void main(String[] args) {
		String human1 = "Human"+ " "+ "Computer"; // 문자열 연산자 실습
		// String은 문자열을 담는 클래스.
		System.out.println (human1);
		
		int human2 = 2*6;
		System.out.println(human2);
		
		//int human3 = 9/2; 		//10나누기2=5 , 9/2 = 4 정수로 강제적 타입 변함
		double human3 = 9/2.; 	//9 나뉘 2. "정수/정수 ==> 정수"
											//둘중 하나는 실수로 . =>소수점 까지 나옴
		int human4 = 8%3;			//목(2) 나머지(2); %는 나머지를 의미한다.
		System.out.println(human4);
		
		int human5 = 1;
		human5 += 2;		// human5=human5+2;
		System.out.println(human5);
		
		int human6 =  1;
		human6++;		// human6=human6+1;
		System.out.println(human6);
		++human6;
		System.out.println(human6);
	}
}
