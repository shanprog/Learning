package ch_06;

public class lst_09_InsertionSort {
    public static void main(String[] args) {

    }

    public static void insertionSort(double[] list) {

        for (int i = 1; i < list.length; i++) {
            double currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }
}
