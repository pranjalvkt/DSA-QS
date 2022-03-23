//User function Template for Java
/* Tree node structure  used in the program
class Node{
    public int data;
    public Node left,right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
 */
 class Solution {
     long ans = 0;
     long MOD = 1000000007;
     public void mul(Node r1, Node r2) {
         if(r1 == null || r2 == null) return;
         ans += (r1.data * r2.data) % MOD;
         mul(r1.left, r2.right);
         mul(r1.right, r2.left);
     }
    public long imgMultiply(Node root)
    {
        ans = (root.data * root.data) % MOD;
        mul(root.left, root.right);
        return ans % MOD;
    }
}
