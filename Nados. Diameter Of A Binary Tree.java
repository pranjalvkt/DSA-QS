static int maxSoFar = Integer.MIN_VALUE;
  public static int diameter1(Node node) {
    if(node == null) return -1;

    int ld = diameter1(node.left);
    int rd = diameter1(node.right);
    int currD = ld + rd + 2;
    maxSoFar = Math.max(maxSoFar, currD);
    return Math.max(ld, rd) + 1;
  }
