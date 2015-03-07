package ch_04.home;

public class lst_26_ComputeE {
    public static void main(String[] args) {

        double e = 1;
        double item = 1.0;

        for (int i = 1; i <= 100000; i++) {

            item /= i;
            e += item;

            if (i % 10000 == 0)
                System.out.println(e);

        }
    }
}
