package ch_09.home.lst_23;

import java.util.Scanner;

public class CreditCardNumberValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a string: ");
        String number = input.nextLine();

        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }

    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(String cardNumber) {
        return (sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber)) % 10 == 0;
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(String cardNumber) {
        int sum = 0;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {

            if (i % 2 == 0)
                sum += getDigit(2 * Integer.valueOf(String.valueOf(cardNumber.charAt(i))));
        }

        return sum;
    }


    /**
     * Return this number if it is a single digit; otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        if (getSize(number) == 2)
            return number % 10 + number / 10;
        else
            return number;
    }

    public static int getSize(long d) {
        int count = 0;

        while (d != 0) {
            d /= 10;
            count++;
        }

        return count;
    }


    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(String cardNumber) {
        int sum = 0;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            if (i % 2 != 0)
                sum += Integer.valueOf(String.valueOf(cardNumber.charAt(i)));
        }

        return sum;
    }

}
