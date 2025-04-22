package org.example.designpatterns.designpatterns.behavioral.state;

public class StateDesignPattern {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(10000);

        System.out.println("--- First transaction ---");
        atm.insertCard();
        atm.enterPin(1234);
        atm.requestCash(5000);

        System.out.println("--- Second transaction ---");
        atm.insertCard();
        atm.enterPin(1234);
        atm.requestCash(6000);
    }
}

/*
Definition:
    State design pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes.
    It encapsulates the object's state and its behavior based on that state.

Main Agenda:
    Instead of Using if-else or switch use State Pattern to delegate based on state specific classes.


 */
