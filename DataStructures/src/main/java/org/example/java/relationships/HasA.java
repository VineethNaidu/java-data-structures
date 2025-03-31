package org.example.java.relationships;

/*
HAS-A Relationship (Composition & Aggregation)
✔ "HAS-A" means a class contains another class as a field.
        ✔ Used for creating complex objects using smaller objects.
        ✔ Two types:

Composition (Strong Association)
Aggregation (Weak Association)
*/


/* Section 1:
    Composition (Strong HAS-A)
    ✔ Child object depends on the parent object.
    ✔ If the parent is destroyed, the child is also destroyed.
*/

import java.util.ArrayList;
import java.util.List;

class Engine {
    void start() {
        System.out.println("Engine starts.");
    }
}

class Car1 {
    private Engine engine = new Engine();  // ✅ Car HAS-A Engine

    void startCar() {
        engine.start();  // ✅ Using Engine's method
        System.out.println("Car is running.");
    }
}

// If Car is deleted, Engine is also deleted (Strong Dependency).


//Section 2:
//  Aggregation (Weak HAS-A)
//  Parent and child exist independently.
//  If the parent is deleted, the child object still exists.

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Library {
    private List<Book> books;  // ✅ Library HAS-A list of books

    Library(List<Book> books) {
        this.books = books;
    }

    void showBooks() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}

// Even if Library is deleted, Books remain.


public class HasA {
    public static void main(String[] args) {
        //HAS-A Composition
        Car1 car1 = new Car1();
        car1.startCar();

        //HAS-A Aggregation
        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Data Structures");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);

        Library library = new Library(bookList);
        library.showBooks();
    }
}
