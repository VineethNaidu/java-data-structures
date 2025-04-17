package org.example.java.annotations;

public class Annotation {
}

/*
Annotation:
1. Annotations are metadata added to Java code. They do not directly affect the program logic,
   but they give instructions to the compiler, tools, or runtime.

2. Annotations are used to provide additional information about classes, methods, fields,

@AnnotationName
public class MyClass { ... }

Annotation	Purpose
@Override	Ensures method overrides superclass method
@Deprecated	Marks method/class as obsolete
@SuppressWarnings	Tells compiler to ignore warnings
@FunctionalInterface	Marks an interface with one abstract method
@SafeVarargs	Prevents unsafe varargs warnings
@Retention, @Target	Meta-annotations used when creating custom annotations

Custom Annotations:
1. We can create our own annotations by using the @interface keyword.
2. We can use the @Retention and @Target annotations to specify where the annotation is used.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation can be used on methods and is retained at runtime
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface LogExecutionTime {
    }

    public class MyService {

        @LogExecutionTime
        public void serve() {
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Service executed.");
        }

        public void doSomethingElse() {
            System.out.println("No annotation here.");
        }
    }


 */