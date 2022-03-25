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
    public class Pair {
        boolean isBST = true;
        Integer min = null;
        Integer max = null;
    }
    
    private Pair isBST(TreeNode root) {
        if(root == null) return new Pair();
        
        Pair lp = isBST(root.left);
        Pair rp = isBST(root.right);
        Pair currP = new Pair();
        if(lp.isBST == true && rp.isBST == true) {
            if((lp.max == null || (lp.max != null && lp.max < root.val)) && (rp.min == null || (rp.min != null && rp.min > root.val))) {
                currP.isBST = true;
            } else {
                currP.isBST = false;
            }
        } else {
            currP.isBST = false;
        }
        
        if(lp.min != null) {
            currP.min = Math.min(lp.min, root.val);
        } else {
            currP.min = root.val;
        }
        
        if(rp.max != null) {
            currP.max = Math.max(rp.max, root.val);
        } else {
            currP.max = root.val;
        }
        
        return currP;
    }
    public boolean isValidBST(TreeNode root) {
        
        Pair ans = isBST(root);
        return ans.isBST;
        
    }
}