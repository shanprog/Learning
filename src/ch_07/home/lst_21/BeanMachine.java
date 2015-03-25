package ch_07.home.lst_21;

import java.util.Scanner;

public class BeanMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int countBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int countSlots = input.nextInt();

        int[] slots = new int[countSlots];

        for (int i = 0; i < countBalls; i++) {
            int slot = generatePath(countSlots);
            slots[slot]++;
        }

        System.out.println();
        printSlots(slots);
    }

    public static int generatePath(int countSlots) {

        int slot = countSlots - 1;

        for (int i = 0; i < countSlots - 1; i++) {

            int rand = (int) (Math.random() * 2);

            if (rand == 0) {
                slot--;
                System.out.print("L");
            } else
                System.out.print("R");
        }
        System.out.println();

        return slot;
    }

    public static void printSlots(int[] slots) {

        int maxColumn = searchMax(slots);

        for (int i = 0; i < maxColumn; i++) {

            System.out.print("|");

            for (int slot : slots) {
                if (i - maxColumn + slot >= 0)
                    System.out.print("O|");
                else
                    System.out.print(" |");
            }

            System.out.println();
        }
    }

    private static int searchMax(int[] slots) {

        int max = 0;

        for (int i : slots)
            if (i > max)
                max = i;

        return max;
    }
}
