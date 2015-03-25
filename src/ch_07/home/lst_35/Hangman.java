package ch_07.home.lst_35;

import java.util.Scanner;

public class Hangman {


    private String[] words = {"write", "that", "programm", "something"};
    private int compGuess;
    private StringBuilder guessedWord;

    private int missed;

    public Hangman() {
        compGuess = (int) (Math.random() * words.length);
        guessedWord = new StringBuilder();

        for (int i = 0; i < words[compGuess].length(); i++)
            guessedWord.append("*");

        missed = 0;
    }

    public String getGuessedWord() {
        return guessedWord.toString();
    }

    public String getCompWord() {
        return words[compGuess];
    }

    public int getMissed() {
        return missed;
    }

    public void checkChar(char ch) {


        boolean inWord = false;
        for (int i = 0; i < getCompWord().length(); i++) {
            if (ch == getGuessedWord().charAt(i)) {
                System.out.println("\t" + ch + " is already in the word");
                inWord = true;
                break;
            }

            if (ch == getCompWord().charAt(i)) {
                guessedWord.replace(i, i + 1, String.valueOf(ch));
                inWord = true;
            }
        }

        if (!inWord) {
            System.out.println("\t" + ch + " is not in the word");
            missed++;
        }
    }

    public boolean win() {
        for (int i = 0; i < guessedWord.length(); i++)
            if (guessedWord.charAt(i) == '*')
                return false;

        return true;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char next = 'y';

        while (next != 'n') {
            System.out.println();

            Hangman hangman = new Hangman();

            while (!hangman.win()) {
                System.out.print("(Guess) Enter a letter in word " + hangman.getGuessedWord() + " > ");
                char ch = input.nextLine().charAt(0);

                hangman.checkChar(ch);
            }

            System.out.println("The word is " + hangman.getCompWord() + ". You missed " + hangman.getMissed() + " time");
            System.out.print("Do you want to guess another word? Enter y or n > ");

            next =  input.nextLine().charAt(0);
        }

    }
}
