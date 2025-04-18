package org.example.designpatterns.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

// Client
public class FlyWeightDesignPattern {
    public static void main(String[] args) {
        List<Car> parkingLot = new ArrayList<>();

        parkingLot.add(new Car(10, 20, CarFactory.getCarType("Toyota", "Corolla", "White")));
        parkingLot.add(new Car(15, 25, CarFactory.getCarType("Toyota", "Corolla", "White")));
        parkingLot.add(new Car(30, 40, CarFactory.getCarType("BMW", "X5", "Black")));
        parkingLot.add(new Car(35, 45, CarFactory.getCarType("BMW", "X5", "Black")));

        for (Car car : parkingLot) {
            car.display();
        }
    }
}

/*
FlyWeight DP is used to save memory in applications that create a large no of similar objects which share some immutable state.
Ex: Car Games, PUBG (Bullets, Cars, Weapons, etc.)
    1. Instead of creating a new object for each instance, the Flyweight pattern reuses existing ones wherever possible, sharing common parts between objects.
    2. The Flyweight pattern is a structural design pattern that lets you fit more objects into the available amount of memory.

How it works:
    1. The Flyweight pattern is a structural design pattern that lets you fit more objects
       into the available amount of memory.Shared vs. Unique Data: Objects are split into shared (intrinsic) data and unique (extrinsic) data. The shared data is stored in a central place and reused, while the unique data is kept separately.

Components of Flyweight Factory:

https://media.geeksforgeeks.org/wp-content/uploads/20241025174722819618/fly.jpg

1. Flyweight Interface:
        Defines the interface through which flyweight objects can receive and act on extrinsic state.
2. Concrete Flyweight Classes:
        Implement the Flyweight interface and hold the shared data (intrinsic state).
3. Flyweight Factory:
        Creates and manages the flyweight objects. It ensures that flyweight objects are shared and reused whenever possible.
4. Client:
        Uses the Flyweight Factory to create and use flyweight objects.
        Maintains or passes extrinsic state to flyweight objects when needed.
        Does not manage the lifecycle of flyweight objects directly but interacts with them via the factory.

How to Implement Flyweight DP:
    1. Identify Shared and Unique Data: Separate the shared data (intrinsic state) from the unique data (extrinsic state).
    2. Create a Flyweight Class: This class will hold the intrinsic (shared) data. All instances of this class represent objects with similar data.
    3. Build a Flyweight Factory: This factory class manages instances of the Flyweight objects. When a new object is needed, the factory checks if an object with the same shared data already exists. If it does, it reuses that object; if not, it creates a new one.
    4. Pass Unique Data as Needed: Pass the unique data (extrinsic state) to the flyweight objects when needed.
    5. Use Flyweights Instead of Creating New Objects: Instead of creating new objects directly, always request them through the factory. The factory will manage all shared instances and reuse them where possible.

When to Use Flyweight DP:
    1. When you have a large number of similar objects that can be reused.
    2. When you want to reduce memory usage by sharing common parts between objects.
    3. When you want to optimize performance by avoiding object creation overhead.
 */
