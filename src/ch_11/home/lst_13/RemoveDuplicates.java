package ch_11.home.lst_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers: ");

        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are ");

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j).equals(list.get(i)))
                    list.remove(j);
    }

}
