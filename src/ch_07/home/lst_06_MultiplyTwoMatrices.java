package ch_07.home;

import java.util.Scanner;

public class lst_06_MultiplyTwoMatrices {
    public static void main(String[] args) {

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = getMatrix();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = getMatrix();

        double[][] result = multiplyMatrix(matrix1, matrix2);

        System.out.println("\nThe multiplication of the matrices is ");
        printResult(matrix1, matrix2, result, '*');
    }

    public static double[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = input.nextDouble();

        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {

        double[][] result = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < result.length; j++)
                for (int k = 0; k < result[0].length; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);

            if (i == m1.length / 2)
                System.out.print("  " + op + "  ");
            else
                System.out.print("     ");

            for (int j = 0; j < m2[0].length; j++)
                System.out.print(" " + m2[i][j]);

            if (i == m1.length / 2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int j = 0; j < m3[0].length; j++)
                System.out.print(" " + m3[i][j]);

            System.out.println();
        }
    }
}
