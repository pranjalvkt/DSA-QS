import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // recursive(n);
        // memoization(n);
        // tabulation(n);
        fibIterative(n);
    }

    // ITERATIVE METHOD
    private static void fibIterative(int n) {
        int first = 0;
        int second = 1;
        for( int i = 2 ; i <= n ; i++ ) {
            int third = first + second;
            first = second;
            second = third;
        }
        System.out.println(second);
    }

    // TABULATION METHOD
    private static void tabulation(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if(i == 0 || i == 1)  {
                dp[i] = i;
                continue;
            }

            int ans = dp[i-1] + dp[i-2];
            dp[i] = ans;
        }
        System.out.println(dp[n]);
    }

    // MEMOIZATION METHOD
    private static void memoization(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        int ans = memoFib(n, memo);
        System.out.println(ans);
    }

    private static int memoFib(int n, int[] memo) {
        if(n == 0 || n == 1) return memo[n] = n;

        if(memo[n] != -1) {
            return memo[n];
        }

        int ans = memoFib(n-1 ,memo) + memoFib(n-2, memo);
        return memo[n] = ans;
    }

    // RECURSIVE METHOD
    private static void recursive(int n) {
        int ans = fib(n);
        System.out.println(ans);
    }

    private static int fib(int n) {
        if(n == 0 || n == 1) return n;
        int ans = fib(n-1) + fib(n-2);
        return ans;
    }

}
