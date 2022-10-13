package human07;

public class HumanExam06_1 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균갑을 구해보시요 (중첩 for문 이용)

		int[][] array = { 	{ 95, 86 }, 
							{ 83, 92, 96 }, 
							{ 78, 83, 93, 87, 88 } };
		System.out.println("array.length : " + array.length);
		System.out.println("array[0].length : " + array[0].length);
		System.out.println("array[1].length : " + array[1].length);
		System.out.println("array[2].length : " + array[2].length);

		int sum = 0;
		int count = 0;
		double avg = 0.0;

		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				sum = sum + array[a][b];			//전체값
//				count++;
			}
			count = count + array[a].length;		//갯수 = 갯수 + 평균[a].length;
		}

		avg = (double) sum / count;					//전체/전체 항목의 평균
		System.out.printf("sum: %d \n", sum);		//전체 항목의 합 =881
		System.out.printf("avg: %f \n", avg);		//평균값 = 88.1
		System.out.printf("count: %d \n", count);	//전체의 갯수의 합 =10
	}

}
