package org.example.java.objectclass;

public class MainClass {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle(10, 20);
        System.out.println("Bicycle1 Gear = " + b1.getGears());
        System.out.println("Bicycle1 Speed = " + b1.getSpeed());

        Bicycle b2 = new Bicycle(30, 40);
        System.out.println("Bicycle2 Gear = " + b2.getGears());
        System.out.println("Bicycle2 Gear = " + b2.getGears());

        System.out.println("Bicycle1 Gear after Bicycle2 created = " + b1.getGears());
        System.out.println("Bicycle1 Speed after Bicycle2 created = " + b1.getSpeed());
        System.out.println(b1 == b2);

        Bicycle b3 = new Bicycle();
        Bicycle b4 = new Bicycle();

        // noOfInstancesWithDefaultConstructor is protected due to it is accessing outside the class in the same package.
        System.out.println("Number Of Bicycles using class= " + Bicycle.noOfInstancesWithDefaultConstructor);

        System.out.println("Number Of Bicycles using instance method= " + b2.getId());
        System.out.println("Number Of Bicycles using static method= " + Bicycle.getNumberOfBicycles());

        System.out.println("static member can be access from object instance = " + b3.noOfInstancesWithDefaultConstructor);
        System.out.println("static method can be access from object instance= " + b3.getNumberOfBicycles());
        // above are not recommended to do.

        System.out.println("instance block variable = " + b3.myVar);
        System.out.println("static block variable = " + Bicycle.myVar1);
    }
}

/*
Not all combinations of instance and class variables and methods are allowed:

Instance methods can access instance variables and instance methods directly.
Instance methods can access class variables and class methods directly.
Class methods can access class variables and class methods directly.
Class methods cannot access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as there is no instance for this to refer to.
 */
