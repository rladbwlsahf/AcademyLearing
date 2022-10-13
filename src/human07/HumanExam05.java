package human07;

public class HumanExam05 {

	public static void main(String[] args) {
		// 5장 - 7. 최소값 구하기
		int [] arr = {5,3,1,8,2,9,10,29,-99,};
		int min = 9999;
		
		for (int a = 0; a<arr.length; a++) {
			if (min > arr[a]) {
				min = arr[a];
			}
		}
		System.out.printf ("MIN = %d \n", min);
	}

}
