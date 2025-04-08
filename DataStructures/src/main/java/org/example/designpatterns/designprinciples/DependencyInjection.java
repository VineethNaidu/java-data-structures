package org.example.designpatterns.designprinciples;

/*

Dependency Injection (DI)
    1. Dependency injection is a design pattern that allows you to decouple the creation of objects and their dependencies.
    2. It helps in achieving loose coupling and makes the code more maintainable and testable.
    3. High-level modules should not depend on low-level modules. Both should depend on abstractions.

    Real-Time Example:
        1. Suppose a ShoppingCart class directly creates an instance of CreditCardPayment.
        2. If we want to add a PayPalPayment option, we have to modify the ShoppingCart class.

    ✅ Fix:
        Use dependency injection:
            1. Create a PaymentProcessor interface and implement CreditCardPayment and PayPalPayment.
            2. ShoppingCart should depend on PaymentProcessor instead of concrete classes.
*/

/*  Bad Example (Violates DIP)
    Here, ShoppingCart directly depends on a CreditCardPayment class, making it tightly coupled.
    If we want to add a new payment method like PayPal, we have to modify ShoppingCart.

    // Low-level module (Concrete implementation)
    class CreditCardPayment {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    // High-level module (Directly depends on low-level module)
    class ShoppingCart {
        private CreditCardPayment payment;

        public ShoppingCart() {
            this.payment = new CreditCardPayment();  // Tight coupling!
        }

        public void checkout(int amount) {
            payment.pay(amount);  // Direct dependency on CreditCardPayment
        }
    }

    // Main class
    public class DependencyInjection {
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            cart.checkout(500);
        }
    }
*/


interface PaymentMethod {
    void pay(int amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class ShoppingCart {
    private PaymentMethod paymentMethod; // Composition Over Inheritance

    public ShoppingCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount) {
        paymentMethod.pay(amount);
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new CreditCardPayment();
        ShoppingCart cart = new ShoppingCart(paymentMethod);
        cart.checkout(500);

        cart = new ShoppingCart(new PayPalPayment());
        cart.checkout(500);
    }
}

/*
Benefits of this Approach
    ✅ Loosely Coupled: ShoppingCart does not depend on concrete classes (CreditCardPayment, PayPalPayment).
    ✅ Easily Extendable: If we add BitcoinPayment, we don’t modify ShoppingCart.
    ✅ Follows Dependency Inversion Principle: The high-level module (ShoppingCart) depends
        on abstraction (PaymentMethod) instead of concrete implementations.
 */