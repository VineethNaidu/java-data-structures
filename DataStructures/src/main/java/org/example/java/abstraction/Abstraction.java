package org.example.java.abstraction;

// Hiding implementation details, showing only functionality.
// It tells us what an Object does rather than how it does.
public class Abstraction {
    public static void main(String[] args) {
       Puppy puppy = new Puppy("Brown", "Lion");
       puppy.color = "White";
       puppy.eat();
       puppy.move();
       puppy.bark();
       puppy.sleep();
       Animal.numberOfLegs = 5;
    }
}

/*
Abstract Class:
1. Declare an abstract class by using the abstract keyword.
2. It can have both abstract and non-abstract methods and fields
3. It can have both abstract and non-abstract static methods and fields.
4. It can have both abstract and non-abstract constructors.
5. It cannot be instantiated.


Abstract Method:
1. An abstract method is a method that is declared without an implementation.
2. It must be overridden by a subclass.
3. It cannot be called directly.
4. It must be declared inside an abstract class.

abstract class Animal {
    abstract void eat();
    abstract void move();
}


Interface:
1. Methods in interfaces that are not declared as default or static are abstract implicitly.

When to use Abstraction vs Interface:

Abstraction:
1. You want to share code among several closely related classes.
2. You expect that classes that extend your abstract class have many common methods or fields.
3. You want to declare non-static or non-final fields. This enables you to define methods that
   can access and modify the state of the object to which they belong.

Interface:
1. You expect that unrelated classes would implement your interface. Ex: (Map, List, Cloneable, Comparable) are implemented by many other classes.
2. You want to take advantage of multiple inheritance of type.




 */