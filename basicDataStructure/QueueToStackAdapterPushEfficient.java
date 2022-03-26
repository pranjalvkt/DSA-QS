import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() {
      return mainQ.size();
      // write your code here
    }

    void push(int val) {
      mainQ.add(val);
      // write your code here
    }

    int pop() {
      int val = 0;
      if(size() == 0) {
        System.out.println("Stack underflow");
        return -1;
      }
      for(int i = 0; i < size(); i++) {
        val = mainQ.remove();
        if(i < size())
          mainQ.add(val);
      }
      return val;
      // write your code here
    }

    int top() {
      int val = 0;
      for(int i = 0; i < size(); i++) {
        val = mainQ.remove();
        mainQ.add(val);
      }
      return val;
      // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}