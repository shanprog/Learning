package ch_04.home;

import java.util.Scanner;

public class lst_37_Decimal2Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int dec = input.nextInt();

        String binary = "";

        while (dec != 0) {
            binary = dec % 2 + binary;
            dec /= 2;
        }

        System.out.println(binary);
    }
}
