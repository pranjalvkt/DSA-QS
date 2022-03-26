package basicsOfProgramming;
import java.util.*;
public class GcdAndLcm {

	public static void main(String[] args) {
		
		// GCD
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }
        System.out.println(b);
        
        //LCM
        
        sc.close();
	}

}
