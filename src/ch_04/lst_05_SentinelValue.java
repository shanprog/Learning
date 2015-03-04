package ch_04;

import java.util.Scanner;

public class lst_05_SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
