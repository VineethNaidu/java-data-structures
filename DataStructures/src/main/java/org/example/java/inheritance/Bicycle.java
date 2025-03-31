package org.example.java.inheritance;

/*
1. A class that is derived from another class is called a subclass. (Child, extended, derived) class
2. A class that is inherited from another class is called a superclass. (Parent, base) class.
3. Inheritance is the process of creating a new class from an existing class.
4. It allows you to reuse the code from the existing class and add new functionality to it.
5. It Promotes code reusability, hierarchical classification, and polymorphism.

6. Object is the Root Class for all Classes. (It is SuperClass for all Classes).
7. Every Class has Only One SuperClass Except Object.

Note:
1. A Subclass Inherits all the members (fields, methods and nested classes) from its Superclass.
2. Constructors are not members. So they are not inherited by the Subclass. But which can be invoked from Subclass.
*/

final class FinalClass {
    final void finalMethod() {
        //Final Classes/Methods cannot be inherited/Override.
    }
}

public class Bicycle {

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle() {
        System.out.println("Bicycle Default Constructor");
    }

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        System.out.println("Bicycle Parameter Constructor Called");
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}


/*
Access Modifiers in Inheritance
Modifier	Same Class	Same Package	Subclass (Other Package)	Outside Class
public	        ✅	        ✅	                ✅	                    ✅
protected	    ✅	        ✅	                ✅	                    ❌
default	        ✅	        ✅	                ❌	                    ❌
private	        ✅	        ❌	                ❌	                    ❌

 */




