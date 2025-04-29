package org.example.java.exception;

public class BuiltInException {
    public static void main(String[] args) throws ArithmeticException, NullPointerException { // Defines what type of exceptions that method can throw.
        int a = 10;
        final int b = 0;
        System.gc(); // invoke garbage collector

        try {
            int c = a / b;

            if(b <= 0) { // explicitly throwing exception
                throw new ArithmeticException("Cannot divide by zero.");
            }

            System.out.println("Result: " + c);
            System.out.println("Exception Thrown.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception." + e.getMessage());
        } catch (Throwable throwable) { // parent of all exception and Error
            System.out.println("Error: " + throwable.getMessage());
        }

        // finally block is always executed. mostly preferred for clean up operations.
        finally {
            System.out.println("program executes without termination.");
        }

        // final, finally, finalize
        // final - immutability
        // finally - cleanup (executes whether exception is thrown or not.)
        // finalize - garbage collection

        // throw, throws, throwable
        // throw - used for manually throwing exception
        // throws - used in method signature for declaring exception to throw.
        // throwable - parent of all exception

        // This line will executes whether exception is thrown or not.
        System.out.println("Program ends.");
    }

    // finalize method is deprecated in java since java 9
//    @Override protected void finalize()
//    {
//        System.out.println("Called the finalize() method");
//    }
}

/*
Definition:
    An exception is an error that occurs during the execution of a program.
    It is a runtime error that can be handled or ignored.

Ex:
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally{
    // cleanup code
}

Hierarchy:

Object -> Throwable
                   -> Exception -> Checked Exception (IO/Compile Time Exception)
                                -> UnChecked Exception (Runtime/Null Pointer Exception)
                       -> Error -> Virtual Machine Error
                                -> Assertion Error

Types of Exceptions:
1. User Defined Exceptions
2. Built-in Exceptions
    2.1 Checked Exceptions
    2.2 Unchecked Exceptions

    2.1 Checked Exceptions
        1. Class Not Found Exception
        2. Interrupted Exception
        3. IO Exception
        4. SQL Exception
        5. File Not Found Exception

    2.2 Unchecked Exceptions
        1. Arithmetic Exception
        2. Null Pointer Exception
        3. Array Index Out Of Bound Exception
        4. Class Cast Exception
        5. Array Store Exception



 */