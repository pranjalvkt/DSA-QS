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
    private int max(TreeNode node) {
        if(node.right != null) return max(node.right);
        else return node.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val < key) {
          root.right = deleteNode(root.right, key);
        } else if(root.val > key) {
          root.left = deleteNode(root.left, key);
            return root;
        } else {
          //case1 --> LEAF NODE
          if(root.left == null && root.right == null) {
            return null;
          } 

          //case2 --> ONLY ONE CHILD
          if(root.left == null) {
            return root.right;
          }
          if(root.right == null) {
            return root.left;
          }

          //case3 --> BOTH CHILD AVAILABLE
          int justSmaller = max(root.left);
          root.val = justSmaller;
          root.left = deleteNode(root.left, justSmaller);
          return root;
        }
        return root;
    }
}