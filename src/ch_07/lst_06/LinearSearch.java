package ch_07.lst_06;

public class LinearSearch {
    public static void main(String[] args) {

        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        System.out.println(linearSearch(list, -4));
    }

    public static int linearSearch(int[] list, int key) {

        for (int i = 0; i < list.length; i++)
            if (list[i] == key)
                return i;

        return -1;
    }
}
