package org.example.designpatterns.designpatterns.structural.adapter.studentexample;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("John Doe", 20, "jdoe@me.com");
        SchoolStudent schoolStudent = new SchoolStudent("Mike Van", 15, "mike@me.com");

        studentList.add(collegeStudent);
        studentList.add(new SchoolStudentAdapter(schoolStudent));

        return studentList;
    }
}
