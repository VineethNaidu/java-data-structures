package org.example.designpatterns.designprinciples;

/*
The Interface Segregation Principle (ISP) states:
    Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.
    "A class should not be forced to implement interfaces it does not use."
    This means instead of one large interface, we should create multiple smaller, more specific interfaces to avoid unnecessary dependencies.
*/

/*
    Bad Example (Violates ISP)
    we have an interface Worker that includes multiple responsibilities (working and eating).

    // A large interface with unrelated responsibilities
    interface Worker {
        void work();
        void eat();
    }

    // Robot class implements Worker (but does not need eat method)
    class Robot implements Worker {
        public void work() {
            System.out.println("Robot is working.");
        }

        public void eat() {
            // A Robot doesn't eat, but it is forced to implement this!
            throw new UnsupportedOperationException("Robot cannot eat!");
        }
    }

    // Human class implements Worker correctly
    class Human implements Worker {
        public void work() {
            System.out.println("Human is working.");
        }

        public void eat() {
            System.out.println("Human is eating.");
        }
    }

    Problems with This Approach (Why It Violates ISP?)
        ❌ Unnecessary Implementation: The Robot is forced to implement eat(), which it doesn’t need.
        ❌ Breaks ISP: The interface has methods that not all implementing classes need.
        ❌ Future Issues: If we add another unrelated method (e.g., sleep()), both Robot and Human would have to implement it, even if one doesn’t need it.
 */

/*
    Good Example (Follows ISP)
    ✅ We split the interface into two smaller, more specific interfaces:
        Workable → for classes that can work
        Eatable → for classes that can eat
 */

// Separate interfaces for specific responsibilities
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// Robot implements only Workable
class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

// Human implements both Workable and Eatable
class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating.");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Workable robot = new Robot();
        robot.work(); // ✅ Works fine

        Workable human = new Human();
        human.work(); // ✅ Works fine

        Eatable humanEater = new Human();
        humanEater.eat(); // ✅ Only Humans can eat
    }
}

/*
Why This Follows ISP?
    ✅ No unnecessary methods: Robot does not have an unwanted eat() method.
    ✅ Flexible and Scalable: We can add more classes (Animal, Chef, etc.) without modifying existing ones.
    ✅ Better Code Design: Classes only implement what they actually need.
*/