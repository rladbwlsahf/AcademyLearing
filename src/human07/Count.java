package human07;

public class Count {

	public static void main(String[] args) {
		int max, min, sum;
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		max =searchMax(arr1);
		
		System.out.printf("MAX = %d \n", max);
		
	}

	private static int searchMax(int[] arr) {
		int max = -9999;      // MAX 값을 구할 때는 작은 수를 설정해야 함
	      for (int a = 0; a<arr.length; a++) {
	         if (max < arr[a]) {
	            max = arr[a];
	         }
	      }
	      return max;	//최대값 로직
	}
}
