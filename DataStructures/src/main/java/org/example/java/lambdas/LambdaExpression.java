package org.example.java.lambdas;

@FunctionalInterface // not required to tell this as functional interface. If Put it should follow's functional interface properties.
interface Runnable {
    //Only One Abstract Method
    public abstract void run();

    //Default and Static methods are Optional in FI
    default int add(int a, int b) {
        System.out.println("Sum: " + (a+b));
        return a+b;
    }

    static void sub(int a, int b) {
        System.out.println("Sub: " + (a-b));
    }
}

@FunctionalInterface
interface Consumer<T> {

    void accept(T t);

//    default Consumer<T> andThen(Consumer<? super T> after) {
//        // the body of this method has been removed
//    }
}


public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello Functional Interface");
        runnable.run();
    }
}

/*
1. Java8 Introduce Lambda Expressions
2. Previously, We use anonymous class. Lambda expressions replaces anonymous class use cases.
3. Understand 3 steps to write a Lambda Expression
    3.1 Identify the type of lambda exp you want to write
    3.2 Finding the right method to implement
    3.3 Implementing this method

3.1 Identify the type of lambda exp you want to write
    3.1.1 Everything is a type in Java, and this type known at compile time.
    3.1.2 So, it's always possible to find the type of lambda expression.
    3.1.3 It may be the type of a variable, of a field, of a method parameter, or the returned type of a method.
    3.1.4 Restriction on the type of lambda expression. it has to be functional interface.
    3.1.5 Functional Interface which has only one abstract method. It may have default or static methods that won't count.

3.2 Finding the right method to implement
    3.2.1 A lambda expression is the implementation of only abstract method
          in the functional interface.

          Eg:   public abstract void run();
                void accept(T t);

3.3 Implementing the Right Method with a Lambda Expression
    3.3.1. Implement the Abstract method
    3.3.2. lambda expression syntax
        3.2.1 (Block of parameters)
        3.2.2 (->)
        3.2.3 block of code (body of method)






 */