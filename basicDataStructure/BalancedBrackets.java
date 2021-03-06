import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                if(stk.isEmpty()) return false;
                if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                    if(s.charAt(i) == ')' && stk.peek() != '(') return false;
                    if(s.charAt(i) == '}' && stk.peek() != '{') return false;
                    if(s.charAt(i) == ']' && stk.peek() != '[') return false;
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }

}