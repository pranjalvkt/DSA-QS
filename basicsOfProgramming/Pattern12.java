package basicsOfProgramming;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        for(int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                third = first + second;
                System.out.print(first + "\t");
                first = second;
                second = third;
            }
            System.out.println();
        }
        scn.close();
	}

}
