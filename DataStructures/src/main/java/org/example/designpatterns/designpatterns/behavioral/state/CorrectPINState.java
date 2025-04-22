package org.example.designpatterns.designpatterns.behavioral.state;

public class CorrectPINState implements ATMState {

    private ATMMachine atmMachine;

    public CorrectPINState(ATMMachine atmMachine) {
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
        System.out.println("You have entered the correct PIN.");
    }

    @Override
    public void requestCash(int amount) {
        if (amount <= atmMachine.getCash()) {
            System.out.println("Here is your cash.");
            atmMachine.setCash(atmMachine.getCash() - amount);
        } else {
            System.out.println("You don't have enough cash in the machine.");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }
}
