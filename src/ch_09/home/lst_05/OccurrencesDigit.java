package ch_09.home.lst_05;

public class OccurrencesDigit {

    public static void main(String[] args) {

        int[] counts = count("12203AB3");

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                System.out.println(i + " appears " + counts[i] + (counts[i] == 1 ? " time" : " times"));
        }
    }

    public static int[] count(String s) {

        int[] counts = new int[10];

        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                counts[s.charAt(i) - '0']++;

        return counts;
    }

}
