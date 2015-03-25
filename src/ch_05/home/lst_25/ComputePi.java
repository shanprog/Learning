package ch_05.home.lst_25;

public class ComputePi {
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
