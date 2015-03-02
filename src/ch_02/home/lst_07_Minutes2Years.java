package ch_02.home;

import java.util.Scanner;

public class lst_07_Minutes2Years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        long minutes = input.nextLong();
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        days %= 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
