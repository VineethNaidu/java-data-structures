package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.badcode;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza...";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
