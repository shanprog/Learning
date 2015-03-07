package ch_04.home;

import java.util.Scanner;

public class lst_36_CheckingISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int printISBN = isbn;
        int sum = 0;

        for (int i = 9; i > 0; i--) {
            sum += (isbn % 10) * i;
            isbn /= 10;
        }
        if (isbn == 0) {
            System.out.print(0);
        }
        System.out.print(printISBN);

        int d10 = sum % 11;

        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}
