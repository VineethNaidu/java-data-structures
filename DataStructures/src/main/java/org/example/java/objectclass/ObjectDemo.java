package org.example.java.objectclass;

public class ObjectDemo {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(point, 30, 40);
        Rectangle rectangle3 = new Rectangle(50, 60);
        Rectangle rectangle4 = new Rectangle(point);

        rectangle1.origin.x = 100;
        rectangle1.origin.y = 200;
        System.out.println("Rectangle1 Point X = " + rectangle1.origin.x );
        System.out.println("Rectangle1 Point Y = " + rectangle1.origin.y );

        rectangle1.origin = point;

        System.out.println("Rectangle1 Point X = " + rectangle1.origin.x );
        System.out.println("Rectangle1 Point Y = " + rectangle1.origin.y );


        System.out.println("Width of Rectangle2 = " + rectangle2.width);
        System.out.println("Height of Rectangle2 = " + rectangle2.height);
        System.out.println("Area of Rectangle2 = " + rectangle2.getArea());



    }
}

class Point {
    public int x = 0;
    public int y = 0;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    Point origin;

    Rectangle() {
        this.origin = new Point(0, 0);
    }

    Rectangle(Point p1, int x, int y) {
        this.origin = p1;
        this.width = x;
        this.height = y;
    }

    Rectangle(int x, int y) {
        this.origin = new Point(0, 0);
        this.width = x;
        this.height = y;
    }

    Rectangle(Point p1) {
        this.origin = p1;
    }

    public int getArea() {
        return width*height;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }
}

/*
Objects

Point originOne = new Point(23, 94);

Declaration: Point originOne;
Instantiation: The new keyword is a Java operator that creates the object in heap.
Initialization: Point(23, 94); initializes new Object

We can directly call a method -> int h = new Point().height;



Composition vs Inheritance

Eg:

public class Point {
    public int x = 0;
    public int y = 0;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Point {
    public int width = 0;
    public int height = 0;
    Point origin;

    //Error Code
    Rectangle() {
        this.origin = new Point(0, 0); // throws an error as there is no constructor
                                          is available.
    }

    //Correct Code
    Rectangle() {
        super(0, 0);
        this.origin = new Point(0, 0);
    }

    Rectangle(Point p1, int x, int y) {
        this.origin = p1;
        this.width = x;
        this.height = y;
    }
}

❌ First Code (Error Occurred)
class Point {
    public int x = 0;
    public int y = 0;

    Point(int x, int y) {  // No default constructor
        this.x = x;
        this.y = y;
    }
}

Inheritance:
class Rectangle extends Point {  // Rectangle is inheriting Point
    public int width = 0;
    public int height = 0;
    Point origin;

    Rectangle() {
        this.origin = new Point(0, 0); // No issue here
    }
}
🔴 Why Does This Fail?
Rectangle inherits from Point (extends Point).

Java automatically inserts super(); at the beginning of Rectangle’s constructor.

Since Point does not have a no-argument constructor, the compiler throws an error.

==========================================================================================

✅ Second Code (Works Fine)
class Point {
    public int x = 0;
    public int y = 0;

    Point(int x, int y) {  // No default constructor
        this.x = x;
        this.y = y;
    }
}

Composition:
class Rectangle {  // 🚀 No Inheritance
    public int width = 0;
    public int height = 0;
    Point origin;

    Rectangle() {
        this.origin = new Point(0, 0);  // No need to call super()
    }
}
🟢 Why Does This Work?
Rectangle does not inherit from Point.

Rectangle is just using Point as an instance variable (origin).

The Point constructor is explicitly called inside Rectangle, not inherited.

No implicit super(); call is required because Rectangle is not a subclass of Point.

🤔 Key Concept You Might Be Missing:
1️⃣ Implicit super(); Call in Inheritance
    1.1 In Java, every constructor must call its superclass constructor.
    1.2 If a class extends another class and doesn’t explicitly call super(...),
        Java implicitly calls super(); (no-arg constructor).
    1.3 If the superclass has no no-arg constructor, the compiler throws an error.

2️⃣ Composition vs. Inheritance
    2.1 Inheritance (extends) -	Subclass inherits fields and methods from superclass.
        Superclass constructor must be called.
    2.2 Composition (Instance Variable) - One class contains an instance of another class as a
        field. No need to call superclass constructors.

3️⃣ When to Use Composition vs. Inheritance
    3.1 Use Inheritance (extends) when Rectangle is a specialized version of Point
        (which it is not in this case).
    3.2 Use Composition (instance variable Point origin) when Rectangle has a Point,
        which makes more sense (a rectangle has an origin).



 */
