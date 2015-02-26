package ch_02.home;

import java.util.Scanner;

public class lst_02_VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.1418;
        double volume = area * length;

        System.out.println("The area is " + area + "\n" + "The volume is " + volume);
    }
}
