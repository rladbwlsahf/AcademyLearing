package human02;

public class HumanExam01 {
	
	public static void main(String[] args) {
		System.out.println("Human");		// ln은 라인의 약자
		System.out.print("Computer");
		System.out.print("Center1\n");		// \n은 다음행으로 내린다.(개행문자)
		System.out.print("Center2\n");		// \t은 tab의 길이만큼 띄운다
		System.out.println("영등포");
		
		System.out.println("휴먼" + "컴퓨터" + "학원");
		System.out.println("result = " + 3);
		
		System.out.printf("result = %d \n" , 3); //정수형 데이터를 표시할 수 있다
		System.out.printf("human = %d / result = %d ", 99, 1000);//정수형 데이터를 표시할 수 있다
		System.out.printf("\n");
		
		int human = 100;
		int computer = human*10;
		
		System.out.printf("human = %d / result = %d ", human , computer );
		
		double human1 = 10.19;
		System.out.printf("human = %f \n", human1);
		// 실수형 데이터를 출력할때는 %f를 사용한다.
		System.out.printf("human = %4.1f \n", human1);
		// 4.1의미는 소수점 아래는 1자리만 사용하되, 2번째 자리에서 반올림함(화면에 보여질때만)
		System.out.printf("10*human = %f \n", human1*10);
		// human1은 여전히 10.19라는 숫자를 가지고 있음을 알수 있음.
		
		boolean isStudent = true;
		System.out.printf("is Student = %b \n",isStudent);
		
		int numStudent = 20;
		int duration = 6;
		
		System.out.println
		("저희 반은 AI반이며, 총 수강생은" + " " + numStudent +  "명이고," + duration + "개월간 수업을 진행합니다.");
	
		System.out.printf
		("저희 반은 AI반이며, 총 수강생은 %d명이고, %d개월간 수업을 진행합니다.", numStudent, duration);
		
		//제 이름은 김우진이고ㅡ제 닉네임은 K.제 나이는 26세.오늘의 온도는   20.5도입니다.
		String name = "김우진";	//문자열	==> %s
		char nickName = 'K';	//문자	==> %c
		int age = 26;			//정수	==> %d
		double temp = 20.5;		//실수	==> %f
		
		System.out.printf
		("제 이름은 %s이고, 제 닉네임은%c입니다. 그리고 제 나이는 %d세. 오늘의 온도는 %f도 입니다"
				+"\n" + "당신은 학생입니다 = %b "
				, name , nickName, age, temp, isStudent);
		
	}

}
