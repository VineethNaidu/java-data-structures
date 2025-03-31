package org.example.java.relationships;

/*
Association (One-to-One, One-to-Many, Many-to-Many, Many-to-One)
✔ Association represents how objects are related to each other.
✔ Can be between classes or objects.
*/


import java.util.List;

//One-to-One Association
//One object is related to one other object.
//Person HAS-A Passport
class Passport {
    String passportNumber;
    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

class Person {
    String name;
    Passport passport;  // ✅ One-to-One relationship

    Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
}


//One-to-Many Association
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class Teacher {
    String name;
    List<Student> students;  // ✅ One-to-Many relationship

    Teacher(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
}

//Many-to-Many Association
// Eg: Student HAS-A Multiple Courses, and a Course HAS-A Multiple Students
class Student1 { String name; }
class Course { String courseName; }
class Enrollment { Student student; Course course; }  // ✅ Many-to-Many


public class Association {
}

/*
Conclusion:
    ✔ IS-A is used for inheritance.
    ✔ HAS-A is used for object composition.
    ✔ Uses-A is used for temporary dependencies.
    ✔ Association is used for defining relationships between multiple objects.
*/