package ch_06.home;

import java.util.Scanner;

public class lst_32_PartitionOfList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();


        int pos = partition(list);


        System.out.print("After the partition, the list is ");

        for (int i: list)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Pos: " + pos);
    }

    public static int partition(int[] list) {

        int pos = 0;

        for (int i = 1; i < list.length; i++) {
            if (list[i] <= list[pos]) {
                int temp = list[i];
                for (int j = i; j > 0; j--)
                    list[j] = list[j - 1];

                list[0] = temp;

                pos++;
            }
        }

        return pos;
    }

}
