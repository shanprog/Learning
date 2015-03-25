package ch_09.lst_06_07;

public class CircleWithStaticMembers {

    double radius;

    static int numberOfObjects = 0;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

}
