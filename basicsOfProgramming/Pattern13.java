package basicsOfProgramming;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int i=0; i<n; i++)
        {
            int val = 1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(val + "\t");
                
                // nCk = (nCk-1 * (n - k)) / (k + 1)
                val = (val * (i - j)) / (j + 1);
            }
            System.out.println();
        }
    }

}
