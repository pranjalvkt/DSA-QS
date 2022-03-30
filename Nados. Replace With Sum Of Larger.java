  static int sum = 0;
  public static void rwsol(Node node){

    if(node == null) return;

    //in-order
    rwsol(node.right);
    int temp = node.data;
    node.data = sum;
    sum += temp;

    rwsol(node.left);
  }
  
