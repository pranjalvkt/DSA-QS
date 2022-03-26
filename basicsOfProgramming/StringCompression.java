package basicsOfProgramming;
import java.util.*;
public class StringCompression {

	public static String compression1(String str) {
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            if(i == 0 || str.charAt(i) != str.charAt(i-1)) {
                s += str.charAt(i);
            }
        }
        return s;
	}
	public static String compression2(String str){
		String s = "";
		int freq = 0;
        for(int i = 0; i < str.length(); i++) {
            if(i == 0 || str.charAt(i) != str.charAt(i-1)) {
				if(i > 0 && freq > 1) {
					s += freq;
				}
                s += str.charAt(i);
				freq = 0;
            }
			freq++;
        }
		if(freq > 1) {
			s += freq;
		}
        return s;
	}	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		scn.close();
	}	

}
