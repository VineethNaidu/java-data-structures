package org.example.designpatterns.designpatterns.behavioral.state;

public class NoCardState implements ATMState {

    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You have successfully inserted your card.");
        atmMachine.setState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You haven't inserted a card yet.");
    }

    @Override
    public void enterPin(int pinEntered) {
        System.out.println("You haven't inserted a card yet.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("You haven't inserted a card yet.");
    }
}
