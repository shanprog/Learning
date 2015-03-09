package ch_05;

import java.util.Scanner;

public class lst_08_Decimal2HexConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));
    }

    private static String decimalToHex(int decimal) {
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }

        return hex;
    }

    private static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0)
            return (char) (hexValue + '0');
        else // hexValue <= 15 && hexValue >= 10
            return (char) (hexValue - 10 + 'A');
    }


}
