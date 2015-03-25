package ch_02.home.lst_06;

import java.util.Scanner;

public class SumDigitsInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;
        sum += (number % 10);
        number /= 10;
        sum += (number % 10);
        number /= 10;
        sum += number;

        System.out.println("The sum of the digits is " + sum);
    }
}
