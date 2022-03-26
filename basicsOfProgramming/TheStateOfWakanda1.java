package basicsOfProgramming;
import java.util.*;
public class TheStateOfWakanda1 {
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
        
        zigZagTraversal(mat, n, m);
        sc.close();
     }
     private static void zigZagTraversal(int[][] mat, int n, int m) {
         for(int j = 0; j < m; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < n; i++) {
                 System.out.println(mat[i][j]);
                }
            } else {
                for(int i = n-1; i >= 0; i--) {
                 System.out.println(mat[i][j]);
                }
            }
         }
     }
}
