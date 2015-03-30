package ch_11.lst_05;

import ch_11.lst_01_04.CircleFromSimpleGeometricObject;
import ch_11.lst_01_04.RectangleFromSimpleGeometricObject;
import ch_11.lst_01_04.SimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +". Color is " + object.getColor());
    }
}
