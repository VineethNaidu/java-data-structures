package org.example.java.record;

import java.util.List;
import java.util.Objects;

interface RecordInterface {
    void display(String color);
}

public record Record(String name, int age) implements RecordInterface {
    //Variables of Record
//  public int weight = 50; we can not declare instance variable in record
    public static int height = 25;

    //Compact Constructor of Record use for Validation of Data
    public Record {
        System.out.println("Constructor is called");
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    //custom methods:
    public double calculateBMI() {
        return 50.0*25.0;
    }

    //implementing interface:
    @Override
    public void display(String color) {
        System.out.println("Interface Output: " + color);
    }
} //Automatically generates Constructor, Getters, toString(), equals(), hashCode()

//Records inside Records
record Address(String city, String country) {
    //Compact Constructor
    public Address {
        if(city == null || country != "India") {
            throw new IllegalArgumentException("Address must be in India, City can't be Null");
        }
    }
}
record Person(String name, int age, Address address) {}

//Nested Records inside another Record
record Student(String name, int age, Address address) {
    record Address(String city, String country) {}
}

//Real world problems
record Product(String name, double price) {}
record Order(int orderId, List<Product> products) {}

//Conclusion:
//✅ Nested records help in structuring complex data models.
//✅ Records inside records are immutable and ensure data integrity.
//✅ Encapsulated records prevent unnecessary exposure.
//✅ Ideal for DTOs, API responses, and structured data handling.

class RecordClass {
    record NestedRecord(String name, int age) {};

    public static void main(String[] args) {
        Record record1 = new Record("John", 25);
        RecordClass.NestedRecord nestedRecord = new RecordClass.NestedRecord("Mike", 30);

        //Records inside Records
        Address address = new Address("Tirupati", "India");
        Person person = new Person("Vineeth", 25, address);
        System.out.println(person);

        //Nested Records inside another Record
        Student.Address address1 = new Student.Address("Hyderabad", "India");
        Student student = new Student("Vineeth", 25, address1);
        System.out.println(student);

        //Real world problems
        Product product = new Product("Laptop", 50000.0);
        Product product1 = new Product("Mobile", 20000.0);
        Order order = new Order(1, List.of(product, product1));
        System.out.println(order);

        //----------------------------------------------------------------------//

        System.out.println(record1);
        System.out.println(nestedRecord);
//      record.age = 30; can't update due to all fields are final

        // Auto Generated Methods, No need to manually override toString(), equals(), and hashCode().
        Record record2 = new Record("John", 25);
        System.out.println(record1.equals(record2));
        System.out.println(Objects.equals(record1.hashCode(), record2.hashCode()));
        System.out.println(record1.toString());

        System.out.println("Height: " + Record.height);
        System.out.println("BMI: " + record1.calculateBMI());
    }
}

/*
1. Java 16 introduced a new feature called records.
2. It is a very compact way to create a class that only contains fields and methods.
3. A record is a special type of class that is immutable by default.
   It is useful for storing data without requiring explicit method definitions.
4. Instead of writing boilerplate code like constructors, getters, toString(), equals(),
   and hashCode(), records automatically generate these methods.
5. Methods can be defined inside records, but fields remain immutable.

Section 1:
When to use Records?
✅ Best for immutable data containers
✅ DTOs (Data Transfer Objects)
✅ Read-only settings or configurations
✅ When you need equals() and hashCode() but don't want to write boilerplate code

🚫 Not for mutable objects
🚫 Not for objects requiring complex behavior

Section 2:
Record vs Class
Feature	                        Regular Class	                 Record
Mutability	                       Mutable	                    Immutable
Boilerplate Code	                High	                       Low
Getters	                          getName()	                       name()
Setters                              Yes	                        No
Constructors	                 Customizable	     Auto-generated (but can be overridden)
Inheritance	                         Yes	               No (only extends Record)
Implements Interfaces	             Yes,                           Yes

Section 3:
Limitations of Records
🚫 Cannot extend other classes (Records implicitly extend java.lang.Record).
🚫 Fields are implicitly final (No setters allowed).
🚫 Cannot have explicit instance variables (Only those defined in the header).
🚫 Constructors must initialize all fields (No default constructor).

record InvalidRecord {
    private String data; // ❌ ERROR: Fields must be declared in record header
}

Java Records in Real-World Applications:
API DTOs Response
record ApiResponse(int status, String message, Object data) {}

Database Entities (Immutable)
record User(String name, int age) {}

Product Catalog
record Product(String name, double price) {}

Section 4:
Conclusion
✔ Java records provide a concise way to create immutable data classes.
✔ They automatically generate constructors, toString(), equals(), and hashCode().
✔ Best suited for DTOs, data models, and immutable objects.
✔ Cannot be extended or modified, ensuring immutability.

💡 Use records to write cleaner, more maintainable code! 🚀
*/
