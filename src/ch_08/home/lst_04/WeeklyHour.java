package ch_08.home.lst_04;

public class WeeklyHour {
    public static void main(String[] args) {
        int[][] employees = {
                {2, 4, 3, 4, 5, 8, 8, 0},
                {7, 3, 4, 3, 3, 4, 4, 0},
                {3, 3, 4, 3, 3, 2, 2, 0},
                {9, 3, 4, 7, 3, 4, 1, 0},
                {3, 5, 4, 3, 6, 3, 8, 0},
                {3, 4, 4, 6, 3, 4, 4, 0},
                {3, 7, 4, 8, 3, 8, 4, 0},
                {6, 3, 5, 9, 2, 7, 9, 0}
        };

        int[][] sums = new int[2][employees.length];

        for (int i = 0; i < employees.length; i++) {
            sums[0][i] = weekSum(employees[i]);
            sums[1][i] = i;
        }

        sortEmployees(sums);

        for (int i = 0; i < sums[0].length; i++) {
            System.out.println("Employee " + sums[1][i] + " works total " + sums[0][i]);
        }
    }

    public static void sortEmployees(int[][] list) {

        for (int i = 0; i < list[0].length - 1; i++) {

            int currentMax = list[0][i];
            int currentMaxEmp = list[1][i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list[0].length; j++) {
                if (currentMax < list[0][j]) {
                    currentMax = list[0][j];
                    currentMaxEmp = list[1][j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[0][currentMaxIndex] = list[0][i];
                list[1][currentMaxIndex] = list[1][i];
                list[0][i] = currentMax;
                list[1][i] = currentMaxEmp;
            }
        }
    }

    public static int weekSum(int[] employee) {

        int sum = 0;

        for (int i : employee)
            sum += i;

        return sum;
    }

    public static void print2DArray(int[][] array) {

        for (int[] anArray : array) {
            for (int anAnArray : anArray)
                System.out.print(anAnArray + " ");

            System.out.println();
        }
    }


}
