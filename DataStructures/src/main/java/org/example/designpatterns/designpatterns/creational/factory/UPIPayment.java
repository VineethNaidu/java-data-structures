package org.example.designpatterns.designpatterns.creational.factory;

public class UPIPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
