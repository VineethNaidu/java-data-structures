package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode;

public class NonVegPizza extends PizzaDecorator {

    public NonVegPizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return decoratePizza.getDescription() + ", Non Veg";
    }

    public double getPrice() {
        return decoratePizza.getPrice() + 5.0;
    }
}
