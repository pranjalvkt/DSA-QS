package basicsOfProgramming;
import java.util.*;
public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    int dn = getValueInBase(n, b);
	    System.out.println(dn);
	    scn.close();
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
