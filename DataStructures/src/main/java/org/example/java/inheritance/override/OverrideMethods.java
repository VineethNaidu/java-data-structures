package org.example.java.inheritance.override;

public class OverrideMethods {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.staticMethod(); // Cat Static Method
        cat.instanceMethod(); // Cat Instance Method

        Animal animal = new Cat();
        //** Java Allows Static methods/variables can be called through instance Objects. But not recommended. (Classname.method/varaible name)
        Animal.staticMethod(); // Animal Static Method (Static methods do not follow runtime polymorphism, It follows compile time polymorphism)
        animal.instanceMethod(); // Cat Instance Method

        Animal animal1 = new Animal();
        Animal.staticMethod(); // Animal Static Method
        animal1.instanceMethod(); // Animal Instance Method
    }
}
