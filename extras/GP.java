package extras;

public class GP {
	public static void main(String args[]) {
		System.out.println(sumOfNTerms(10, -3, 4));
	}
	static int sumOfNTerms(int a, int r, int n) {
		int Sn = (int) (a * (Math.pow(r, n) -1) / (r - 1));
		return Sn;
	}
}
