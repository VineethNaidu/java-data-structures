package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.badcode;

public class CheeseOlivePizza extends CheesePizza {
    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Olive";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
}
