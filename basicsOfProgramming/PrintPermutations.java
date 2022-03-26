package basicsOfProgramming;
import java.util.*;
public class PrintPermutations {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        printPermutations(input, "");
    }

    public static void printPermutations(String input, String output) {
        
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        
        for(int i = 0; i < input.length(); i++) {
            String newStr = input.substring(0, i) + input.substring(i + 1);
            printPermutations(newStr, output + input.charAt(i));
        }
        
    }
}
