package ch_30.book.lst_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSyncUsingLock {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Create and launch 100 threads
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }

    public static class AddAPennyTask implements Runnable {
        @Override
        public void run() {
            account.deposit(1);
        }
    }


    public static class Account {
        private static Lock lock = new ReentrantLock();
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            lock.lock();

            try {
                int newBalance = balance + amount;
                Thread.sleep(5);

                balance = newBalance;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock(); // Release the lock
            }

        }

    }
}
