package basicsOfProgramming;
import java.util.*;
public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int b = scn.nextInt();
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();
	  
	    int d = getDifference(b, n1, n2);
	    System.out.println(d);
	    scn.close();
	}

	public static int getDifference(int b, int n1, int n2){
	    int borrow = 0, res = 0, mul = 1;
	    while(n2 > 0) {
	    	int d1 = n1 % 10;
	        int d2 = n2 % 10;
	           
	        int temp = d2 - d1 + borrow;
	        if(temp < 0) {
	           res += (temp + b) * mul;
	           borrow = -1;
	        } else {
	           res += temp * mul;
	           borrow = 0;
	        }
	        mul *= 10;
	        n1 /= 10;
	        n2 /= 10;   
	    }
	    return res;
	}
}
