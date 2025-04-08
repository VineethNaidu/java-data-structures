package org.example.designpatterns;

/*
Design Principles in Software Development
    Design Principles are guidelines that helpful for developers to write clean, scalable,
    efficient and maintainable code.

    Design Principles are:
        1. Single Responsibility Principle (SRP)
        2. Open/Closed Principle (OCP)
        3. Liskov Substitution Principle (LSP)
        4. Interface Segregation Principle (ISP)
        5. Dependency Injection (DI)
        6. Separation of Concerns (SoC)
        7. Don't Repeat Yourself (DRY)
        8. KISS (Keep It Simple, Stupid)
        9. YAGNI (You Ain’t Gonna Need It)
        10. Composition over Inheritance

        Solid Principles introduced by Robert C. Martin

1. Single Responsibility Principle (SRP)
    A class should have one, and only one, reason to change. It should have only one task to perform.
    Eg: 1. Send Email Notification
        2. Make Payment
        3. Store Data
        4. Generate Invoice / PDF

    Real-Time Example:
        Consider a User class that stores user data, validates input, and sends emails.
        This violates SRP because a single class is handling multiple responsibilities.
    ✅ Fix:
        Create separate classes:
        User (Stores user data)
        UserValidator (Validates input)
        EmailService (Handles emails)


2. Open/Closed Principle (OCP)
    Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
    Eg: 1. Add a new feature
        2. Modify an existing feature
        3. Remove a feature (if needed)

    Real-Time Example:
        1. Suppose we have a DiscountCalculator class that calculates discounts for regular and premium customers.
           If we introduce a new VIP customer, we would need to modify the existing class.

    ✅ Fix:
        Create a new interface (IDiscountCalculator) and extend it for different discount types.
        Instead of modifying the class, create an interface and extend behavior using subclasses (RegularDiscount, PremiumDiscount, VIPDiscount).

3. Liskov Substitution Principle (LSP)
    Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
    Eg: 1. Rectangle
        2. Square
        3. Circle

    Real-Time Example:
        1. Suppose we have a class Shape that defines common methods for shapes (area, perimeter, etc.).

    ✅ Fix:
        Create a new interface (IShape) and extend it for different shape types.
        Instead of modifying the class, create an interface and extend behavior using subclasses (Rectangle, Square, Circle).

4. Interface Segregation Principle (ISP)
    A client should not be forced to depend on methods it does not use.

    Real-Time Example:
        1. Imagine an interface RestaurantService with methods takeOrder(), processPayment(), and deliverFood().
        2. A cashier only processes payments and does not deliver food, but is forced to implement the unnecessary deliverFood() method.

    ✅ Fix:
        Split RestaurantService into smaller interfaces:
        OrderService (for waiters)
        PaymentService (for cashiers)
        DeliveryService (for delivery staff)

5. Dependency Injection (DI)
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

6. Separation of Concerns (SoC)
    Software modules should be responsible for a single concern.
    Eg: 1. User Authentication
        2. Payment Processing
        3. Email Notification

7. Don't Repeat Yourself (DRY)
    Code should be written in a way that avoids duplication. (Avoid creating duplicate functions, classes, or module)

    Eg: Suppose a web application has multiple pages, and each page has duplicate database query logic.
    Fix: Move the database query logic to a common utility class or service and reuse it.

8. KISS (Keep It Simple, Stupid)
    Code should be simple and easy-to-understand. Avoid over-engineering.

    Real-Time Example:
        A developer writes complex recursive logic to calculate a sum instead of using a simple for loop.

    ✅ Fix:
        Use a straightforward for loop to make the code readable and efficient.

9. YAGNI (You Ain’t Gonna Need It)
    Do not implement functionality unless it is necessary.

    Real-Time Example:
        A developer adds future-proofing code for a feature that may never be used, increasing complexity.

    ✅ Fix:
        Implement features only when they are needed.

10. Composition over Inheritance
    Prefer composition (has-a relationship) over inheritance (is-a relationship).

    Real-Time Example:
        Suppose Car extends Engine.
        If we change the engine type (e.g., from petrol to electric), the entire class hierarchy breaks.

    ✅ Fix:
        Instead of inheritance, use composition:
            1. Create a Car class that has an Engine instance as a field.
            2. If we change the engine type, we only need to modify the Car class.

            class Car {
                private Engine engine; // "Has-a" relationship
            }






 */