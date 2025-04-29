package org.example.java.methodreferences;


import java.util.Arrays;

public class MethodReference {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] str = {"Welcome", "Hello", "World"};
        Arrays.stream(str).forEach(MethodReference::print);
    }
}

/*
Definition:
    A method reference in Java is the shorthand syntax for a lambda expression that contains just one method call.
    Don't need to pass params during calling

    Syntax:
    ClassName::methodName
 */