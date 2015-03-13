package ch_05.home;

public class lst_27_Emirp {
    public static void main(String[] args) {

        int COUNT_PER_LINE = 10;

        int count = 0;
        int i = 2;

        while (count < 100) {

            if (isPrime(i) && isPrime(reverse(i)) && !lst_03_PalindromeInteger.isPalindrome(i)) {

                count++;

                if (count % COUNT_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");

            }

            i++;
        }

    }

    public static int reverse(int number) {

        int res = 0;

        while (number != 0) {
            res = res * 10 + (number % 10);
            number /= 10;
        }

        return res;
    }

    public static boolean isPrime(int n) {

        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;

        return true;
    }
}