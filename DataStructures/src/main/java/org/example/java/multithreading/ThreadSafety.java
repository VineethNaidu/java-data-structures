package org.example.java.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class Synchronized {
    private int count = 0;

    public synchronized void increment() {
        System.out.println("Synchronized Counter Thread Name: " + Thread.currentThread().getName() + " Id: " + Thread.currentThread().getId());
        count += 1;
    }

    public synchronized int getCount() {
        return count;
    }
}

class Atomic {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public void increment() {
        System.out.println(STR."Atomic Counter Thread Name: \{Thread.currentThread().getName()} Id: \{Thread.currentThread().getId()}");
        atomicInteger.incrementAndGet();  // incrementAndGet() is an atomic operation
    }

    public int getCount() {
        return atomicInteger.get();
    }
}

class LockCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            System.out.println(STR."Lock Counter Thread Name: \{Thread.currentThread().getName()} Id: \{Thread.currentThread().getId()}");
            count += 1;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class ConcurrentHashMapCollection {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void add(String key, int value) {
        map.put(key, value);
    }

    public void printAll() {
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}

final class ImmutableObject {
    private final String name;

    public ImmutableObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ThreadSafety {
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running counters with multiple Threads...");

        // Synchronized Counter Test
        Synchronized syncCounter = new Synchronized();
        runMultipleThreads(() -> syncCounter.increment(), 5);
        System.out.println("Synchronized Counter: " + syncCounter.getCount());

        // Atomic Counter Test
        Atomic atomicCounter = new Atomic();
        runMultipleThreads(() -> atomicCounter.increment(), 5);
        System.out.println("Atomic Counter: " + atomicCounter.getCount());

        // Lock Counter Test
        LockCounter lockCounter = new LockCounter();
        runMultipleThreads(() -> lockCounter.increment(), 5);
        System.out.println("Lock Counter: " + lockCounter.getCount());

        // 4. Concurrent Map
        ConcurrentHashMapCollection mapExample = new ConcurrentHashMapCollection();
        mapExample.add("ThreadA", 10);
        mapExample.add("ThreadB", 20);
        System.out.println("Concurrent Map:");
        mapExample.printAll();

//      5. ThreadLocal
        Runnable task = () -> {
            threadLocalValue.set((int) (Math.random() * 100)); // Each thread sets its own value
            System.out.println(Thread.currentThread().getName() + " : " + threadLocalValue.get());
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");

        t1.start();
        t2.start();
        t3.start();

        // 6. Immutable Object
        ImmutableObject person = new ImmutableObject("Vini");
        runMultipleThreads(() -> new ImmutableObject("Vini"), 5);
        System.out.println("Immutable Person: " + person.getName());
    }

    public static void runMultipleThreads(Runnable task, int numThreads) throws InterruptedException {
        Thread[] thread = new Thread[numThreads];
        System.out.println("Current Thread Name: " + Thread.currentThread().getName() + " Id: " + Thread.currentThread().getId());
        for (int i = 0; i < numThreads; i++) {
            thread[i] = new Thread(task);
            thread[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            thread[i].join(); // Wait for all threads to finish one by one
        }
    }
}

/*
Thread Safety: (Correctness of the program)
Def: When multiple threads access shared resources, the final result remains correct
     without corrupting data — no race conditions, no unexpected behavior.

Common Problems without Thread Safety:
1. Race Condition - Two Threads Read and Write at the same time. (Corrupted Data)
2. Deadlock - Two threads are waiting for each other.

How to achieve Thread Safety?
1. Synchronized -> Locks code block or method (critical section) so that only one thread can access it at a time
2. Volatile -> changes made in a volatile variable visible to all threads immediately. Eg: volatile int count = 0;
3. Atomic -> Provides atomic operations. Eg: AtomicInteger class, AtomicBoolean class, AtomicReference class
4. Lock (ReetrantLock, ReadWriteLock) -> Explicit locking/unlocking	lock.lock(); try { } finally { lock.unlock(); }
5. ThreadLocal -> Each thread has its own copy of the variable; ThreadLocal<DateFormat> formatter = new ThreadLocal<>();
6. Concurrent Collections -> Thread-safe collections; ConcurrentHashMap, CopyOnWriteArrayList
7. Immutable Objects -> No state modification → thread-safe by design; final fields, no setters


 */
