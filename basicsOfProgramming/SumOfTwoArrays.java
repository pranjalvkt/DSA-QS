package basicsOfProgramming;
import java.util.*;
public class SumOfTwoArrays {

	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int[] n1Arr = new int[n1];
	    for(int i = 0; i < n1; i++) {
	        n1Arr[i] = sc.nextInt();
	    }
	    int n2 = sc.nextInt();
	    int[] n2Arr = new int[n2];
	    for(int i = 0; i < n1; i++) {
	        n2Arr[i] = sc.nextInt();
	    }
	    
	    int[] res = new int[Math.max(n1, n2) + 1];
	    
	    int carry = 0;
	    int i1 = n1 - 1, i2 = n2 - 1, i3 = res.length - 1;
	    
	    while(i3-- >= 0) {
	        
	        int d1 = (i1 >= 0) ? n1Arr[i1] : 0;
	        int d2 = (i2 >= 0) ? n2Arr[i2] : 0;
	        
	        int temp = d1 + d2 + carry;
	        int q = temp / 10;
	        int r = temp % 10;
	        carry = q;
	        
	        res[i3] = r;
	        i1--;
	        i2--;
	        i3--;
	    }
	    int idx = 0;
	    while(res[idx] == 0) {
	        idx++;
	    }
	    for(int i = idx; i < res.length; i++) {
	        System.out.println(res[i]);
	    }
		sc.close();
	 }

}
