package ch_12.home.lst_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesOfLetters {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = input.next();

        File file = new File(filename);

        int[] chars = new int[26];

        if (file.exists()) {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNextLine()) {
                String temp = inputFile.nextLine();

                for (int i = 0; i < temp.length(); i++) {
                    if (Character.isLetter(temp.charAt(i))) {
                        char ch = Character.toUpperCase(temp.charAt(i));

                        chars[ch - 'A']++;
                    }
                }
            }

            for (int i = 0; i < chars.length; i++)
                if (chars[i] != 0)
                    System.out.println("Number of " + (char) ('A' + i) + "'s: " + chars[i]);

        }

    }
}
