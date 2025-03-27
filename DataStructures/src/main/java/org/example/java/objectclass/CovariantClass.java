package org.example.java.objectclass;

/*
1. Before Java 5, overridden methods had to return the exact same type as the parent method.
   This was restrictive when dealing with inheritance.

2. A covariant return type allows a method in a subclass to return a more specific (subclass)
   type than the return type of the method in its superclass.
 */

public class CovariantClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.create().bark();

        new Animal().create().bark();

        Animal animal = new Dog();
        animal.create().bark();

//        Dog dog1 = new Animal(); throws an error subclass should not be reference of superclass.
    }
}

class Animal {

    Animal create() {
        return new Animal();
    }

    void bark() {
        System.out.println("Animal Barks");
    }
}

class Dog extends Animal{

    @Override
    Dog create() {
        return new Dog();
    }

    void bark() {
        System.out.println("Dog Barks Bow Boww!");
    }
}
