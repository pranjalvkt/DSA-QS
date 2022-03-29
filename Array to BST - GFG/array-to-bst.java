// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] sortedArrayToBST(int[] nums)
    {
        int[] pre = new int[nums.length];
        createBST(nums, 0, nums.length-1, pre);
        return pre;
    }
    
    int idx = 0;
    private void createBST(int[] arr, int low, int high, int[] pre) {
        if(low > high) return;
        int mid = (low + high)/2;
        pre[idx] = arr[mid];
        idx++;
        createBST(arr, low, mid-1, pre);
        createBST(arr, mid + 1, high, pre);
    }
}