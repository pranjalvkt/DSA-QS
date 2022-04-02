import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = sc.nextInt();
        }
        System.out.println(climb(n, jumps));

    }

    private static int climb(int n, int[] jumps) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--) {
            if(jumps[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= jumps[i] && i + j < dp.length; j++) {
                    if(dp[i+j] != -1) {
                        min = Math.min(min, dp[i+j]);
                    }
                }

                if(min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0];
    }
}
