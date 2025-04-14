package org.example.designpatterns.designpatterns.creational.builder.goodcode;

// Builder Pattern provides a way to create complex objects step by step.
public class BuilderDesignPattern {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Vineeth", 27)
                .setAddress("Bangalore, India")
                .build();

        System.out.println(user1);
    }
}

/*
When to Use:
    1. An object has lots of optional fields.
    2. You want immutable objects.
    3. You want readable and clean object construction.
 */