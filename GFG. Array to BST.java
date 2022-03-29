class Solution
{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public int[] sortedArrayToBST(int[] nums)
    {
        TreeNode node = createBST(nums, 0, nums.length-1);
        int[] preO = new int[nums.length];
        preOrder(node, preO);
        return preO;
    }
    private TreeNode createBST(int[] arr, int low, int high) {
        if(low > high) return null;
        int mid = (low + high)/2;
        TreeNode ans = new TreeNode(arr[mid]);
        ans.left = createBST(arr, low, mid-1);
        ans.right = createBST(arr, mid + 1, high);
        return ans;
    }
    
    int idx = 0;
    private void preOrder(TreeNode root, int[] pre) {
        if(root == null) return;
        pre[idx] = root.val;
        idx++;
        preOrder(root.left, pre);
        preOrder(root.right, pre);
    }
}
