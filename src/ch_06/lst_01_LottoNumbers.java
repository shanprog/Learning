package ch_06;

import java.util.Scanner;

public class lst_01_LottoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] isCovered = new boolean[99];

        int number = input.nextInt();
        while (number != 0) {
            isCovered[number - 1] = true;
            number = input.nextInt();
        }

        boolean allCovered = true;
        for (boolean anIsCovered : isCovered)
            if (!anIsCovered) {
                allCovered = false;
                break;
            }

        if (allCovered)
            System.out.println("The tickets cover all numbers");
        else
            System.out.println("The tickets don't cover all numbers");

    }
}
