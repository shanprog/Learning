package ch_05.home.lst_37;

import java.util.Scanner;

public class Decimal2Binary {
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
