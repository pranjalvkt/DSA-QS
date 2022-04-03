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

        // RECURSIVE
        // System.out.println(climb(0, n, jumps));

        //MEMOIZATION
        // int[] dp = new int[n+1];
        // Arrays.fill(dp, Integer.MAX_VALUE);
        // System.out.println(climb(0, n, jumps, dp));


        // TABULATION
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climb(n, jumps, dp));

    }
    
    // TABULATION
    private static int climb(int n, int[] jumps, int[] dp) {
        for(int idx = n; idx >= 0; idx--) {
            if(idx == n) {
                dp[idx] = 0;
                continue;
            }

            int ans = Integer.MAX_VALUE;
            for(int jump = 1; jump <= jumps[idx]; jump++) {
                if(jump + idx <= n) {
                    ans = Math.min(ans, dp[idx + jump]);
                }
            }

            if(ans != Integer.MAX_VALUE) {
                ans += 1;
            }

            dp[idx] = ans;
        }
        
        return dp[0];
    }


    //MEMOIZATION
    private static int climb(int idx, int n, int[] jumps, int[] dp) {
        if(idx == n) {
            dp[idx] = 0;
            return 0;
        }

        if(dp[idx] != Integer.MAX_VALUE) {
            return dp[idx];
        }

        int ans = Integer.MAX_VALUE;
        for(int jump = 1; jump <= jumps[idx]; jump++) {
            if(jump + idx <= n) {
                ans = Math.min(ans, climb(idx + jump, n, jumps));
            }
        }

        if(ans != Integer.MAX_VALUE) {
            ans += 1;
        }

        return ans;
    }

    // RECURSIVE
    private static int climb(int idx, int n, int[] jumps) {
        if(idx == n) return 0;

        int ans = Integer.MAX_VALUE;
        for(int jump = 1; jump <= jumps[idx]; jump++) {
            if(jump + idx <= n) {
                ans = Math.min(ans, climb(idx + jump, n, jumps));
            }
        }

        if(ans != Integer.MAX_VALUE) {
            ans += 1;
        }

        return ans;
    }
}
