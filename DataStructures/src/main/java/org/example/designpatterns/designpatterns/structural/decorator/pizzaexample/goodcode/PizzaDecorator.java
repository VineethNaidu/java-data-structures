package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode;

public abstract class PizzaDecorator extends PlainPizza {

    protected Pizza decoratePizza;

    public PizzaDecorator(Pizza decoratePizza) {
        this.decoratePizza = decoratePizza;
    }

    public String getDescription() {
        return decoratePizza.getDescription();
    }

    public double getPrice() {
        return decoratePizza.getPrice();
    }
}
