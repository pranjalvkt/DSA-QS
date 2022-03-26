package basicsOfProgramming;
import java.util.*;
public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2){
        // write your code here
        int rv = 0;
        int product = 1;
        while(n2 > 0) {
            int digitOfn2 = n2 % 10;
            n2 /= 10;
            int singleProduct = getProductWithSingleDigitOfN2(b, n1, digitOfn2);
            rv = getSum(b, rv, singleProduct * product);
            product *= 10;
        }
        return rv;
        
    }
    private static int getProductWithSingleDigitOfN2(int base, int n1, int digitOfn2) {
        int rv = 0;
        int carry = 0;
        int product = 1;

        while(n1 > 0 || carry > 0) {
            int digitOfn1 = n1 % 10;
            n1 /= 10;

            int result = digitOfn1 * digitOfn2 + carry;

            carry = result / base;
            result %= base;

            rv += result * product;
            product *= 10;
        }
        return rv;
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
