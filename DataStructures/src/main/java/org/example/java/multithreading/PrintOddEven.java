package org.example.java.multithreading;

public class PrintOddEven {

    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                System.out.println("Odd Thread: " + number);
                number++;
                notify();  // Notify even thread
            } else {
                try {
                    wait();  // Wait for even thread to increment
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even Thread: " + number);
                number++;
                notify();  // Notify odd thread
            } else {
                try {
                    wait();  // Wait for odd thread to increment
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
       PrintOddEven printOddEven = new PrintOddEven();

       Thread even = new Thread(() -> printOddEven.printEven(), "Even Thread");
       Thread odd = new Thread(() -> printOddEven.printOdd(), "Odd Thread");

       odd.start();
       even.start();
    }
}
