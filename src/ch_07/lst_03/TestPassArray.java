package ch_07.lst_03;

public class TestPassArray {
    public static void main(String[] args) {
        int a[] = {1, 2};
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArra(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    /**
     * Swap two variables
     */
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /**
     * Swap the first two elements in the array
     */
    public static void swapFirstTwoInArra(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

}
