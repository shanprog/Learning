package ch_12.home.lst_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    private String compWord;
    private StringBuilder guesWord;
    private int missed;

    public Hangman() {
        File file = new File("hangman.txt");

        if (!file.exists()) {
            System.out.println("Error!!");
            System.exit(1);
        } else {
            try {
                Scanner inputFile = new Scanner(file);

                ArrayList<String> list = new ArrayList<>();
                while (inputFile.hasNext()) {
                    list.add(inputFile.next());
                }

                compWord = list.get((int) (Math.random() * list.size()));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            guesWord = new StringBuilder();

            for (int i = 0; i < compWord.length(); i++)
                guesWord.append("*");
        }
    }

    public boolean win() {
        for (int i = 0; i < guesWord.length(); i++)
            if (guesWord.toString().charAt(i) == '*')
                return false;

        return true;
    }

    public StringBuilder getGuesWord() {
        return guesWord;
    }

    public String getCompWord() {
        return compWord;
    }

    public void checkChar(char ch) {


        boolean inWord = false;
        for (int i = 0; i < getCompWord().length(); i++) {
            if (ch == getGuesWord().charAt(i)) {
                System.out.println("\t" + ch + " is already in the word");
                inWord = true;
                break;
            }

            if (ch == getCompWord().charAt(i)) {
                guesWord.replace(i, i + 1, String.valueOf(ch));
                inWord = true;
            }
        }

        if (!inWord) {
            System.out.println("\t" + ch + " is not in the word");
            missed++;
        }
    }

    public int getMissed() {
        return missed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean stop = false;

        do {
            Hangman game = new Hangman();

            while (!game.win()) {

                System.out.print("(Guess) Enter a letter in word " + game.getGuesWord() + " > ");
                char ch = input.nextLine().charAt(0);

                game.checkChar(ch);

            }

            System.out.println("The word is " + game.getCompWord() + ". You missed " + game.getMissed() + " time");
            System.out.print("Do you want to guess another word? Enter y or n > ");
            if (input.nextLine().charAt(0) == 'n')
                stop = true;

        } while (!stop);


    }

}

