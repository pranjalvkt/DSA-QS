package basicsOfProgramming;
import java.util.*;
public class PrintAllPalindromicSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();
	}
	public static void solution(String str){
		//write your code here
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				String temp = str.substring(i, j+1);
				if(isPalindrome(temp)) System.out.println(temp);
			}
		}
	}
	private static boolean isPalindrome(String str) {
		int l = 0, r = str.length() - 1; 
		while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
	}

}
