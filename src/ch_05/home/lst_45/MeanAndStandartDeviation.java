package ch_05.home.lst_45;

import java.util.Scanner;

public class MeanAndStandartDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int n = 10;
        double mean = 0;
        double sumSquare = 0;

        for (int i = 0; i < n; i++) {
            double x = input.nextDouble();

            mean += x;
            sumSquare += x * x;
        }

        System.out.println("The mean is " + mean / n);
        System.out.println("The standard deviation is " + Math.sqrt(((sumSquare - (mean * mean) / n)) / (n - 1)));
    }
}
