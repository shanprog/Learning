package ch_04.home;

public class lst_25_ComputePi {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 100001; i++) {

            sum += Math.pow(-1, i + 1) / (2 * i - 1);

            if (i % 10000 == 0) {
                System.out.println(i + " = " + 4 * sum);
            }
        }

    }
}
