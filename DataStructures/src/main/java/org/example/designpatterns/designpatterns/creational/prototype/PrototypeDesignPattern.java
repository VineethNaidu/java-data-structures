package org.example.designpatterns.designpatterns.creational.prototype;

/*
1. The Prototype Pattern is used when creating a new object is costly or complex, and you want to clone an existing object instead.
2. You clone an existing object instead of creating a new one from scratch.

When to use:
    1. Creating objects is expensive
    2. You want to avoid factory hierarchies
    3. You want to keep object templates
    4. You need many similar objects
 */
public class PrototypeDesignPattern {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, 30);
        Rectangle clone1 = (Rectangle) rectangle.clone();
        Rectangle clone2 = (Rectangle) rectangle.clone();
        System.out.println("Rectangle = " + rectangle.toString());
        System.out.println("Clone1 = " + clone1.toString());
        System.out.println("Clone2 = " + clone2.toString());
        System.out.println("Clone1 == Clone2 = " + (clone1 == clone2));
    }
}
