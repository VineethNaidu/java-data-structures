package org.example.java.inheritance.override;

interface Fly {
    //Interface can't implement instance methods without (default/private).
    default public void instanceMethod() {
        System.out.println("Fly Instance Method");
        privateInstanceMethod();
    }

    private void privateInstanceMethod() {
        System.out.println("Fly's Private Instance Method");
    }
}

interface Wings extends Fly {
    default public void instanceMethod() {
        System.out.println("Wings Instance Method");
    }
}

public class Animal implements Fly {
    public static void staticMethod() {
        System.out.println("Animal Static Method");
    }

    public void instanceMethod() {
        System.out.println("Animal Instance Method");
    }
}

class Cat extends Animal implements Wings {

    //Superclass static method is hidden
    public static void staticMethod() {
        System.out.println("Cat Static Method");
    }

    //Superclass instance method is overridden
    public void instanceMethod() {
        super.instanceMethod();
        System.out.println("Cat Instance Method");
    }
}

/*
Section 1:
Instance Methods:
1. An Instance method in the subclass with same signature(name, no of params and its types, and return type of method),
   is called Method Overriding.
2. Use @Override annotation to specify that a method is intended to override a method in a superclass.
3. An Overriding method return subclass type as return type Which is same as parent overridden method's return type as Class Type.

Section 2:
Static Methods:
1. If a Subclass has a method with same signature as a method in its Superclass, then it hides the Superclass method..

Note:
    The distinguish between static and instance methods: (Invocation)
    1. The Overridden instance methods can be invoked from subclass object.
    2. The hidden static methods that can be invoked depends on where it is being invoked. (Superclass or Subclass)
    3. Note: Static methods in interfaces are never inherited.

Section 3:
Interface methods:
1. If a Subclass has a method with same signature as a method in its Interface, then it overrides the Interface method.
   (Instance methods are preferred over interface default methods).
2. Default methods and abstract methods in interfaces are inherited like instance methods.

*/