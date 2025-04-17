package org.example.designpatterns.designpatterns.structural.decorator.pizzaexample.badcode;

public class Main {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription());
        System.out.println(plainPizza.getPrice());

        CheesePizza cheeseOlivePizza = new CheesePizza();
        System.out.println(cheeseOlivePizza.getDescription());
        System.out.println(cheeseOlivePizza.getPrice());
    }
}

/*
Here we are having a simple pizza which is extended to add toppings to it. here we are having 2 choices for each
toppings. i.e pick and not pick. A customer can ask for any combination of toppings so if we have N toppings, then
we need to have 2^N sub classes inherited from simplePizza.

This makes classes so big and causes explosion. To fix it we use Decorator Pattern
 */
