package ch_05.home;

public class lst_25_ConvertMilis {
    public static void main(String[] args) {
        System.out.println(convertMillis(5500));
        System.out.println(convertMillis(100000));
        System.out.println(convertMillis(555550000));
    }

    public static String convertMillis(long millis) {

        long totalSec = millis / 1000;
        long curSec = totalSec % 60;

        long totalMin = totalSec / 60;
        long curMin = totalMin % 60;

        long totalHours = totalMin / 60;

        return totalHours + ":" + curMin + ":" + curSec;
    }
}
