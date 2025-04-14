package org.example.designpatterns.designpatterns.creational.factory;

public class PaymentGatewayFactory {
    public static PaymentGateway getPaymentGateway(String paymentMethod) {
        if (paymentMethod.equals("CASH")) {
            return new CashPayment();
        } else if (paymentMethod.equals("UPI")) {
            return new UPIPayment();
        } else if (paymentMethod.equals("CREDIT_CARD")) {
            return new CreditCardPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
