package ch_17.home.lst_03;

import java.io.*;

public class SumIntegersInBinFile {
    public static void main(String[] args) throws IOException {

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))) {
            for (int i = 0; i < 10; i++) {
                output.writeInt((int) (Math.random() * 20));
            }
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"))) {
            long sum = 0;

            int val;
            while ((val = input.read()) != -1)
                sum += val;

            System.out.println("Sum: " + sum);
        }
    }
}
