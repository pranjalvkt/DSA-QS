package basicsOfProgramming;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dc = n/2;
        
        for(int i = 1; i <= (n/2)+1; i++) {
            for (int j = 1; j <= dc; j++) {
                System.out.print("\t");
            } 
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            dc--;
        }
        int ic = 1;
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= ic; j++) {
                System.out.print("\t");
            } 
            for(int j = 1; j <= n-2*i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            ic++;
        }
        scn.close();
	}

}
