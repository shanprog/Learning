package ch_08.home.lst_36;

import java.util.Scanner;

public class LatinSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");

        int n = input.nextInt();

        System.out.println("Enter " + n + " rows of letters separated by spaces: ");

        char[][] square = new char[n][n];
        input.nextLine();

        for (int i = 0; i < n; i++) {

            String temp = input.nextLine();
            char[] chars = (temp.replace(" ", "")).toCharArray();

            for (int j = 0; j < n; j++) {
                square[i][j] = chars[j];

                if (square[i][j] >= 'A' + n) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + n - 1));
                    System.exit(1);
                }
            }
        }

        if (validationSquare(square))
            System.out.println("The input array is a Latin square");
        else
            System.out.println("The input array is not a Latin square");

    }

    public static boolean validationSquare(char[][] square) {

        for (char[] aSquare : square)
            if (!validationChars(aSquare))
                return false;

        for (int i = 0; i < square[0].length; i++) {

            char[] column = new char[square[0].length];

            for (int j = 0; j < square.length; j++) {
                column[j] = square[j][i];
            }

            if (!validationChars(column))
                return false;
        }

        return true;
    }

    public static boolean validationChars(char[] row) {

        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if (row[i] == row[j])
                    return false;
            }
        }

        return true;
    }

    public static void print2DArray(char[][] array) {

        for (char[] anArray : array) {
            for (char anAnArray : anArray)
                System.out.print(anAnArray + " ");

            System.out.println();
        }
    }
}
