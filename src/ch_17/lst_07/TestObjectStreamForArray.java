package ch_17.lst_07;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true))) {
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"))) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());


            for (int newNumber : newNumbers)
                System.out.print(newNumber + " ");
            System.out.println();

            for (String newString : newStrings)
                System.out.print(newString + " ");
        }

    }
}
