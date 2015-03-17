package ch_06.home;

import ch_06.lst_06_LinearSearch;

import java.util.Scanner;

public class lst_05_PrintDistinctNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");

        int count = 0;
        int counter = 0;

        while (count != 10) {

            int currNum = input.nextInt();

            if (lst_06_LinearSearch.linearSearch(numbers, currNum) == -1)
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
