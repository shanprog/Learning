package ch_09.lst_04;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display result
        System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));

    }

    private static boolean isPalindrome(String s) {
        String s1 = filter(s);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        return s2.equals(s1);
    }

    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }

    private static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}
