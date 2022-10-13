package human04;

public class HumanEaxm01 {

	public static void main(String[] args) {
		// 1~10 까지 누적합산..
		
		int index = 0;
		int total = 0;
		
		while (index <= 10) {
			total = total + index;	//total += index; 와 같음.
			index = index + 1;		//index +=1; 또는 index++; 와 같음.
			
			if (index ==5) {
				continue;
			}
			System.out.printf ("%d번째 까지의 누적합은 %d임.\n", index, total);
			
		}
		System.out.println("--------------------------");
		System.out.printf("index = %d \t toal =%d \n", index, total);
	}

}
