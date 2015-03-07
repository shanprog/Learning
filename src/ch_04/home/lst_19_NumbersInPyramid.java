package ch_04.home;

public class lst_19_NumbersInPyramid {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 8 - i; j > 1; j--)
                System.out.printf("    ");

            for (int j = 0; j <= i; j++)
                System.out.printf("%3d ", (int) Math.pow(2, j));

            for (int j = i - 1; j >= 0; j--)
                System.out.printf("%3d ", (int) Math.pow(2, j));

            System.out.println();
        }
    }
}
