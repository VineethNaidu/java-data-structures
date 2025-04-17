package org.example.designpatterns.designpatterns.structural.adapter.studentexample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudentList();
        System.out.println(studentList);
    }
}
