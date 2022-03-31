public static boolean find(Node root, int data) {
    if(root == null) return false;
    if(root.data > data) return find(root.left, data);
    else if(root.data < data) return find(root.right, data);
    else return true;
  }

  public static void dfs(Node root, Node node, int target) {
    if(node == null) return;

    dfs(node.left, root, target);

    //inOrder
    int comp = target - node.data;
    if(comp > node.data) {
      if(find(root, comp)) {
        System.out.println(node.data + " " + comp);
      }
    }

    dfs(node.right, root, target);
  }
