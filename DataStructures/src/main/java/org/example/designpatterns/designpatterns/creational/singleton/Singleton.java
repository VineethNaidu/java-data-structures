package org.example.designpatterns.designpatterns.creational.singleton;

/*
Def: Singleton Pattern ensures that a class has only one instance and provides
     a global point of access to it.

     Mostly we use for Application Configuration (DB connection, logging, cache etc...,)

     Eg: A Configuration Manager
            A logging class
            A Connection Pool
            A cache

+------------------+
|   Singleton      |
+------------------+
| - static instance|
| - private ctor   |
| + getInstance()  |
+------------------+

How to Implement:
1. Add a private static field to the class for storing the singleton instance.
2. Declare a public static creation method for getting the singleton instance.
3. Implement “lazy initialization” inside the static method. It should create a new object
   on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
4. Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
5. Go over the client code and replace all direct calls to the singleton’s constructor with calls
   to its static creation method.
 */

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
