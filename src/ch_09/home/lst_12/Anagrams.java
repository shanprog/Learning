package ch_09.home.lst_12;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = input.nextLine();

        if (isAnagram(s1, s2))
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] s1chars = new char[26];
        char[] s2chars = new char[26];

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLetter(s1.charAt(i)))
                s1chars[s1.charAt(i) - 'a']++;

            if (Character.isLetter(s2.charAt(i)))
                s2chars[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1chars.length; i++)
            if (s1chars[i] != s2chars[i])
                return false;

        return true;
    }

}
