package ch_06.home;

import java.util.Scanner;

public class lst_19_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of list: ");
        int length = input.nextInt();

        int[] list = new int[length];

        System.out.print("Enter list: ");

        for (int i = 0; i < length; i++)
            list[i] = input.nextInt();

        if (isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");

    }

    public static boolean isSorted(int[] list) {

        for (int i = 0, j = 1; j < list.length; i++, j++)
            if (list[i] > list[j])
                   return false;

        return true;
    }


}
