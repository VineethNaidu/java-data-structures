package org.example.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    // Producer adds items
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer full. Producer is waiting...");
            wait();  // Wait if buffer is full
        }

        buffer.add(item);
        System.out.println("Produced: " + item);

        notifyAll();  // Notify consumer that new item is available
    }

    // Consumer removes items
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer empty. Consumer is waiting...");
            wait();  // Wait if buffer is empty
        }

        int item = buffer.remove();
        System.out.println("Consumed: " + item);

        notifyAll();  // Notify producer that space is available
        return item;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {
            int item = 0;
            try {
                while (true) {
                    buffer.produce(item++);
                    Thread.sleep(500);  // Simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(1000);  // Simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
