package ch_05.home.lst_41;

import java.util.Scanner;

public class OccMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int count = 0;
        int next;

        System.out.print("Enter numbers: ");
        do {
            next = input.nextInt();

            if (next > largest) {
                largest = next;
                count = 1;
            }
            else if (next == largest) {
                count++;
            }

        } while (next != 0);

        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
