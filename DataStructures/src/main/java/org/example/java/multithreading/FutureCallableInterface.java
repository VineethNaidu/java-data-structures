package org.example.java.multithreading;

import java.util.concurrent.*;

// Use Callable When Thread returns a value
public class FutureCallableInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(new ReturnValueTask());
//        result.cancel(false);
//        result.isDone();
        System.out.println("Callable Return Value: " + result.get());
        System.out.println("Main Thread Completed its Execution...");
    }
}

class ReturnValueTask implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Callable Thread: " + Thread.currentThread().getName() + " is running...");
        return 10;
    }
}
