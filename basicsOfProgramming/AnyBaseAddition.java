package basicsOfProgramming;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        sc.close();
    }
    private static int getSum(int base, int n1, int n2) {
        int carry = 0, mul = 1, res = 0;
        while (carry > 0 || n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int temp = carry + d1 + d2;
            int q = temp / base;
            int r = temp % base;

            carry = q;
            res += r * mul;

            mul *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return res;
    }
}
