package ch_30.book.lst_03;

import ch_30.book.lst_01.PrintChar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
//        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintChar('c', 100));

        executor.shutdown();

    }
}
