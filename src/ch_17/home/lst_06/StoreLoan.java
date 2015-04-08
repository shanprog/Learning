package ch_17.home.lst_06;

import ch_10.lst_01_02.Loan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreLoan {
    public static void main(String[] args) {
        Loan loan1 = new Loan(3, 10, 100000);
        Loan loan2 = new Loan(2.5, 12, 100000);
        Loan loan3 = new Loan(2.1, 11, 100000);
        Loan loan4 = new Loan(4, 11, 100000);
        Loan loan5 = new Loan(10, 5, 100000);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_06.dat"))) {
            output.writeObject(loan1);
            output.writeObject(loan2);
            output.writeObject(loan3);
            output.writeObject(loan4);
            output.writeObject(loan5);
        } catch (IOException ioe) {

        }

        System.out.println("Done");
    }
}
