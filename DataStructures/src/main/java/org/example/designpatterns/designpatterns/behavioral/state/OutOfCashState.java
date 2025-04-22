package org.example.designpatterns.designpatterns.behavioral.state;

public class OutOfCashState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("The ATM is out of cash.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card is inserted.");
    }

    @Override
    public void enterPin(int pinEntered) {
        System.out.println("The ATM is out of cash.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("The ATM is out of cash.");
    }
}
