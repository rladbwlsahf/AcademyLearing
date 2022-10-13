package human08;

public class HumanExam01 {

	public static void main(String[] args) {
		System.out.println (Week.values());
		System.out.println (Week.valueOf("SUN"));	//SUN1 넣으면 week안에서 관리하는게 아니다 라고 오류뜸!
		System.out.println (Week.FRI);				//Remember 열거 뿐만이 아닌 같은 package 내용은 서로 연결해서 사용가능
	}

}
