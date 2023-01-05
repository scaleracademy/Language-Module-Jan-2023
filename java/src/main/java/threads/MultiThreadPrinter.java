package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadPrinter {

    // Print numbers from 1 to 100 using 3 different threads
    // No 2 consecutive numbers should get printed by the same thread
    // synchronized, atomic variables, volatile

    public static void main(String[] args) {
        int MAX = 100;
        AtomicInteger count = new AtomicInteger(0);
        Runnable numberPrinter = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (count) {
                        int current = count.incrementAndGet();
                        if (current > MAX) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + current);
                        count.notify();
                        try {
                            count.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
        };

        Thread t1 = new Thread(numberPrinter);
        Thread t2 = new Thread(numberPrinter);
        Thread t3 = new Thread(numberPrinter);

        t1.start();
        t2.start();
        t3.start();
    }
}
