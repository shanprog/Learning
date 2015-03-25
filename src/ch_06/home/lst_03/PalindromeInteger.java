package ch_06.home.lst_03;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is palindrome");
        } else
            System.out.println(num + " is not Palindrome");
    }

    public static int reverse(int number) {

        int res = 0;

        while (number != 0) {
            res = res * 10 + (number % 10);
            number /= 10;
        }

        return res;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

}
