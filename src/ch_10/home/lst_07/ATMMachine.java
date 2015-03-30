package ch_10.home.lst_07;

import ch_09.home.lst_07.Account;

import java.util.Scanner;

public class ATMMachine {

    private Account[] accounts = new Account[10];

    public ATMMachine() {
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
    }

    public boolean correctId(int id) {
        return id >= 0 && id < accounts.length;
    }

    public double getBalanceOfAccount(int id) {
        return accounts[id].getBalance();
    }

    public void setWithdrawOfAccount(int id, double money) {
        accounts[id].withdraw(money);
    }

    public void setDepositOfAccount(int id, double money) {
        accounts[id].deposit(money);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ATMMachine machine = new ATMMachine();

        while (true) {


            System.out.print("Enter an id: ");
            int id = input.nextInt();

            while (!machine.correctId(id)) {
                System.out.print("Enter correct id: ");
                id = input.nextInt();
            }

            int choice = 0;

            while (choice != 4) {
                System.out.print("Main menu\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" +
                        "Enter a choice: ");

                choice = input.nextInt();

                double money;

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + machine.getBalanceOfAccount(id));
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        money = input.nextDouble();
                        machine.setWithdrawOfAccount(id, money);
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        money = input.nextDouble();
                        machine.setDepositOfAccount(id, money);
                        System.out.println();
                        break;
                }
            }

            System.out.println();
        }


    }

}
