package ch_05.home;

import java.util.Scanner;

public class lst_22_SquareRoot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        long val = input.nextLong();

        System.out.println("Square root of " + val + " is " + sqrt(val));
    }

    public static double sqrt(long n) {

        double nextGuess = 0;
        double lastGuess = 1;


        while (true) {
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if (nextGuess - lastGuess < 0.00001) {
                    break;
            }
            else {
                lastGuess = nextGuess;
            }
        }

        return nextGuess;
    }
}
