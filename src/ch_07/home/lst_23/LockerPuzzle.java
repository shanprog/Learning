package ch_07.home.lst_23;

public class LockerPuzzle {

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
