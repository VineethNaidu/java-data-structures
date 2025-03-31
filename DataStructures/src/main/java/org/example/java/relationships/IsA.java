package org.example.java.relationships;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Is A using Extends
class Dog extends Animal {  // ✅ Dog IS-A Animal
    void bark() {
        System.out.println("Dog barks.");
    }
}

// IS - A Using Interface
interface Vehicle {
    void drive();
}

class Car implements Vehicle {  // ✅ Car IS-A Vehicle
    public void drive() {
        System.out.println("Car is driving.");
    }
}

public class IsA {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();  // ✅ Inherited from Animal (IS-A relation)
        d.bark();

        Car car = new Car();
        car.drive(); // ✅ Inherited behavior
    }
}



