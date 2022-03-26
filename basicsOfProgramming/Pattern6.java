package basicsOfProgramming;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //upperhalf
        for (int i = 1; i <= (n/2) + 1 ; i++) {
            //1
            for (int j = 1; j <= ((n/2) + 1 - (i-1)); j++) {
                System.out.print("*\t");
            } 
            //2
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("\t");
            } 
            //3
            for (int j = 1; j <= ((n/2) + 1 - (i-1)); j++) {
                System.out.print("*\t");
            } 
            System.out.println();
        }
        //lowerhalf
        int ic = 2;
        int dc = n-2;
        for (int i = 1; i <= n/2; i++) {
            //1
            for (int j = 1; j <= ic; j++) {
                System.out.print("*\t");
            } 
            //2
            for (int j = 1; j <= dc; j++) {
                System.out.print("\t");
            } 
            //3
            for (int j = 1; j <= ic; j++) {
                System.out.print("*\t");
            } 
            ic++;
            dc -= 2;
            System.out.println();
        }
        scn.close();
	}

}
