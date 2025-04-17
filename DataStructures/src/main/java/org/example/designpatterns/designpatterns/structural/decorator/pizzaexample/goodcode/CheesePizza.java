package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode;

public class CheesePizza extends PizzaDecorator {

    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return decoratePizza.getDescription() + ", Cheese";
    }

    public double getPrice() {
        return decoratePizza.getPrice() + 2.0;
    }
}
