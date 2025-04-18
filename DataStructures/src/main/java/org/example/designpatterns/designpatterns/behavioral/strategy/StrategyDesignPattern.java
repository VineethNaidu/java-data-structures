package org.example.designpatterns.designpatterns.behavioral.strategy;

public class  StrategyDesignPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Customer chooses Credit Card
        cart.setPaymentStrategy(new CreditCardPayment(1234-5678-9012-3456));
        cart.checkout(1500);

        // Later chooses UPI
        cart.setPaymentStrategy(new UPIPayment("vini@upi"));
        cart.checkout(600);

        // Chooses PayPal
        cart.setPaymentStrategy(new PayPalPayment("vini@example.com"));
        cart.checkout(300);
    }
}

/*
Definition:
    Strategy is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one with separate class, and make them interchangeable.
    It provides a way to change the behavior of an object at runtime, without modifying its concrete class.

Characteristics:
    1. Define a family of algorithms: Strategy pattern allows you to define a family of algorithms, encapsulate each one with separate class, and make them interchangeable (strategy).
    2. Encapsulate behavior: Each strategy encapsulates a specific behavior or algorithm, providing a clean and modular way to manage different variations or implementations.
    3. Enable Dynamic Behavior Switching: The pattern enables clients to switch between different strategies at runtime, allowing for flexible and dynamic behavior changes.
    4. Promotes Object Collaboration: The pattern encourages collaboration between a context object and strategy objects, where the context delegates the execution of a behavior to a strategy object.

Components:
    1. Context: The class that uses the strategy pattern. It has a reference to the strategy object and delegates the behavior to the strategy object.
    2. Strategy Interface: The interface that defines the behavior of the strategy. It encapsulates a specific algorithm or behavior.
    3. Concrete Strategies: Implementations of the strategy interface. Each concrete strategy encapsulates a specific behavior or algorithm.
    4. Client: The class that uses the strategy pattern. It creates a context object and sets the strategy object.

Communication Between the Components:
    1. Client to Context:
        1.1 The Client, which knows the requirements of the task, interacts with the Context to initiate the task execution.
        1.2 The Client selects an appropriate strategy based on the task requirements and provides it to the Context.
        1.3 The Client may configure the selected strategy before passing it to the Context if necessary.
    2. Context to Strategy:
        2.1 The Context delegates the task execution to the selected strategy.
        2.2 The Context may pass necessary data or parameters to the strategy if required.
    3. Strategy to Context:
        3.1 Once the strategy completes its execution, it may return a result or perform any necessary actions.
    4. Context to Client:
        4.1 The Context returns the result or performs any necessary actions to the Client.

 */