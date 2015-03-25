package ch_07.home.lst_31;

import java.util.Scanner;

public class MergeTwoLists {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();


        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();


        int[] list3 = merge(list1, list2);

        for (int i : list3)
            System.out.print(i + " ");

    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] list = new int[list1.length + list2.length];
        int counter = 0;

        for (int i = 0, j = 0; i < list1.length || j < list2.length; ) {

            if (i == list1.length) {
                list[counter] = list2[j];
                j++;
            } else if (j == list2.length) {
                list[counter] = list1[i];
                i++;
            } else {
                if (list1[i] <= list2[j]) {
                    list[counter] = list1[i];
                    i++;
                } else {
                    list[counter] = list2[j];
                    j++;
                }
            }

            counter++;
        }

        return list;
    }
}
