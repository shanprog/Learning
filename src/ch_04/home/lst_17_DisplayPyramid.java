package ch_04.home;

import java.util.Scanner;

public class lst_17_DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines from 1 to 15: ");
        int num = input.nextInt();

        while (num < 1 || num > 15) {
            if (num < 1 || num > 15)
                System.out.print("Enter the number of lines from 1 to 15: ");

            num = input.nextInt();
        }

        for (int i = 1; i <= num; i++) {

            for (int j = num - i; j > 0; j--)
                System.out.print("   ");

            for (int j = i; j > 0; j--)
                System.out.printf("%2d ", j);

            for (int j = 2; j <= i; j++)
                System.out.printf("%2d ", j);

            System.out.println();
        }
    }
}
