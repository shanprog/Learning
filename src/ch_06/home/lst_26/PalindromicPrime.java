package ch_06.home.lst_26;

import ch_06.home.lst_03.PalindromeInteger;

public class PalindromicPrime {

    public static void main(String[] args) {

        int COUNT_PER_LINE = 10;

        int count = 0;
        int i = 2;


        while (count < 100) {

            if (isPrime(i) && PalindromeInteger.isPalindrome(i)) {
                count++;

                if (count % COUNT_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }

            i++;

        }
    }

    public static boolean isPrime(int n) {

        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;

        return true;
    }

}