package ch_02.home;

import java.util.Scanner;

public class lst_13_CompoudValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double currentAmount = 0;
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);
        currentAmount = (monthlySaving + currentAmount) * (1 + 0.00417);

        System.out.println("After the sixth month, the account value is $" + (int) (currentAmount * 100) / 100.0);
    }
}
