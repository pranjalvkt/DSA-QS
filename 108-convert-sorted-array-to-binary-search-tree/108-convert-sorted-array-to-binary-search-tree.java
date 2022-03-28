/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid =  nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums,0, mid);
        root.right = createBST(nums, mid+1, nums.length);
        return root;
    }
    private TreeNode createBST(int[] arr, int low, int high) {
        if(low >= high) return null;
        int mid = (low + high)/2;
        TreeNode ans = new TreeNode(arr[mid]);
        ans.left = createBST(arr, low, mid);
        ans.right = createBST(arr, mid + 1, high);
        return ans;
    }
}