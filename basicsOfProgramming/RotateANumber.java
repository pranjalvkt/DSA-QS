package basicsOfProgramming;
import java.util.*;
public class RotateANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int k = sc.nextInt();
		getNumberOfDigit(k);
		sc.close();
	}
	private static int getNumberOfDigit(int num) {
		int count = 0;
		while(num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
}
