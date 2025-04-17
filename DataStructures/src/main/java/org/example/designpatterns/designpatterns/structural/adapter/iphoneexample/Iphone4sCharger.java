package org.example.designpatterns.designpatterns.structural.adapter.iphoneexample;

// Adaptee Class (Existing Class with Incompatible Interface)
public class Iphone4sCharger implements Charger {

    Iphone4sCharger() { }

    public void charge() {
        System.out.println("Charging with Iphone 4s");
    }
}
