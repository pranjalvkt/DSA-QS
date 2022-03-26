package basicsOfProgramming;

import java.util.*;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
	public static String solution(String str){
		// write your code here
        String output = "";
        for(int i = 0; i < str.length()-1; i++) {
            output += str.charAt(i);
            int temp = str.charAt(i+1) - str.charAt(i);
            output += temp;
            
        }
        output += str.charAt(str.length()-1);
        return output;
        
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
		scn.close();
	}
}
