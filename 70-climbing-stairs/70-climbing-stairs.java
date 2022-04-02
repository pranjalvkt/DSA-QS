class Solution {
    public int climbStairs(int n) {
        int ans = memoClimb(0, n, new int[n+1]);
        return ans;
    }
    
    private int memoClimb(int idx, int n, int[] dp) {
        if(idx == n) {
            dp[idx] = 1;
            return 1;
        }

        if(dp[idx] != 0) {
            return dp[idx];
        }

        int ans = 0;
        if(idx + 1 <= n) {
            ans += memoClimb(idx + 1, n, dp);
        }
        if(idx + 2 <= n) {
            ans += memoClimb(idx + 2, n, dp);
        }
        
        return dp[idx] = ans;
    }

}