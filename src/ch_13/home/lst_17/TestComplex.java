package ch_13.home.lst_17;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number: ");
        Complex complex1 = new Complex(input.nextDouble(), input.nextDouble());

        System.out.print("Enter the second complex number: ");
        Complex complex2 = new Complex(input.nextDouble(), input.nextDouble());

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println("|" + complex1 + "|  = " + complex1.abs());
    }
}
