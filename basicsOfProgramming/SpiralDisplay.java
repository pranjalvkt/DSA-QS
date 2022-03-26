package basicsOfProgramming;
import java.util.*;
public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int frow = 0, fcol = 0, lrow = n-1, lcol = m-1;
        int count = 0;
        
        while(count < n*m) {
        //top to bottom
            for(int i = frow; i <= lrow; i++) {
                System.out.println(mat[i][fcol]);
                count++;
                if(count == n * m) return;
            }
            fcol++;
            
            //left to right
            for(int j = fcol; j <= lcol; j++) {
                System.out.println(mat[lrow][j]);
                count++;
                if(count == n * m) return;
            }
            lrow--;
            
            // bottom to top
            for(int i = lrow; i >= frow; i--) {
                System.out.println(mat[i][lcol]); 
                count++;
                if(count == n * m) return;
            }
            lcol--;
            
            // right to left
            for(int j = lcol; j >= fcol; j--) {
                System.out.println(mat[frow][j]);
                count++;
                if(count == n * m) return;
            }
            frow++;
        }
    }
}
