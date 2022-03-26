package basicsOfProgramming;
import java.util.*;
public class PrintAllPrimesTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        for(int n = low; n <= high; n++) {
            int count = 0;
            for(int i = 2; i <= n-1; i++) {
                if(n % i == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.println(n);
            }
               
        }
        sc.close();

	}

}
