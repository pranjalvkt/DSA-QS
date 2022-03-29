public static int size(Node node) {
    if(node == null) return 0;

    int ls = size(node.left);
    int rs = size(node.right);
    return ls + rs + 1;
  }

  public static int sum(Node node) {
    if(node == null) return 0;

    int ls = sum(node.left);
    int rs = sum(node.right);
    return ls + rs + node.data;
  }

  public static int max(Node node) {
    Node curr = node;
    while(curr.right != null) {
      curr = curr.right;
    }
    return curr.data;
  }

  public static int min(Node node) {
    Node curr = node;
    while(curr.left != null) {
      curr = curr.left;
    }
    return curr.data;
  }

  public static boolean find(Node node, int data){
    if(node == null) return false;
    if(node.data == data) return true;
      
      if(node.data < data) {
          return find(node.right, data);
      } else {
          return find(node.left, data);
      }
  }  
