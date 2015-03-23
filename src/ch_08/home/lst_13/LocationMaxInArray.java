package ch_08.home.lst_13;

import java.util.Scanner;

public class LocationMaxInArray {
    private int row;
    private int column;
    private double maxValue;

    public LocationMaxInArray(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static LocationMaxInArray locateLargest(double[][] a) {

        int row = 0;
        int col = 0;
        double max = a[row][col];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < a[i][j]) {
                    row = i;
                    col = j;
                    max = a[i][j];
                }
            }
        }

        return new LocationMaxInArray(row, col, max);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");

        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] a = new double[rows][cols];

        System.out.println("Enter the array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        LocationMaxInArray lmia = locateLargest(a);

        System.out.println("The location of the largest element is " + lmia.getMaxValue() + " at (" + lmia.getRow() + ", " + lmia.getColumn() + ")");
    }

}
