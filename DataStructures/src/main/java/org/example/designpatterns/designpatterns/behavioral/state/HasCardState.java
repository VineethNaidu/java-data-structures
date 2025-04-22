package org.example.designpatterns.designpatterns.behavioral.state;

public class HasCardState implements ATMState {
    private ATMMachine atmMachine;
    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("You can't insert a card as you already have one.");
    }
    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected.");
        atmMachine.setState(atmMachine.getNoCardState());
    }
    @Override
    public void enterPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("You have successfully entered the PIN.");
            atmMachine.setState(atmMachine.getCorrectPinState());
        } else {
            System.out.println("You have entered the wrong PIN.");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }
    @Override
    public void requestCash(int amount) {
        System.out.println("Please enter your PIN.");
    }
}
