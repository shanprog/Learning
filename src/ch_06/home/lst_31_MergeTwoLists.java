package ch_06.home;

import java.util.Scanner;

public class lst_31_MergeTwoLists {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();



//        int[] list3 = merge(list1, list2);
//        System.out.print("The merged list is ");
//
//        for (int aList3 : list3)
//            System.out.print(aList3 + " ");

        System.out.println();
    }

//    public static int[] merge(int[] list1, int[] list2) {
//
//
//
//    }
}
