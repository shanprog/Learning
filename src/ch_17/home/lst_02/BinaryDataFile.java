package ch_17.home.lst_02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class BinaryDataFile {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true))) {
            for (int i = 0; i < 100; i++) {
                Random random = new Random();
                output.writeInt(random.nextInt());
                output.writeChar(' ');
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
