package ch_06.home.lst_24;

public class CurrentTimeAndDay {
    public static void main(String[] args) {
        long miliseconds = System.currentTimeMillis();

        long seconds = miliseconds / 1000;

        System.out.println("Current time and date: ");
        printCurrentYear(seconds);
    }

    private static void printCurrentYear(long sec) {

        int year = 1970;

        while (sec - getCountOfDayInYear(year) * 24 * 60 * 60 > 0) {
            sec -= getCountOfDayInYear(year) * 24 * 60 * 60;
            year++;
        }

        System.out.print(year);

        printCurrentMonth(sec, year);
    }


    public static void printCurrentMonth(long sec, int year) {

        int month = 1;

        while (sec - getCountOfDayInMonth(month, year) * 24 * 60 * 60 > 0) {
            sec = sec - getCountOfDayInMonth(month, year) * 24 * 60 * 60;
            month++;
        }

        System.out.print(" " + getMonthName(month));

        printCurrentDay(sec);
    }

    public static void printCurrentDay(long sec) {

        int day = 1;

        while (sec - 24 * 60 * 60 > 0) {
            sec = sec - 24 * 60 * 60;
            day++;
        }

        System.out.println(" " + day);

        long currentSecond = sec % 60;
        long totalMinutes = sec / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

    private static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }

    public static int getCountOfDayInMonth(int month, int year) {

        switch (month) {
            case 0:
                return 31;
            case 1:
                return isLeapYear(year) ? 29 : 28;
            case 2:
                return 31;
            case 3:
                return 30;
            case 4:
                return 31;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 31;
            case 8:
                return 30;
            case 9:
                return 31;
            case 10:
                return 30;
            case 11:
                return 31;
        }

        return 0;
    }

    public static int getCountOfDayInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
