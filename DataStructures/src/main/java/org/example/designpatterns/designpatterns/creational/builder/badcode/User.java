package org.example.designpatterns.designpatterns.creational.builder.badcode;

public class User {
    private String name;
    private int age;
    private String phone;
    private String address;

    public User(String name, int age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
}

/*
Issues:
    1. What if some fields are optional?
    2. You’ll end up with:
        2.1. Many constructors (telescoping)
        2.2. Ugly and unreadable constructor calls
 */
