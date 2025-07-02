package org.example.java.multithreading;

import java.util.concurrent.*;

public class ExecuterThreadService {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(5);  // 5 threads

        ThreadPoolExecutor threadPoolExecutorexecutor = new ThreadPoolExecutor(
                3,                     // Core threads
                5,                     // Max threads
                60,                    // Idle thread timeout
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2), // Task queue with capacity 2
                new ThreadPoolExecutor.CallerRunsPolicy()  // Rejection policy
        );

        for(int i = 0; i < 10; i++) {
            int task = i;
            threadPoolExecutorexecutor.execute(() -> System.out.println("Thread " + Thread.currentThread().getName() + " is running... Task" + task));
        }
//
//        for(int i = 0; i < 10; i++) {
//            int task = i;
//            executor.execute(() -> System.out.println("Thread " + Thread.currentThread().getName() + " is running... Task" + task));
//        }

//        executor.shutdown();
        threadPoolExecutorexecutor.shutdown();
    }
}
