package basicsOfProgramming;
import java.util.*;
public class PrintSubsequence {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        printSS(0, input, "");
        sc.close();
    }

    public static void printSS(int idx, String input, String output) {
        if(idx == input.length()) {
            System.out.println(output);
            return;
        }
        
        char ch = input.charAt(idx);
        
        printSS(idx + 1, input, output + ch);
        printSS(idx + 1, input, output);
        
    }

}
