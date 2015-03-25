package ch_06.home.lst_31;

import java.util.Scanner;

public class CreditCardNumberValidator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }

    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(long number) {
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        int size = getSize(number);

        for (int i = 1; i <= size; i++) {

            if (i % 2 == 0)
                sum += getDigit(2 * (int) (number % 10));

            number /= 10;
        }

        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {

        if (getSize(number) == 2)
            return number % 10 + number / 10;
        else
            return number;
    }

    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        int size = getSize(number);

        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0)
                sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    /**
     * Return true if the digit d is a prefix for number
     */
//    public static boolean prefixMatched(long number, int d) {
//
//    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        int count = 0;

        while (d != 0) {
            d /= 10;
            count++;
        }

        return count;
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */
//    public static long getPrefix(long number, int k) {
//
//    }

}
