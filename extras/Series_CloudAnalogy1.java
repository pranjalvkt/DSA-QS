package extras;
import java.util.*;
public class Series_CloudAnalogy1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		printSeries(n);
		sc.close();
	}

	private static void printSeries(int n) {
		int sum = 4;
		for(int i = 3; i <= n; i = i + sum) {
			sum += 2;
			System.out.println(i);
		}
	}
}
