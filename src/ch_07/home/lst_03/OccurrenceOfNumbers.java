package ch_07.home.lst_03;

import java.util.Scanner;

public class OccurrenceOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");


        int number = input.nextInt();

        while (number != 0) {
            numbers[number - 1]++;
            number = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {

                System.out.print((i + 1) + " occurs " + numbers[i]);

                if (numbers[i] > 1)
                    System.out.println(" times");
                else
                    System.out.println(" time");
            }
        }
    }
}
