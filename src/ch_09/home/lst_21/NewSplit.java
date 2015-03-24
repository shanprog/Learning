package ch_09.home.lst_21;

import java.util.Arrays;

public class NewSplit {

    public static void main(String[] args) {
        String[] strings = split("ab#12#453", "#");

        for (String str : strings)
            System.out.print(str + " ");
        System.out.println();


        strings = split("a?b?gf#e", "[?#]");

        for (String str : strings)
            System.out.print(str + " ");
        System.out.println();
    }


    public static String[] split(String s, String regex) {

        char[] regchars;
        String tmp;

        if (regex.length() > 1) {
            tmp = (regex.trim()).substring(1, regex.length() - 1);
            regchars = tmp.toCharArray();
        } else
            regchars = regex.trim().toCharArray();

        tmp = "";

        String[] splitting = new String[1];

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            boolean eq = false;
            int j;

            for (j = 0; j < regchars.length; j++) {
                if (s.charAt(i) == regchars[j]) {
                    eq = true;
                    break;
                }
            }

            if (!eq)
                tmp += s.charAt(i);
            else {
                splitting = Arrays.copyOf(splitting, splitting.length + 2);

                splitting[counter] = tmp;
                counter++;
                splitting[counter] = String.valueOf(regchars[j]);
                counter++;
                tmp = "";
            }

            if (i == s.length() - 1)
                splitting[counter] = tmp;
        }


        return splitting;
    }

}
