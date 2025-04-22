package org.example.designpatterns.designpatterns.behavioral.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pinEntered);
    void requestCash(int amount);
}
