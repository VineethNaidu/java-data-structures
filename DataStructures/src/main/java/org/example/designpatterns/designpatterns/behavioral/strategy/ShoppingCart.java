package org.example.designpatterns.designpatterns.behavioral.strategy;

// Context Class (Uses the Strategy Pattern)
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set");
        }
        paymentStrategy.pay(amount); // Use the strategy
    }
}
