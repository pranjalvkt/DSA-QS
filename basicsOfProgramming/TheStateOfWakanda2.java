package basicsOfProgramming;
import java.util.*;
public class TheStateOfWakanda2 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        
        int[][] mat = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        //outer loop
        
        for(int gap = 0; gap < mat[0].length; gap++) {
            for(int i = 0, j = gap; j < mat[0].length;i++,j++) {
                System.out.println(mat[i][j]);
            }
        }
        sc.close();
    }
}
