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
        // int ans = climb(0, n, jumps);
        // System.out.println(ans);

        // MEMOIZATION
        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // int ans = memoClimb(0, n, jumps, dp);
        // System.out.println(ans);

        // TABULTION
        tabClimb(n, jumps);
    }

    private static void tabClimb(int n, int[] jumps) {
        int[] dp = new int[n+1];
        for(int idx = n; idx >= 0; idx--) {
            if(idx == n) {
                dp[idx] = 1;
                continue;
                
            }

            int ans = 0;
            for (int jump = 1; jump <= jumps[idx]; jump++) {
                if(idx + jump <= n) {
                    ans += dp[idx + jump];
                }
            }
            dp[idx] = ans;
        }

        System.out.println(dp[0]);
    }

    private static int memoClimb(int idx, int n, int[] jumps, int[] dp) {
        if(idx == n) {
            return dp[idx] = 1;
            
        }

        if(dp[idx] != -1) {
            return dp[idx];
        }

        int ans = 0;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            if(idx + jump <= n) {
                ans += memoClimb(idx + jump, n, jumps, dp);
            }
        }
        return dp[idx] = ans;
    }

    private static int climb(int idx, int n, int[] jumps) {
        if(idx == n) return 1;

        int ans = 0;
        for (int jump = 1; jump <= jumps[idx]; jump++) {
            if(idx + jump <= n) {
                ans += climb(idx + jump, n, jumps);
            }
        }
        return ans;
    }

}
