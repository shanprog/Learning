package ch_03.home.lst_27;

import java.util.Scanner;

public class PointInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double x1 = 0, y1 = 100, x2 = 200;


        double y = (y1 * x1 + x2 * y1 - y1 * x3) / x2;

        if (x3 > 0 && x3 < x2 && y3 < y)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");

    }
}
