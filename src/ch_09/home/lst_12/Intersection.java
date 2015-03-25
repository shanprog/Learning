package ch_09.home.lst_12;

import ch_09.home.lst_11.LinearEquation;

import java.util.Scanner;

public class Intersection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the endpoints of the first line segment: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter the endpoints of the second line segment: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = (y2 - y1);
        double b = (x1 - x2);
        double c = (y4 - y3);
        double d = (x3 - x4);
        double e = (y2 - y1) * x1 - (x2 - x1) * y1;
        double f = (y4 - y3) * x3 - (x4 - x3) * y3;

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.println("The intersecting point is: (" + eq.getX() + ", " + eq.getY() + ")");
        } else {
            System.out.println("The two lines do not cross ");
        }
    }

}
