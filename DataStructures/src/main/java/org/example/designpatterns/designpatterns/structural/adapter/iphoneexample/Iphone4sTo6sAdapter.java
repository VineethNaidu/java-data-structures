package org.example.designpatterns.designpatterns.structural.adapter.iphoneexample;

// Adapter Class
/*
    1. The Adapter class implements the Target interface and internally uses an instance of the Adaptee class.
    2. It adapts the Adaptee’s interface to match the Target interface by
    delegating the calls appropriately. So here we will use an IPhone4s to IPhone6s
    adapter so that we can easily charge our IPhone6s .
 */
public class Iphone4sTo6sAdapter implements Charger {
    private Iphone4sCharger iphone4sCharger; // Instance of Adaptee Class

    public Iphone4sTo6sAdapter(Iphone4sCharger iphone4sCharger) {
        this.iphone4sCharger = iphone4sCharger;
    }

    @Override
    public void charge() {   // Adaptee Interface
        iphone4sCharger.charge();
    }
}
