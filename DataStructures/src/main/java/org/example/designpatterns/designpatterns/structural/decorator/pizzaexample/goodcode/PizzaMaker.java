package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.goodcode;

/*
1. Decorator Pattern allows you to add new behavior to an object dynamically.
2. You should use it when you want the capabilities of inheritance with subclass. But you need to add functionality at runtime.
3. More flexible than Inheritance.
4. Simplifies code becaz you added functionalities using many small classes.
 */

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " $" + plainPizza.getPrice());

        Pizza cheesePizza = new CheesePizza(new PlainPizza());
        System.out.println(cheesePizza.getDescription() + " $" + cheesePizza.getPrice());

        Pizza vegPizza = new VegPizza(new PlainPizza());
        System.out.println(vegPizza.getDescription() + " $" + vegPizza.getPrice());

        Pizza nonVegPizza = new NonVegPizza(new PlainPizza());
        System.out.println(nonVegPizza.getDescription() + " $" + nonVegPizza.getPrice());
    }
}
