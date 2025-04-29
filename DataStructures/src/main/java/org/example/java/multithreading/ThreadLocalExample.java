package org.example.java.multithreading;

class UserContext {
    private String username;

    public UserContext(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class UserContextManager {
    private static ThreadLocal<UserContext> userContext = new ThreadLocal<>();

    public static void setUserContext(UserContext userContext) {
        UserContextManager.userContext.set(userContext);
    }
    public static UserContext getUserContext() {
        return userContext.get();
    }

    public static void clear() {
        userContext.remove(); // Important to prevent memory leaks
    }
}

class ApiRequestHandler implements Runnable {
    private String username;

    public ApiRequestHandler(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            // Set user context at beginning of request
            UserContextManager.setUserContext(new UserContext(username));

            // Now wherever you are in this thread, you can get the user!
            System.out.println(Thread.currentThread().getName() + " handling request for user: " +
                    UserContextManager.getUserContext().getUsername());

            // Simulate some API processing
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Always clear after request ends!
            UserContextManager.clear();
        }
    }
}

//User context per Request. Multiple users are hitting API simultaneously
public class ThreadLocalExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ApiRequestHandler("Vini"), "Thread-1");
        Thread t2 = new Thread(new ApiRequestHandler("Arjun"), "Thread-2");
        Thread t3 = new Thread(new ApiRequestHandler("Sneha"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
