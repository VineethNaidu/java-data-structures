package org.example.designpatterns.designprinciples;

/*
Liskov Substitution Principle (LSP)
    Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
    Eg: 1. Rectangle
        2. Square
        3. Circle

    Real-Time Example:
        1. Suppose we have a class Shape that defines common methods for shapes (area, perimeter, etc.).

    ✅ Fix:
        Create a new interface (IShape) and extend it for different shape types.
        Instead of modifying the class, create an interface and extend behavior using subclasses (Rectangle, Square, Circle).
*/

/*
    Bad Example (Violates LSP)
    Imagine we have a Rectangle class and a Square class that inherits from it.

    class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return width * height;
        }
    }

    // Square extends Rectangle (but breaks LSP)
    class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;  // Ensures it's always a square
        }

        @Override
        public void setHeight(int height) {
            this.height = height;
            this.width = height;  // Ensures it's always a square
        }
    }

    // Test the behavior
    public class Main {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.setWidth(4);
            rect.setHeight(5);
            System.out.println("Rectangle Area: " + rect.getArea());  // Expected: 20

            Rectangle square = new Square();
            square.setWidth(4);
            square.setHeight(5);
            System.out.println("Square Area: " + square.getArea());  // Unexpected result!
        }
    }
 */

// Interface for Shape
interface Shape {
    int getArea();
}

// Rectangle class implements Shape
class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

// Square class implements Shape separately
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rect.getArea());  // 20

        Shape square = new Square(4);
        System.out.println("Square Area: " + square.getArea());  // 16
    }
}

/*
Why This Follows LSP?
    ✅ Now, Square and Rectangle are independent and follow correct behavior.
    ✅ Both Rectangle and Square implement Shape, so they can be used interchangeably.
    ✅ No unexpected behavior when Square replaces Rectangle.

Key Takeaways
    Before: Square inherited from Rectangle but changed its expected behavior (violating LSP).
    After: Square and Rectangle implement Shape separately, ensuring correct behavior.
    Note: LSP ensures subclasses don’t break the expected behavior of the parent class.
 */
