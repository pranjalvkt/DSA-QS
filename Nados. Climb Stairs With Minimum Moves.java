import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        // RECURSIVE
        // System.out.println(minCost(0, 0, n, m, maze));


        // MEMOIZATION
        // int[][] dp = new int[n][m];
        // for (int i = 0; i < dp.length; i++) {
        //     Arrays.fill(dp[i], Integer.MAX_VALUE);
        // }
        // System.out.println(minCost(0, 0, n, m, maze, dp));

        // TABULATION
        // int[][] dp = new int[n][m];
        // for (int i = 0; i < dp.length; i++) {
        //     Arrays.fill(dp[i], Integer.MAX_VALUE);
        // }
        // System.out.println(minCost(n, m, maze, dp));

        // TABULATION SPACE OPTIMISED
        int[] dp = new int[m];
        System.out.println(minCost(n, m, maze, dp));
    }

    // TABULATION SPACE OPTIMISED
    private static int minCost(int n, int m, int[][] maze, int[] dp) {
        dp[m-1] = maze[n-1][m-1];
        for( int c = m-2 ; c >= 0 ; c-- ) {
            dp[c] = dp[c+1] + maze[n-1][c];
        }

        for (int r = n-2; r >= 0; r--) {
            for (int c = m-1; c >= 0; c--) {
                
                int ans = Integer.MAX_VALUE;
                if(r+1 <= n-1) {
                    ans = Math.min(ans, dp[c]);
                }
                if(c+1 <= m-1) {
                    ans = Math.min(ans, dp[c+1]);
                }

                dp[c] = (ans + maze[r][c]);
            }
        }
        return dp[0];
    }

    // TABULATION
    private static int minCost(int n, int m, int[][] maze, int[][] dp) {
        for (int r = n-1; r >= 0; r--) {
            for (int c = m-1; c >= 0; c--) {
                if(r == n-1 && c == m-1) {
                // ON BOTTOM RIGHT CELL
                    dp[r][c] = maze[r][c];
                    continue;
                }

                if(dp[r][c] != Integer.MAX_VALUE) {
                    return dp[r][c];
                }

                int ans = Integer.MAX_VALUE;
                if(r+1 <= n-1) {
                    ans = Math.min(ans, dp[r+1][c]);
                }
                if(c+1 <= m-1) {
                    ans = Math.min(ans, dp[r][c+1]);
                }

                dp[r][c] = (ans + maze[r][c]);
            }
        }
        return dp[0][0];
    }

    // MEMOIZATION
    private static int minCost(int r, int c, int n, int m, int[][] maze, int[][] dp) {
        if(r == n-1 && c == m-1) {
            // ON BOTTOM RIGHT CELL
            dp[r][c] = maze[r][c];
            return maze[r][c];
        }

        if(dp[r][c] != Integer.MAX_VALUE) {
            return dp[r][c];
        }

        int ans = Integer.MAX_VALUE;
        if(r+1 <= n-1) {
            ans = Math.min(ans, minCost(r+1, c, n, m, maze, dp));
        }
        if(c+1 <= m-1) {
            ans = Math.min(ans, minCost(r, c+1, n, m, maze, dp));
        }

        return dp[r][c] = (ans + maze[r][c]);
    }



    // RECURSIVE
    private static int minCost(int r, int c, int n, int m, int[][] maze) {
        if(r == n-1 && c == m-1) {
            // ON BOTTOM RIGHT CELL
            return maze[r][c];
        }

        int ans = Integer.MAX_VALUE;
        if(r+1 <= n-1) {
            ans = Math.min(ans, minCost(r+1, c, n, m, maze));
        }
        if(c+1 <= m-1) {
            ans = Math.min(ans, minCost(r, c+1, n, m, maze));
        }

        return ans + maze[r][c];
    }

}
