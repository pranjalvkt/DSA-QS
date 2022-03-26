package extras;

//Find the average of largest and smallest numbers in an unsorted integer array?
//Eg. [1, 4, 3, 2] => average = (1+4)/2 = 2.5[1, 4, 3, 4] => average = (1+4+4)/3 = 3 *

public class Q1 {
	private static int findMin(int[] arr) {
		int minSoFar = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int currMin = arr[i];
			if(currMin < minSoFar) minSoFar = currMin;
		}
		return minSoFar;
	}
	private static int findMax(int[] arr) {
		int maxSoFar = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int currMin = arr[i];
			if(currMin > maxSoFar) maxSoFar = currMin;
		}
		return maxSoFar;
	}
	private static double avg(int min, int max, int[] arr) {
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == min || arr[i] == max) {
				sum += arr[i];
				count++;
			}
		}
		
		double res = sum / count;
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2};
		int min = findMin(arr);
		int max = findMax(arr);	
		System.out.println(avg(min, max, arr));
	}
	
}

























