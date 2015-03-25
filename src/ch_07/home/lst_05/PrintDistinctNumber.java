package ch_07.home.lst_05;

import ch_07.lst_06.LinearSearch;

import java.util.Scanner;

public class PrintDistinctNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");

        int count = 0;
        int counter = 0;

        while (count != 10) {

            int currNum = input.nextInt();

            if (LinearSearch.linearSearch(numbers, currNum) == -1)
                numbers[counter++] = currNum;

            count++;
        }

        System.out.print("The distinct numbers are: ");

        for (int i = 0; numbers[i] != 0; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

    }
}
