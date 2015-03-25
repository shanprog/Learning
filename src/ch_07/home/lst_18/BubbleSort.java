package ch_07.home.lst_18;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("Array BEFORE sorting:");
        for (double d : array)
            System.out.print(d + " ");
        System.out.println();

        bubbleSort(array);

        System.out.println("Array AFTER sorting:");
        for (double d : array)
            System.out.print(d + " ");
        System.out.println();
    }

    public static void bubbleSort(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
