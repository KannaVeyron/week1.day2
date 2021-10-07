package week1.day2;

public class TwoSumProblem {

	public static void main(String[] args) {

		int[] number = { 2,5,12,9,7,3,1};
		int target = 8;
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("i value :"+i);
			
			for (int j = i+1; j < number.length; j++) {
				System.out.println("j value :"+j);
				
				if ((number[i] + number[j])==target) {
					System.out.println(number[i]);
					System.out.println(number[j]);
				}
			}
		}
	}

}
