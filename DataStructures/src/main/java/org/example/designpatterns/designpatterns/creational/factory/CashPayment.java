package org.example.designpatterns.designpatterns.creational.factory;

public class CashPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}
