package org.example.java.interfaces;

// An interface with only one abstract method is called a Functional Interface.
// Used in Lambda Expressions and Streams API.
@FunctionalInterface
interface FunInterface {
    int add(int a, int b); // ✅ Only one abstract method
}

interface Interface1 {
    void eat(); // Implicitly public and abstract
}

interface Interface2 {
    void move();
}

//Interface extends multiple interface with (,)
interface Interface3 extends Interface1, Interface2 {
    int MAX_PLAYERS = 4;  // ✅ Automatically public, static, and final

    //abstract methods
    public abstract void fly(); // Implicitly public and abstract

    //default methods
    //✔ If a class implements an interface with a default method, it gets that method automatically.
    //✔ Can override the default method if needed.
    default void defaultMethod() {
        System.out.println("Default Method can be called Automatically!");
        secureMethod();
    }

    //static methods
    //are also accessible via the interface itself not through objects
    static int noOfLegs() {
        return 4;
    }

    // can only be called inside default or static methods in the interface, not by implementing classes
    //Private Methods
    private void secureMethod() {
        System.out.println("Private Interface Method is called!");
    }

/*
     Interface won't have constructors
     public Interface3() {

     }
*/
}

public class Main implements Interface3 {

    public static void main(String[] args) {
        Main main = new Main();
        main.defaultMethod(); // we don't need to implement default methods here.
        FunInterface funInterface = (a, b) -> a + b;
        System.out.println(funInterface.add(3, 4));
    }

    @Override
    public void defaultMethod() { //Not necessary to implement
        System.out.println("SubClass Default Method. If you want call Interface method use super");
        Interface3.super.defaultMethod();
    }

    public void fly() {
        System.out.println("Dog can't fly");
    }

    public void eat() {
        System.out.println("Dog can eat Meat");
    }

    public void move() {
        System.out.println("Dog can walk");
    }
}


/*
An Interface in Java mostly used to achieve 100% of abstraction.

1. Interface is a blue-print of behaviour
2. Interface contains static constants and abstract methods.
3. Used to achieve multiple inheritance.
4. Define methods that another classes must implement.

 */
