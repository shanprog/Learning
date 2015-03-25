package ch_02.home.lst_08;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int timeOffset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        long currentHour = (totalHours + timeOffset) % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
