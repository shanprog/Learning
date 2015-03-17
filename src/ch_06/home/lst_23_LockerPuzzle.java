package ch_06.home;

public class lst_23_LockerPuzzle {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j += i) {
                lockers[j - 1] = !lockers[j - 1];
            }
        }

        for (int i = 0; i < 100; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + ", ");
            }
        }

        System.out.println(" lockers open");
    }
}
