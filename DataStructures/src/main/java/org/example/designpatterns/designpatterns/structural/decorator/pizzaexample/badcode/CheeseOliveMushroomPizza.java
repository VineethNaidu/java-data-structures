package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.badcode;

public class CheeseOliveMushroomPizza extends CheeseOlivePizza{
    @Override
    public String getDescription() {
        return super.getDescription() + " Adding Mushroom";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.00;
    }
}
