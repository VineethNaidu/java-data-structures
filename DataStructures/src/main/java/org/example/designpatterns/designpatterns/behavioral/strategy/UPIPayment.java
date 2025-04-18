package org.example.designpatterns.designpatterns.behavioral.strategy;

// Create Concrete Strategy Implementations
public class UPIPayment implements PaymentStrategy {

    String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI " + upiId);
    }
}
