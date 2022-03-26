package basicsOfProgramming;
import java.util.*;
public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int sourceBase = scn.nextInt();
	    int  destBase= scn.nextInt();
	    int deciBase = getValueInDecimal(n, sourceBase);
	    int res = getValueInBase(deciBase, destBase);
	    System.out.println(res);
	    scn.close();
	}
	public static int getValueInDecimal(int n, int b){
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
	}
	public static int getValueInBase(int n, int b){
	       int mul = 1;
	       int rem = 0;
	       int resSum = 0;
	       while(n > 0) {
	           rem = n % b;
	           int temp = 0;
	           temp = rem * mul;
	           resSum += temp;
	           n = n / b;
	           mul = mul * 10;
	       }
	       return resSum;
	 }
}
