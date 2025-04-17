package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.badcode;

import org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode.PlainPizza;

public class CheesePizza extends PlainPizza {
    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.00;
    }
}
