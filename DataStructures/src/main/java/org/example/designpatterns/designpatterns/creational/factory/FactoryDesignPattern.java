package org.example.designpatterns.designpatterns.creational.factory;

// Factory Design Pattern is a creational DP that provides an Interface to create Objects of superclass,
// But, lets subclasses decide which class to instantiate.


//You tell the factory what you want — it decides what to give you.

/* Interface (common methods) -> Factory (Decides which Object to create) ->
         -> Concrete Class (Actual Implementation) -> Client ( Uses the Object )
*/

public class FactoryDesignPattern {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway("UPI");
        paymentGateway.pay(100.0);

        paymentGateway = PaymentGatewayFactory.getPaymentGateway("CREDIT_CARD");
        paymentGateway.pay(200.0);

        paymentGateway = PaymentGatewayFactory.getPaymentGateway("CASH");
        paymentGateway.pay(300.0);

        paymentGateway = PaymentGatewayFactory.getPaymentGateway("INVALID");
        paymentGateway.pay(400.0);

    }
}

/*
1. When to Use It
    When object creation logic is complex.
    When the code needs to be decoupled from specific class instantiations.
    When you want to hide the instantiation logic from the client.


 */

