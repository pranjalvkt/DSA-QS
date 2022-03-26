package basicsOfProgramming;
import java.util.*;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    int d = getValueIndecimal(n, b);
	    System.out.println(d);
	    scn.close();
	}
	public static int getValueIndecimal(int n, int b){
	       int mul = 1;
	       int rem = 0;
	       int resSum = 0;
	       while(n > 0) {
	           rem = n % 10;
	           int temp = 0;
	           temp = rem * mul;
	           resSum += temp;
	           n = n / 10;
	           mul = mul * b;
	       }
	       return resSum;
	      // write your code here
	   }

}
