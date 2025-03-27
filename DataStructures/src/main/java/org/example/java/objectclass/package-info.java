package org.example.java.objectclass;

class ClassName {
    // field, constructor, and
    // method declarations
}

class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}

class MySuperClass {
    // field, constructor, and
    // method declarations
}

class StaticBlocks {
    static {
        // whatever code is needed for initialization goes here
    }

    //1. A class can have any number of static initialization blocks,
    // and they can appear anywhere in the class body. The runtime system guarantees that
    // static initialization blocks are called in the order that they appear in the source code.
}

//class Whatever {
//    public static varType myVar = initializeClassVariable();
//
//    private static varType initializeClassVariable() {
//
//        // initialization code goes here
//    }
//}

//Initialise instance members
//{
//    whatever code is needed for initialization goes here
//}



interface YourInterface {
    // field, constructor, and
    // method declarations
}

/*

Declarations:
PascalCase -> ClassNames
smallcase -> packagesnames
camelCase -> fieldNames & verbMethodNames (calculateSpeed)
             (use verb as convention for method name declaration)
CONSTANT_NAME -> PI_VALUE;
snake_case -> used in Ruby
kebab-case -> git repository name


Section 1:
1. Modifiers such as public, private, and a number of others that you will encounter later.
 (However, note that the private modifier can only be applied to Nested Classes.)
2. class name should be declared as PascalCase (MyClass)
3. class extends superclass and implements interfaces as CamelCase (MyClass extends MySuperClass implements YourInterface)
4. class can extend only one SuperClass and implements multiple interfaces separated by comma(,).
5. class body surrounded by {}.

Section 2:
Declare Member Variables
1. Member variables in a class—these are called fields.
2. Variables in a method or block of code—these are called local variables.
3. Variables in method declarations—these are called parameters.
 Eg: public int cadence;

Section 3:
Control Who has access to member variables
1. Public -> can access all classes across the project
2. Private -> can access only in the same class
3. Protected -> can access within the package

Section 4:
Method Declaration Signature:
access-modifier return-type method-name(parameters) {}

Eg:
public int speedUp(int increaseSpeed) {
    this.speed += increaseSpeed;
    return speed;
}

Section 5:
Overloading Methods:
Def: Java Supports Overloading Methods. Methods Which have same name
but different parameters are called Overloading Methods.

public class DataArtist {
    ...
    public void draw(String s) {
        ...
    }
    public void draw(int i) {
        ...
    }
    public void draw(double f) {
        ...
    }
    public void draw(int i, double f) {
        ...
    }
}

Note: 1. Cannot have same parameters and same return type for the same parameters.
      2. compiler does not consider return type when differentiating methods,
         so you cannot declare two methods with the same signature even if they have a different
         return type.

         public void draw(int i) {}
         public int draw(int i) {} // Compiler error.


Section 6:
Constructors:
Def: Constructors are used to initialize the Objects.
    new ClassName();

1️⃣ Features of Constructors
✔ Same name as the class.
✔ No return type (not even void).
✔ Called automatically when an object is created.
✔ Used for object initialization (assigning default or custom values).
✔ If no constructor is defined, Java provides a default constructor.

2️⃣ Types of Constructors
✔ Default Constructor
✔ Parameterized Constructor (overloading)
✔ Copy Constructor (Create a duplicate object from another object, not built in Java)
✔ Private Constructor - prevent creating multiple instance of a class.
                        Used in Singleton Pattern (ensures only one object is created).

Constructor Declaration Signature:
access-modifier class-name(parameters) {}

Eg: Default Constructor:
public Bicycle() {
    System.out.println("Default Constructor is executed...!");
}

Eg: Parameterized Constructor:
public Bicycle(int gears, int speed, int cadence) {
    this.gears = gears;
    this.speed = speed;
    this.cadence = cadence;
}

Eg: Copy Constructor:
public Bicycle(Bicycle bicycle) {
    this.gears = bicycle.gears;
    this.speed = bicycle.speed;
    this.cadence = bicycle.cadence;
}

Eg: Private Constructor:
class Singleton {
    private static Singleton instance;

    // Private Constructor
    private Singleton() {}

    // Static Method to Get the Single Instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);  // true (Both refer to the same object)
    }
}

Section 7:
this and super in constructors:
1. this(): call another constructor within the same class.
2. super(): when a subclass calls a constructor in the superclass.

Eg: this():
public Bicycle() {
    this(1, 2, 3); // calls the parameterized constructor
}

Eg: super():
public MountainBike(int seatHeight, int gears, int speed, int cadence) {
    super(gears, speed, cadence);
    this.seatHeight = seatHeight;
}

Section 8:
Constructor Execution Flow in Inheritance:
1. First, the constructor of the superclass is executed.
2. Then, the constructor of the subclass is executed.
3. If super() is not explicitly called,
   Java implicitly calls the default constructor of the parent class.

Eg:
class A {
    A() {
        System.out.println("A Constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}

Output:
A Constructor
B Constructor

Section 8:
Method and Constructor method calling:

object.getSpeed();
object.speedUp(increaseSpeed);

1. parameters declared in method/constructor invocation are called arguments.
2. parameters declared in method/constructor declaration are called parameters.
3. the type and order should be same in both declaration and invocation.

Section 9:
Covariant Return Types in Java

Def: A covariant return type allows a method in a subclass to return a more specific (subclass)
     type than the return type of the method in its superclass.

1.  Why do we need to covariant types?
    Before Java 5, overridden methods had to return the exact same type as the parent method.
    This was restrictive when dealing with inheritance.

    Before Java5
    Eg without covariant type:
    class Parent {
        Parent get() {
            return this;
        }
    }

    class Child extends Parent {
        // This is invalid before Java 5
        Child get() {  // ❌ ERROR: Return type must be 'Parent'
            return this;
        }
    }

2. Covariant Return Type (Introduced in Java 5)

    2.1 With covariant return types, an overridden method can return a subclass
    of the original return type.

    ✅ Correct Example With Covariant Return Type
    class Parent {
        Parent get() {  // Parent's method returns Parent
            return this;
        }
    }

    class Child extends Parent {
        @Override
        Child get() {  // ✅ Allowed: Returning a subclass of Parent
            return this;
        }

        void display() {
            System.out.println("Inside Child class");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child c = new Child();
            c.get().display();  // get() returns a Child object, so display() works
        }
    }

    Output: Inside Child class

Why This Works?

Child.get() returns Child, which is a subtype of Parent.
This allows direct access to Child-specific methods without type casting.






*/





