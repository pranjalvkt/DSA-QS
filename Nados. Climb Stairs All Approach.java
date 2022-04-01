import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int ans = climb(0, n);
        // System.out.println(ans);

        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // int ans = memoClimb(0, n, dp);
        // System.out.println(ans);

        // tabuClimb(n);

        iterClimb(n);
    }

    // ITERATIVE
    private static void iterClimb(int n) {
        if(n == 0) {
            System.out.println(1);
            return;
        }

        if(n == 1) {
            System.out.println(1);
        }

        if(n == 2) {
            System.out.println(2);
        }

        int next = 2;
        int next2 = 1;
        int next3 = 1;

        for (int i = n-3; i >= 0; i--) {
            int curr = next + next2 + next3;
            next3 = next2;
            next2 = next;
            next = curr;
        }
        System.out.println(next);
    }

    // TABULATION
    private static void tabuClimb(int n) {
        int[] dp = new int[n+1];
        for (int idx = n; idx >= 0; idx--) {
            if(idx == n) {
                dp[idx] = 1;
                continue;
            }

            int ans = 0;
            if(idx + 1 <= n) {
                ans += dp[idx + 1];
            }
            if(idx + 2 <= n) {
                ans += dp[idx + 2];
            }
            if(idx + 3 <= n) {
                ans += dp[idx + 3];
            }
            dp[idx] = ans;
        }
        
        System.out.println(dp[0]);
    }


    // MEMOIZATION
    private static int memoClimb(int idx, int n, int[] dp) {
        if(idx == n) {
            dp[idx] = 1;
            return 1;
        }

        if(dp[idx] != -1) {
            return dp[idx];
        }

        int ans = 0;
        if(idx + 1 <= n) {
            ans += memoClimb(idx + 1, n, dp);
        }
        if(idx + 2 <= n) {
            ans += memoClimb(idx + 2, n, dp);
        }
        if(idx + 3 <= n) {
            ans += memoClimb(idx + 3, n, dp);
        }

        return dp[idx] = ans;
    }


    // RECURSIVE
    private static int climb(int idx, int n) {
        if(idx == n) return 1;

        int ans = 0;

        if(idx + 1 <= n) {
            ans += climb(idx + 1, n);
        }
        if(idx + 2 <= n) {
            ans += climb(idx + 2, n);
        }
        if(idx + 3 <= n) {
            ans += climb(idx + 3, n);
        }

        return ans;
    }

}
