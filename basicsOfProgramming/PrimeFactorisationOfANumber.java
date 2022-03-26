package basicsOfProgramming;

import java.util.*;

public class PrimeFactorisationOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int fac = 2; fac <= n; fac++) {
			while(n % fac == 0) {
				n = n / fac;
				System.out.print(fac + " ");
			}
		}
		sc.close();
	}

}
