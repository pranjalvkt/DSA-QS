package basicsOfProgramming;

import java.io.*;

public class ReverseAnArray {

	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void reverse(int[] a){
	      int l = 0;
	      int r = a.length-1;
	    // write your code here
	    while(l < r) {
	        int temp = a[l];
	        a[l] = a[r];
	        a[r] = temp;
	        l++;
	        r--;
	    }
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    display(a);
	 }
}
