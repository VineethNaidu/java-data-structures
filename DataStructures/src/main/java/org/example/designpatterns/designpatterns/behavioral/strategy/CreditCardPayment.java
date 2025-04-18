package org.example.designpatterns.designpatterns.behavioral.strategy;

// Create Concrete Strategy Implementations
public class CreditCardPayment implements PaymentStrategy {

    private int cardNumber;

    public CreditCardPayment(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card" + cardNumber);
    }
}
