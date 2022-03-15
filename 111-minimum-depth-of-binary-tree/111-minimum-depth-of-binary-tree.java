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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 1;
        
        while(queue.size() != 0) {
            int size = queue.size();
            while(size-- > 0) {
                TreeNode rNode = queue.remove();
                if(rNode.left == null && rNode.right == null) {
                    return level;
                }
                if(rNode.left != null) queue.add(rNode.left);
                if(rNode.right != null) queue.add(rNode.right);
            }
            level++;
        }
        return level;
    }
}