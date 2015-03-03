package ch_03.home;

import java.util.Scanner;

public class lst_22_PointCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        double in = Math.sqrt(x * x + y * y);

        if (in < 10) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        }
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
    }

}
