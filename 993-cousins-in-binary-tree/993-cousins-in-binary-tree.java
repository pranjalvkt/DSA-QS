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
    TreeNode parX;
    TreeNode parY;
    int levelX;
    int levelY;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(x == root.val || y == root.val) return false;
        
        levelOrderTraversal(root, x, y);
        
        if(parX != parY && levelX == levelY) return true;
        return false;
    }
    public void levelOrderTraversal(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 1;
        
        while(queue.size() != 0) {
            int size = queue.size();
            
            while(size-- > 0) {
                TreeNode rNode = queue.remove();
                if(rNode.left != null) {
                    if(rNode.left.val == x) {
                        parX = rNode;
                        levelX = level + 1;
                    }
                    if(rNode.left.val == y) {
                        parY = rNode;
                        levelY = level + 1;
                    }
                    queue.add(rNode.left);
                }
                if(rNode.right != null) {
                    if(rNode.right.val == x) {
                        parX = rNode;
                        levelX = level + 1;
                    }
                    if(rNode.right.val == y) {
                        parY = rNode;
                        levelY = level + 1;
                    }
                    queue.add(rNode.right);
                }
            }
            level++;
        }
    }
}