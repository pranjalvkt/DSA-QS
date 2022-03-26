import java.io.*;
import java.util.*;

public class Main{

private static void performOps(Stack<String> prefix, Stack<String> postfix, char op) {
    //prefix
    String prefixB = prefix.pop();
    String prefixA = prefix.pop();
    prefix.push(op + prefixA + prefixB);

    //postfix
    String postfixB = postfix.pop();
    String postfixA = postfix.pop();
    postfix.push(postfixA + postfixB + op);
}

private static int precedence(char op) {
    if(op == '*' || op == '/') return 2;
    if(op == '+' || op == '-') return 1;
    return 0;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    
    Stack<Character> operator = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<String> postfix = new Stack<>();

    for(int i = 0; i < exp.length(); i++) {
        char ch = exp.charAt(i);

        if(ch == '(') {
            operator.push(ch);
        } else if(ch >= 'a' && ch <= 'z') {
            prefix.push(ch+"");
            postfix.push(ch+"");
        } else if(ch == ')') {
            while(operator.peek() != '(') {
                char op = operator.pop();
                performOps(prefix, postfix, op);                
            }
            operator.pop();
        } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            while(operator.size() > 0 && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch)) {
                char op = operator.pop();
                performOps(prefix, postfix, op);
            }
            operator.push(ch);
        }
    }
    while(operator.size() > 0) {
        char op = operator.pop();
        performOps(prefix, postfix, op);
    }
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
 }
}