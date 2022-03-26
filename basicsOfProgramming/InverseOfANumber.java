package basicsOfProgramming;
import java.util.*;
public class InverseOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int pv = 1;
	    int inverseNum = 0;
	    while(n != 0) {
	        int fv = n % 10;
	        int ipv = fv;
	        int ifv = pv;
	        int powVal = (int) Math.pow(10, ipv-1);
	        inverseNum += (ifv * powVal);
	        pv++;
	        n = n /10;
	    }
	    System.out.println(inverseNum);
	    sc.close();
	}

}
