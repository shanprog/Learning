package ch_09.home.lst_16;

import java.util.Arrays;

public class MyString1 {

    private char[] content;

    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] {'a', 'b', 'c'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.equals(new MyString1(new char[] {'a', 'b', 'c'})));

        char[] chars = MyString1.valueOf(345).toChars();
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }



    public MyString1(char[] chars) {
        content = Arrays.copyOf(chars, chars.length);
    }

    public char charAt(int index) {
        return content[index];
    }

    public int length() {
        return content.length;
    }

    public MyString1 substring(int begin, int end) {
        return new MyString1(Arrays.copyOfRange(content, begin, end));
    }

    public MyString1 toLowerCase() {

        for (int i = 0; i < content.length; i++)
            content[i] = Character.toLowerCase(content[i]);

        return new MyString1(content);
    }

    public boolean equals(MyString1 s) {

        if (content.length != s.length())
            return false;


        for (int i = 0; i < content.length; i++)
            if (content[i] != s.charAt(i))
                return false;

        return true;
    }

    public static MyString1 valueOf(int i) {

        char[] temp = new char[40];
        int size = 0;
        while (i != 0) {
            int number = i % 10;
            i = i / 10;
            temp[size] = (char)(number + '0');
            size++;
        }

        char[] temp2 = new char[size];
        for (int k = size - 1; k >= 0; k--) {
            temp2[k] = temp[size - k - 1];
        }

        return new MyString1(temp2);
    }

    public char[] toChars() {
        return content;
    }

}
