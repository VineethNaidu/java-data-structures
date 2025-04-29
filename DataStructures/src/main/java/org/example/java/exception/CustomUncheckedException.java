package org.example.java.exception;

class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class CustomUncheckedException {
    public static void login(String username) {
        if (username == null || username.isBlank()) {
            throw new InvalidUsernameException("Username cannot be empty!");
        }
        System.out.println("Logged in as " + username);
    }

    public static void main(String[] args) {
        login(""); // This will throw the exception
    }
}

