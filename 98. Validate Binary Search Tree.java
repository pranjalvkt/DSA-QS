class Solution {
    Integer prev = null;

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

    boolean left = isValidBST(root.left);

    boolean self = true;
    if(prev != null && root.val <= prev) {
      self = false;
    } else {
      prev = root.val;
    }
    
    boolean right = isValidBST(root.right);
    return left && right && self;
    }
}
