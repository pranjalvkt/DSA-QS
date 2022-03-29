public static Node remove(Node node, int data) {
    // write your code here
    if(node == null) return null;
    if(node.data < data) {
      node.right = remove(node.right, data);
      return node;
    } else if(node.data > data) {
      node.left = remove(node.left, data);
      return node;
    } else {
      //case1
      if(node.left == null && node.right == null) {
        return null;
      } 

      //case2
      if(node.left == null) {
        return node.right;
      }
      if(node.right == null) {
        return node.left;
      }

      //case3
      int justSmaller = max(node.left);
      node.data = justSmaller;
      node.left = remove(node.left, justSmaller);
      return node;
    }
  }

  private static int max(Node node) {
    if(node.right != null) return max(node.right);
    else return node.data;
  }
