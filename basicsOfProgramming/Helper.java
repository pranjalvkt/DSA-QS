package basicsOfProgramming;

public class Helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//private static void getFac(long n, PrintWriter pw) {
//// TODO Auto-generated method stub
//int a = 0;
//while (n % 2 == 0) {
//	a++;
//	n = n / 2;
//}
//if (n == 1) {
//	a--;
//}
//for (int i = 3; i <= Math.sqrt(n); i += 2) {
//	while (n % i == 0) {
//		n = n / i;
//		a++;
//	}
//}
//if (n > 1) {
//	a++;
//}
//if (a % 2 == 0) {
//	pw.println("Bob");
//} else {
//	pw.println("Alice");
//}
////System.out.println(a);
//return;
//}

//private static long power(long a, long p) {
//// TODO Auto-generated method stub
//long res = 1;
//while (p > 0) {
//	if (p % 2 == 1) {
//		res = (res * a) % mod;
//	}
//	p = p / 2;
//	a = (a * a) % mod;
//}
//return res;
//}
//
//private static void fac() {
//fac[0] = 1;
//// TODO Auto-generated method stub
//for (int i = 1; i < fac.length; i++) {
//	if (i == 1) {
//		fac[i] = 1;
//	} else {
//		fac[i] = i * fac[i - 1];
//	}
//	if (fac[i] > mod) {
//		fac[i] = fac[i] % mod;
//	}
//}
//}
//
//private static int getLower(Long long1, Long[] st) {
//// TODO Auto-generated method stub
//int left = 0, right = st.length - 1;
//int ans = -1;
//while (left <= right) {
//	int mid = (left + right) / 2;
//	if (st[mid] <= long1) {
//		ans = mid;
//		left = mid + 1;
//	} else {
//		right = mid - 1;
//	}
//}
//return ans;
//}

//private static long getGCD(long l, long m) {
//
//long t1 = Math.min(l, m);
//long t2 = Math.max(l, m);
//while (true) {
//	long temp = t2 % t1;
//	if (temp == 0) {
//		return t1;
//	}
//	t2 = t1;
//	t1 = temp;
//}
//}
