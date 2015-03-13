package ch_05.home;

public class lst_26_PalindromicPrime {

    public static void main(String[] args) {

        int COUNT_PER_LINE = 10;

        int count = 0;
        int i = 2;


        while (count < 100) {

            if (isPrime(i) && lst_03_PalindromeInteger.isPalindrome(i)) {
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