package ch_09.lst_10;

import ch_09.lst_08_09.CircleWithPrivateDataFields;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);

        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);

    }

    private static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;

        }
    }

}
