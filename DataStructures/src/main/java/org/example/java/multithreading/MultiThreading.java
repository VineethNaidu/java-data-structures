package org.example.java.multithreading;

//Multiple ways of create a Thread

// Extending Thread class
class MyClass extends Thread {
    public void run() {
        try {
            System.out.println("Thread: " + Thread.currentThread().getId() + " is running...");
        }
        catch(Exception e) {
            System.out.println("exception caught" + e);
        }
    }
}

// Implementing Runnable Interface
// Prefer Runnable when your class already extends another class.
class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Runnable Thread: " + Thread.currentThread().getId() + " is running...");
        }
        catch(Exception e) {
            System.out.println("exception caught" + e);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // Calling Thread Class
        for(int i=1; i<=8; i++) {
            MyClass thread = new MyClass();
//            thread.run(); // It won't create new Thread. Runs in Main Thread only. Thread.currentThread.getName()
            thread.start(); // start() → creates a new thread and calls run() internally.
        }
        // Calling Runnable Interface
        for(int i=1; i<=5; i++) {
            Thread runnableThread = new Thread(new MyRunnableClass());
            runnableThread.start();
        }

        // Using Lambda
        Thread t1 = new Thread(() -> System.out.println("Lambda thread running..."));
        t1.start();
    }
}

/*
Concepts to Cover Multi Threading:

Simultaneous Execution (true parallelism - Nano Seconds) : Multiple threads running truly in parallel on multi-core CPU. Eg:
Eg: |Task A| |Task B| |Task C| at the same time with mutli core CPU
Real Example: Two friends are talking and walking at the same time.

Concurrent Execution (Interleaved Execution - Micro Seconds): Single CPU switches context between threads quickly to simulate multitasking.
Eg: |Task A| |Task B| |Task A| |Task B| |Task A| Context with Single CPU
Real Example: One friend talks a bit → listens a bit → talks again → listens again.

Program: Application or Code that presents on ROM. (.exe, .class, .jar)
Process: Running instance of a program. -> (Double click an app to load on RAM)
Task: Unit of work that needs to be done on process. (Eg: Downloading a file, Processing a Payment)
Thread: A smallest unit of execution inside a process (lightweight, shares memory with other threads).	Loading images while app continues running.

Note:
One program can have multiple processes (if you open app twice).
One process can have multiple threads (doing tasks in parallel).
Threads inside the same process share memory → easier to communicate, but risky without synchronization.
Processes are isolated → safe, but communication is expensive (via IPC).

+---------------------+
|     Program         |   <-- (Stored code, e.g., WhatsApp app installed)
+---------------------+

            |
            |   (When you run it)
            v

+---------------------+
|     Process         |   <-- (Running instance of program)
|  +----------------+ |
|  |   Thread-1      |----> Task-1 (Sending message)
|  +----------------+ |
|  |   Thread-2      |----> Task-2 (Loading chats)
|  +----------------+ |
|  |   Thread-3      |----> Task-3 (Receiving notifications)
|  +----------------+ |
+---------------------+

Q1: Does each task run on each thread?
Sol: Usually Yes - one thread runs one task at a time.

Q2: Can a Task be divided among multiple Threads?
Sol: Yes — that's exactly what happens in parallel processing or multithreading.
     A large task (example: video processing, downloading big file)
     → can be split into subtasks (frames, chunks, parts) → and different threads can process them simultaneously.

     This is called Task Splitting or Parallelism.

Q3: What does a thread actually runs?
Sol: A thread executes code inside a method — usually inside the run() method of a Runnable or Callable.
     A thread runs instructions — it could be:
        A simple task (System.out.println("Hello"))
        A heavy task (uploading a file, sorting an array)
        A part of a big task (downloading 1 MB of a 10 MB file)
     Basically, a Thread is given some code to run (a method body / logic).

One Task One Thread:
Eg:
Runnable task = () -> System.out.println("Task is running by " + Thread.currentThread().getName());

Thread thread = new Thread(task);
thread.start();


Two Tasks One Thread:
Eg:
Runnable task1 = () -> System.out.println("Task 1 is running by " + Thread.currentThread().getName());
Runnable task2 = () -> System.out.println("Task 2 is running by " + Thread.currentThread().getName());

Thread thread = new Thread(task1);
thread.start();
thread = new Thread(task2);
thread.start();

Summary:

One Thread = One Task -> Simple Tasks
One Task Split into multiple tasks -> Complex/Heavy Tasks (Parallelism)
Thread Runs Code (Runnable/Callable) Interface
Thread Share Memory -> Inside the same process

======================================================================================================================

MultiThreading:
Definition:
    Multithreading means executing multiple threads simultaneously (or concurrently) within a single process.
Each thread runs an independent task but shares the same memory space.
Thread = lightweight subprocess.
Multithreading = doing many tasks together efficiently.

Why MultiThreading?
1. Better CPU Utilization
2. Faster Program Execution
3. Handle multiple tasks at once.
4. Useful for Gaming, Banking, web servers etc.

How Java Supports MultiThreading:
1. Java Provides built-in Thread class (java.lang.Thread)
2. Runnable interface -> writing threads
3. Executor framework -> Thread Management
4. Synchronization -> Thread Safety
5. Concurrent utilities -> (java.util.concurrent) package

Threads: Smallest unit of execution of Process(Task) inside cpu is Thread

Thread Life Cycle:
Set of states that goes through from creation to termination.

NEW --> RUNNABLE --> (Running by CPU) -->
      WAITING / TIMED_WAITING / BLOCKED (optional) -->
            RUNNABLE (back to ready)
                 --> TERMINATED


New: Thread is created, but not yet started. -> Thread thread = new Thread();
Runnable: Thread is ready to run. -> Thread is ready to run waiting in the thread scheduler to be picked by CPU time. = t.start();
Running: Running is inside runnable (When CPU selects a Runnable thread, it starts executing run()) -> Thread is running by CPU.
Waiting: Thread is waiting indefinitely for another thread’s action. -> join(), wait()
Timed_Waiting: Thread is waiting for a certain amount of time. -> sleep(1000), join(1000), Lock.tryLock(1000)
Blocked: Thread is blocked by other thread (wait(), notify(), notifyAll()). Eg: synchronized(obj) { ... } // if lock is not free, thread becomes BLOCKED
Terminated: Thread has completed execution, or crashed. After run completes, thread is terminated.

start() vs run():
start() → creates a new thread and calls run() internally.
run() is just a method call, doesn't start a new thread.

Daemon Thread: Low Priority Threads, that support by handling background tasks of main thread without interrupting main thread.




 */
