package basicsOfProgramming;

import java.util.*;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int totalSubset = (int) Math.pow(2, n);
        for(int dec = 0; dec < totalSubset; dec++) {
            int binaryNumber = decimalToBinary(dec);
            int power = (int) Math.pow(10, n-1);
            for(int i = 0; i < n; i++) {
                int bit = (binaryNumber / power) % 10;
                if(bit == 1) {
                    System.out.print(arr[i] + "\t");
                } else {
                    System.out.print("-\t");
                }
                power /= 10;
            }
            System.out.println();
            
        }
        
     }
     private static int decimalToBinary(int dec) {
        int mul = 1;
        int rem = 0;
        int resSum = 0;
        while(dec > 0) {
            rem = dec % 2;
            int temp = 0;
            temp = rem * mul;
            resSum += temp;
            dec = dec / 2;
            mul = mul * 10;
        }
        return resSum;
     }
    
}
