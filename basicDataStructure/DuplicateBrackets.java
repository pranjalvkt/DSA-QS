import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isDuplicate(s));
    }
    private static boolean isDuplicate(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ')') {
                if(stk.peek() == '(') 
                    return true;
                while(stk.peek() != '(') {
                    stk.pop();
                }
                stk.pop();
            } else stk.push(ch);
        }
        return false;
    }

}