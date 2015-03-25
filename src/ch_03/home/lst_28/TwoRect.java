package ch_03.home.lst_28;

import java.util.Scanner;

public class TwoRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double lenX = Math.abs(x1 - x2);
        double lenY = Math.abs(y1 - y2);


        if (lenX <= Math.abs(width1 - width2) && lenY <= Math.abs(height1 - height2)) {
            System.out.println("r2 is inside r1");
        }
        else if (lenX > width1 + width2 && lenY > height1 + height2) {
            System.out.println("r2 does not overlap r1");
        }
        else
            System.out.println("r2 overlaps r1");
    }
}
