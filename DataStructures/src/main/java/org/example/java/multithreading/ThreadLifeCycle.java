package org.example.java.multithreading;

public class ThreadLifeCycle extends Thread {
    public void run() {
        try {
            Thread.sleep(500); // TIMED_WAITING
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        ThreadLifeCycle t1 = new ThreadLifeCycle(); // NEW
        System.out.println("State after creating: " + t1.getState());
        t1.start(); // RUNNABLE
        System.out.println("State after starting: " + t1.getState());

        try {
         // Thread.currentThread().join();  // will tell Main thread to wait for this thread(i.e. wait for itself) to die. Thus Main thread wait for itself to die, which is nothing but a deadlock.
            Thread.sleep(200); // Main thread sleeps
            System.out.println("State while sleeping: " + t1.getState());
            System.out.println("current Thread Priority: " + t1.getClass());
            System.out.println("Main Thread Priority " + Thread.currentThread());
            t1.join(); // WAITING
            System.out.println("State after join: " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final State: " + t1.getState()); // TERMINATED
    }
}

/*
+-------+       start()        +-----------+
|  NEW  | -------------------> | RUNNABLE  |
+-------+                      +-----------+
                                   |
                      CPU Schedules |
                                   v
                              +-----------+
                              | RUNNING   |
                              +-----------+
                                   |
                  +----------------+----------------+
        Sleep() / Wait() / Join()      Blocked (Lock)
                  |                            |
        +---------+--------+         +---------+--------+
        | TIMED_WAITING     |         | BLOCKED         |
        +-------------------+         +-----------------+
                                   |
                                   v
                             (When conditions met)
                                   |
                                   v
                             +-----------+
                             | RUNNABLE  |
                             +-----------+
                                   |
                      run() completed OR Exception
                                   |
                                   v
                             +-------------+
                             | TERMINATED   |
                             +-------------+

start() moves thread from NEW → RUNNABLE.
run() is just a method call, doesn't start a new thread.
Blocked, Waiting, Timed_Waiting are ways a thread temporarily stops running.
Terminated threads cannot be restarted. (Only once start is allowed.)


wait() -> Causes the current thread to release the lock and enter the Waiting state.
          The thread must hold the monitor lock, or else IllegalMonitorStateException occurs.

Running ➔ Waiting

synchronized (object) {
    object.wait();
}
-------------------------
notify() -> Wakes up a single thread that is waiting on the object's monitor.
notifyAll() -> Wakes up all threads that are waiting on the object's monitor.

That thread will move to Runnable when it reacquires the lock.
Waiting ➔ Runnable (after lock is reacquired)

synchronized (object) {
    object.notify();
}
Inside a synchronized block.
Doesn't immediately release the lock; it notifies a waiting thread, which proceeds after the current thread releases the lock.
-----------------------
join() -> Current thread waits for another thread to complete before resuming.

t1.join();      // Current thread waits for t1 to finish
t1.join(500);   // Wait for t1 up to 500 milliseconds

Running ➔ Waiting or Timed Waiting



 */