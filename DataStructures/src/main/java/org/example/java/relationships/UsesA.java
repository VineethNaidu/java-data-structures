package org.example.java.relationships;


//  Uses-A Relationship (Dependency)
//  1.One class uses another class temporarily.
//  2.Used inside a method (not as a field).
//  3.Implemented via method parameters.

class Car2 {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class Driver {
    void driveCar(Car2 car2) {  // ✅ Uses-A Relationship (Car passed as a parameter)
        car2.drive();
    }
}

public class UsesA {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        Driver driver = new Driver();
        driver.driveCar(myCar);
    }
}

// A Driver uses a Car, but does not own it (Uses-A relationship).


