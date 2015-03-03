package ch_03.home;

import java.util.Scanner;

public class lst_04_LearnAddition {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int sum = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + sum + " is " + (number1 + number2 == sum));
    }
}
