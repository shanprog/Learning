package ch_03.home;

import java.util.Scanner;

public class lst_19_PerimetrTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 edges: ");

        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if ((edge1+edge2<edge3) || (edge2+edge3<edge1) || (edge1+edge3<edge2 )) {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        System.out.println("Perimetr is " + (edge1 + edge2 + edge3));
    }
}
