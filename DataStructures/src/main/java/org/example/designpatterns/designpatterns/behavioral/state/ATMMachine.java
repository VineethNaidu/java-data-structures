package org.example.designpatterns.designpatterns.behavioral.state;

public class ATMMachine {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState correctPinState;
    private ATMState outOfCashState;

    private ATMState currentState;
    private int cash;

    public ATMMachine(int initialCash) {
        this.cash = initialCash;

        this.noCardState = new NoCardState(this);
        this.hasCardState = new HasCardState(this);
        this.correctPinState = new CorrectPINState(this);
        this.outOfCashState = new OutOfCashState();

        this.currentState = (cash > 0) ? noCardState : outOfCashState;
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getNoCardState() { return noCardState; }
    public ATMState getHasCardState() { return hasCardState; }
    public ATMState getCorrectPinState() { return correctPinState; }
    public ATMState getOutOfCashState() { return outOfCashState; }

    public int getCash() { return cash; }
    public void setCash(int cash) { this.cash = cash; }

    // Delegate to current state
    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void requestCash(int amount) {
        currentState.requestCash(amount);
    }
}
