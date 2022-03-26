package basicsOfProgramming;
import java.util.*;
public class PrintKpc {
	static String[] dtoc = {};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        printKPC(0, input, "");
    }

    public static void printKPC(int idx, String input, String output) {
        
        if(idx == input.length()) {
            System.out.println(output);
            return;
        }
        
        for(Character letter: dtoc[input.charAt(idx) - '0'].toCharArray()) {
            printKPC(idx + 1, input, output + letter);
        }
    }

}
