package org.example.designpatterns.designpatterns.structural.adapter.studentexample;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent; // Adaptee Interface

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public int getAge() {
        return schoolStudent.getStudentAge();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }
}
