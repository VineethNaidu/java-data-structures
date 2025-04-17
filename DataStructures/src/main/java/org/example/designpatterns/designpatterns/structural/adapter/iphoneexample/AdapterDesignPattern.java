package org.example.designpatterns.designpatterns.structural.adapter.iphoneexample;

public class AdapterDesignPattern {
    public static void main(String[] args) {
        Iphone6s iphone6s = new Iphone6s(new Iphone4sTo6sAdapter(new Iphone4sCharger()));
        iphone6s.OnCharge();
    }
}

/*
Def: Adapter is a structural design pattern that allows objects with
     incompatible interfaces to collaborate with each other without modifying the source code.

     Eg: CAR to Rail Track
         Airplane to Runway
         Iphone Lightning to USB Type-C

Problem that can be solved by Adapter Pattern:
    1. How can classes with incompatible interfaces work together?
    2. How can a class be reused if it does not have an interface that a client requires?
    3. How can an alternative interface be provided for a class?

Components of Adapter Pattern:
    1. Target Interface - The interface that the client expects
    2. Adaptee - The class that needs to be adapted
    3. Adapter - The class that adapts the Adaptee to the Target Interface

Different Implementations of Adapter Pattern:
    1. Object Adapter - the Adapter class implements the Target interface and contains an instance of the Adaptee class. (Composition)
    2. Class Adapter -  the Adapter class extends both the Target interface and the Adaptee class. It inherits the behavior of the Adaptee and adapts it to match the Target interface. (Inheritance)


 */
