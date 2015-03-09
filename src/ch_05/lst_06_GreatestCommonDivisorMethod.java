package ch_05;

import java.util.Scanner;

public class lst_06_GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd;
    }
}
