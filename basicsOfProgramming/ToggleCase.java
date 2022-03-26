package basicsOfProgramming;

import java.util.Scanner;

public class ToggleCase {

	public static String toggleCase(String str){
	    String s = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				//lowercase
				char c = (char) (str.charAt(i) - 32);
				s += c;
			} else {
				//uppercase
				char c = (char) (str.charAt(i) + 32);
				s += c;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

}
