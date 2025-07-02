package org.example.java.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddEvenUsingLock extends Thread {

    public int count = 1;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition(); // optional

    public void printOdd() {
        while(count < 100) {
            lock.lock();
            try {
                if(count % 2 != 0) {
                    System.out.println("Odd Thread: " + count);
                    count++;
                    condition.signal(); // same as notify()
                }
                else {
                    condition.await(); // same as wait()
                }
            }
            catch (InterruptedException e) { e.printStackTrace(); }
            finally {
                lock.unlock();  // Unlock the lock
            }
        }
    }

    public void printEven() {
        while(count <= 100) {
            lock.lock();
            try {
                if(count%2 == 0) {
                    System.out.println("Even Thread: " + count);
                    count++;
                    condition.signal(); // same as notify()
                }
                else {
                    condition.await(); // same as wait()
                }
            }
            catch (InterruptedException e) { e.printStackTrace(); }
            finally {
                lock.unlock();  // Unlock the lock
            }
        }
    }

    public static void main(String[] args) {
        PrintOddEvenUsingLock printOddEvenUsingLock = new PrintOddEvenUsingLock();

        Thread even = new Thread(() -> printOddEvenUsingLock.printEven(), "Even Thread");
        Thread odd = new Thread(() -> printOddEvenUsingLock.printOdd(), "Odd Thread");

        odd.start();
        even.start();
    }
}
