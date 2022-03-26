package basicsOfProgramming;
import java.util.*;
//          1	
//     2    3	2	
//3    4	5	4	3	
//     2    3	2	
//	        1	
public class Pattern16 {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);

	    int n = scn.nextInt();
	    scn.close();
	    int spaces = 2*n - 3, stars = 1;
	    for(int i=1; i<=n; i++)
	    {
	        int val = 1;
	        for(int j=1; j<=stars; j++)
	        {
	            System.out.print(val + "\t");
	            val ++;
	        }
	        for(int j=1; j<=spaces; j++)
	            System.out.print("\t");
	        
	        if(i == n) stars--;
	        val = stars;
	        
	        for(int j=1; j<=stars; j++)
	        {
	            System.out.print(val + "\t");
	            val --;
	        }
	        
	        System.out.println();
	        stars ++;
	        spaces -= 2;
	    }
	 }

}
