package org.example.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecuter {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: " + cores);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<10; i++) {
            executorService.execute(new Task1(i));
        }
    }
}

class Task1 implements Runnable {

    private int taskId;

    public Task1(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running by " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
