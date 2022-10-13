package human07;

public class HumanExam04 {

	public static void main(String[] args) {
		// 연습문제 5장-7. 최대값 구하기.
		int [] arr = {1,5,3,8,2};
		int max = -9999;		// MAX 값을 구할 때는 작은 수를 설정해야 함
		
		for (int a = 0; a<arr.length; a++) {
			if (max < arr[a]) {
				max = arr[a];
			}
		}
		System.out.printf ("MAX = %d \n", max);
	}
}
