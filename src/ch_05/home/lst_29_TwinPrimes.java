package ch_05.home;

public class lst_29_TwinPrimes {
    public static void main(String[] args) {

        for (int i = 2; i < 999; i++) {
            for (int j = 3; j < 1000; j++) {
                if (isPrime(i) && isPrime(j) && (j - i == 2)) {
                    System.out.println("(" + i + ", " + j + ")");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;

        return true;
    }
}
