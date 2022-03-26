package basicsOfProgramming;
import java.util.*;
public class BarChart {

	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    sc.close();
	    int totalC = n;
//	    int totalR = maxEle(arr);
	    for(int i = totalC - 1; i > 0; i--) {
	        for(int j = 0; j < arr[i]; j++) {
	            if(i < arr[j]) {
	                System.out.print("*\t");
	            } else {
	                System.out.print("\t");
	            }
	        }
	    }
	 }
//	 private static int maxEle(int[] max) {
//	    int maxVal = Integer.MIN_VALUE;
//	    for(int i = 0; i < max.length; i++) {
//	        maxVal = Math.max(maxVal, max[i]);
//	    }
//	    return maxVal;
//	 }

}
