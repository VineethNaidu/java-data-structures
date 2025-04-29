package org.example.java.exception;

class MyException extends Exception {
    public MyException(String status, String message) {
        super(status + " " + message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            if (b == 0) {
                throw new MyException("500", "Cannot divide by zero.");
            }
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
/*
    User Defined Exception can be thrown by throw keyword

    Best Practices
    ✅ Give a meaningful name to your exception (e.g., InsufficientBalanceException)
    ✅ Always provide a constructor with a message
    ✅ Optionally, override toString() or add extra context if needed
    ✅ Use checked exceptions for recoverable conditions
    ✅ Use unchecked exceptions for programming errors
 */