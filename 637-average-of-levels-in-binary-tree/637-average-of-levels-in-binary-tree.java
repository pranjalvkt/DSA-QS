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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        
        while(queue.size() != 0) {
            int size = queue.size();
            int div = size;
            double sum = 0;
            
            while(size-- > 0) {
                TreeNode rNode = queue.remove();
                sum += rNode.val;
                
                if(rNode.left != null) {
                    queue.add(rNode.left);
                }
                if(rNode.right != null) {
                    queue.add(rNode.right);
                }
            }
            sum = sum / div;
            ans.add(sum);
        }
        return ans;
    }
}