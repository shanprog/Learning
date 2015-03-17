package ch_06.home;

import java.util.Scanner;

public class lst_17_SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int countStudents = input.nextInt();

        String[] names = new String[countStudents];
        int[] scores = new int[countStudents];

        for (int i = 0; i < countStudents; i++) {
            System.out.print("Enter name and scores of student: ");

            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        sortStudents(names, scores);

        for (int i = 0; i < countStudents; i++)
            System.out.println(names[i] + "\t" + scores[i]);

    }

    public static void sortStudents(String[] names, int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] > scores[i]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

    }
}
