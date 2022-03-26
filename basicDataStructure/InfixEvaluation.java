import java.io.*;
import java.util.*;

public class Main{
  
private static int solveOps(int a, char op, int b) {
    if(op == '+') return a + b;
    else if(op == '-') return a - b;
    else if(op == '*') return a * b;
    else return a / b;
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
    Stack<Integer> operand = new Stack<>();

    for(int i = 0; i < exp.length(); i++) {
        char ch = exp.charAt(i);

        if(ch >= '0' && ch <= '9') {
            operand.push(ch - '0');
        } else if(ch == '(') {
            operator.push(ch);
        } else if(ch == ')') {
            //tab tak pop jbtak opening braces na aa jaaye
            while(operator.peek() != '(') {
                int b = operand.pop();
                int a = operand.pop();
                char op = operator.pop();
                operand.push(solveOps(a, op, b));
            }
            operator.pop(); // it will pop opening braces
        } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            while(operator.size() > 0 && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch)) {
                int b = operand.pop();
                int a = operand.pop();
                char op = operator.pop();
                operand.push(solveOps(a, op, b));
            }
            operator.push(ch);
        } 
    }
    while(operator.size() > 0) {
        int b = operand.pop();
        int a = operand.pop();
        char op = operator.pop();
        operand.push(solveOps(a, op, b));
    }
    System.out.println(operand.peek());
 }
}