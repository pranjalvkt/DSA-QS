package basicsOfProgramming;
import java.util.*;
public class SpanOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int maxSoFar = Integer.MIN_VALUE;
		int minSoFar = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(maxSoFar < arr[i]) {
				maxSoFar = arr[i];
			}
			if(minSoFar > arr[i]) {
				minSoFar = arr[i];
			}
		}
		System.out.println(maxSoFar - minSoFar);
	}
}
