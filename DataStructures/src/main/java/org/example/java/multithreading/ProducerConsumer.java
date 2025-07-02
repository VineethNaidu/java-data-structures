package org.example.java.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        Worker worker = new Worker(5, 0);

        Thread producer = new Thread(() -> {
            try {
                worker.produce();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                worker.consume();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

class Worker {
    private static int item;
    private int top;
    private int bottom;
    private List<Integer> container = null;
    private static final Object lock = new Object();

    public Worker(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException {
        synchronized(lock) {
            while(true) {
                if(container.size() == top) {
                    System.out.println("Container is full, Waiting for consumer to consume");
                    lock.wait();
                    System.out.println("Container is empty, Producer Starts to produce");
                }
                else {
                    System.out.println(item + " item is added to container");
                    container.add(item++);
                    lock.notify();
                }
                Thread.sleep(100);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while(true) {
                if(container.size() == bottom) {
                    System.out.println("Container is empty, Waiting for producer to produce");
                    lock.wait();
                    System.out.println("Container is full, Consumer starts consuming");
                }
                else {
                    int removedItem = container.removeFirst();
                    System.out.println(removedItem + " item is removed from container");
                    lock.notify();
                }
                Thread.sleep(100);
            }
        }
    }

}
