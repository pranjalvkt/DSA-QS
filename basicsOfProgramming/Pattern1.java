package basicsOfProgramming;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*	");
            }
            System.out.println();
            stars++;
        }
	}

}
