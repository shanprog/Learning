package ch_17.home.lst_05;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class StoreObjectsInFile {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Date date = new Date();
        double d = 5.5;

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Exercise17_05"))) {
            outputStream.writeObject(array);
            outputStream.writeObject(date);
            outputStream.writeDouble(d);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_05"))) {
            System.out.println(Arrays.toString((int[]) input.readObject()));
            System.out.println(input.readObject());
            System.out.println(input.readDouble());
        }
        catch (IOException ioe) {

        }
        catch (ClassNotFoundException cnfe){

        }

    }
}
