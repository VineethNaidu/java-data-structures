package org.example.designpatterns.designpatterns.structural.adapter.studentexample;

public class CollegeStudent implements Student {
    String name;
    int age;
    String email;

    public CollegeStudent(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
