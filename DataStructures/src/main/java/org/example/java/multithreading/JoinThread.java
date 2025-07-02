package org.example.java.multithreading;

public class JoinThread {
    public static void main(String[] args) {

        System.out.println("Main Thread: " + Thread.currentThread().getId());
        System.out.println("Before Starting Threads");
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<20; i++) {
                System.out.println("Thread 1: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<20; i++) {
                try {
                    thread1.join();   // Thread2 will wait until Thread1 is completed.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();  // It won't achieve one after another thread execution. Because Main thread only wait not Thread2. So, explicitly added thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After Starting Threads");
    }
}
