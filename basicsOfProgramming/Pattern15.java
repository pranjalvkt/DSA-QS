package basicsOfProgramming;
import java.util.*;
public class Pattern15 {

//	      1	
//    2   3   2	
//3	  4	  5   4   3	
//	  2   3	  2	
//	      1	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dc = n/2;
        
        for(int i = 1; i <= (n/2)+1; i++) {
            for (int j = 1; j <= dc; j++) {
                System.out.print("\t");
            } 
            int val = i;
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print(val+"\t");
                if(j <= (2*i-1)/2)
                	val++;
                else 
                	val--;
            }
            System.out.println();
            dc--;
            
        }
        int ic = 1;
        for (int i = n/2; i >= 1; i--) {
            for (int j = 1; j <= ic; j++) {
                System.out.print("\t");
            } 
            int val = i;
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print(val+"\t");
                if(j <= (2*i-1)/2)
                	val++;
                else 
                	val--;
            }
            System.out.println();
            ic++;
        }
        scn.close();
	}


}
