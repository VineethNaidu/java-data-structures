package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode;

public class VegPizza extends PizzaDecorator {

    public VegPizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return decoratePizza.getDescription() + ", Veg";
    }

    public double getPrice() {
        return decoratePizza.getPrice() + 3.0;
    }
}
