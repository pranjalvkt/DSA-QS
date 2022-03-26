import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static boolean findUsingBFS(Node node, int data) {
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(node);
    while(!queue.isEmpty()) {
      Node rNode = queue.remove();
      if(rNode.data == data) {
        return true;
      } else {
        for(Node child: rNode.children) {
          queue.add(child);
        }
      }
    }
    return false;
  }

  public static boolean findUsingDFS(Node node, int data) {
    if(node == null) return false;
    if(node.data == data) return true;
    boolean myAns = false;
    for(Node child: node.children) {
      // or gate
      myAns |= findUsingDFS(child, data);
    }
    return myAns;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    boolean flag = findUsingDFS(root, data);
    System.out.println(flag);
    // display(root);
  }

}