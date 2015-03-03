package ch_03.home;

import java.util.Scanner;

public class lst_23_PointInRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) <= 10.0 / 2 && Math.abs(y) <= 5.0 / 2)
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}
