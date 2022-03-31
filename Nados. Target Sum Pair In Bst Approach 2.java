public static void helper(Node node, int tar) {
    Stack<Pair> inc = new Stack<>();
    Stack<Pair> dec = new Stack<>();

    inc.push(new Pair(node, 0));
    dec.push(new Pair(node, 0));

    Node left = nextGreater(inc);
    Node right = nextSmaller(dec);

    while ( left.data < right.data ) {
      if(left.data + right.data < tar) {
        left = nextGreater(inc);
      } else if(left.data + right.data > tar) {
        right = nextSmaller(dec);
      } else {
        System.out.println(left.data + " " + right.data);
        left = nextGreater(inc);
        right = nextSmaller(dec);
      }
    }
  }

  public static Node nextGreater(Stack<Pair> inc) {
    while ( inc.size() > 0 ) {
      Pair rPair = inc.peek();
      if(rPair.state == 0) {
        if(rPair.node.left != null) {
          inc.push(new Pair(rPair.node.left, 0));
        }
        rPair.state++;
      } else if(rPair.state == 1) {
        if(rPair.node.right != null) {
          inc.push(new Pair(rPair.node.right, 0));
        }
        rPair.state++;
        return rPair.node;
      } else {
        inc.pop();
      }
    }
    return null;
  }

  public static Node nextSmaller(Stack<Pair> dec) {
    while ( dec.size() > 0 ) {
      Pair rPair = dec.peek();
      if(rPair.state == 0) {
        if(rPair.node.right != null) {
          dec.push(new Pair(rPair.node.right, 0));
        }
        rPair.state++;
      } else if(rPair.state == 1) {
        if(rPair.node.left != null) {
          dec.push(new Pair(rPair.node.left, 0));
        }
        rPair.state++;
        return rPair.node;
      } else {
        dec.pop();
      }
    }
    return null;
  }
