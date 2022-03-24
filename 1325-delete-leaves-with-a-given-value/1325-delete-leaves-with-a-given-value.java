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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return root;
        
        TreeNode lch = removeLeafNodes(root.left, target);
        TreeNode rch = removeLeafNodes(root.right, target);
        if(root.val == target && lch == null && rch == null) return null;
        root.left = lch;
        root.right = rch;
        return root;
    }
}