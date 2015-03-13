package ch_05.home;

public class lst_28_MersennePrime {
    public static void main(String[] args) {

        System.out.println("p\t2^p – 1");

        for (int p = 2; p <= 31; p++) {
            if (isMersenne(p))
                System.out.println(p + "\t" + ((int) Math.pow(2, p) - 1));
        }
    }

    public static boolean isMersenne(int p) {

        return isPrime((int) Math.pow(2, p) - 1);

    }

    public static boolean isPrime(int n) {

        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;

        return true;
    }
}
