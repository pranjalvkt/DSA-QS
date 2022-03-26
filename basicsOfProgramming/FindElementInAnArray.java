package basicsOfProgramming;
import java.util.*;
public class FindElementInAnArray {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    int d = sc.nextInt();
	    System.out.println(linearSearch(arr, d));
		sc.close();
	}
	private static int linearSearch(int[] arr, int d) {
	    for(int i = 0; i < arr.length; i++) {
	    	if(arr[i] == d) {
	    		return i;
	        }
	    }
	    return -1;
	}

}
