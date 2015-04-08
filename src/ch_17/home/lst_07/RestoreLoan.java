package ch_17.home.lst_07;

import ch_10.lst_01_02.Loan;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RestoreLoan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        long sum = 0;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"))) {

            while (true) {
                Loan loan = (Loan) input.readObject();
                sum += loan.getLoanAmount();
            }

        } catch (EOFException eofe) {

        }

        System.out.println("Total loan amount: " + sum);
    }
}
