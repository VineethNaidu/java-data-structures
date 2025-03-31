package org.example.java.abstraction;

interface AnimalInterface {
    void fly(); //Internally abstract
    abstract void bite();
}

// Abstract class may or not implement interface methods (fly, bite)
/*
Eg:
abstract class X implements Y {
    // implements all but one method of Y
}

class XX extends X {
    // implements the remaining method in Y
}
*/
public abstract class Animal implements AnimalInterface {
    //Instance Variables
    public String color;
    private String name;

    //Static variables
    public static int numberOfLegs;

    //Constant
    public static final String SPECIES = "MAMMALIAN";

    //Constructor
    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    //We can't implement abstract methods in abstract classes
    //abstract method
    public abstract void eat();
    public abstract void move();

    //Instance Method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    //Static methods don’t depend on objects, so they can be used in abstract classes.
    //Static Method
    public static void staticMethod() {
        numberOfLegs += 1;
        System.out.println("Animal Static Method");
    }

}

//abstract subclass may or may not implement abstract methods.
abstract class Dog extends Animal {

    public Dog(String color, String name) {
        super(color, name);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public Puppy(String color, String name) {
        super(color, name);
    }

    //A class should implement all abstract methods, otherwise it should declare as abstract.
    @Override
    public void eat() {
        System.out.println("Puppy Eats Dog Food");
    }

    @Override
    public void move() {
        System.out.println("Puppy can  walk and run");
    }

    @Override
    public void fly() {
        System.out.println("Puppy is not fly");
    }

    @Override
    public void bite() {
        System.out.println("Puppy won't bite");
    }

}
