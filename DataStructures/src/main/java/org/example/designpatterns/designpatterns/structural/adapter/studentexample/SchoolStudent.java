package org.example.designpatterns.designpatterns.structural.adapter.studentexample;

// School Student not implements Student Interface.
public class SchoolStudent {
    String firstName;
    int studentAge;
    String emailAddress;

    public SchoolStudent(String firstName, int studentAge, String emailAddress) {
        this.firstName = firstName;
        this.studentAge = studentAge;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
