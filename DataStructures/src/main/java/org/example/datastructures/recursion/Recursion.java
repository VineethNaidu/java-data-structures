package org.example.datastructures.recursion;

// A function call itself over and over again until it meets a base condition (Which helps to return from loop)
public class Recursion {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial" + fact.factorial(4));

        Fibonacci fib = new Fibonacci();
        System.out.println("Fibonacci Nth Element: " + fib.fibonacci(5));

        Print1toN print = new Print1toN();
        print.printN(5);

        Palindrome palindrome = new Palindrome();
        String str = "NAMAN";
        System.out.println("\nPalindrome check: " + palindrome.palindrome(str, 0, str.length()-1));
    }
}

/*
When to use:
1. If you know your input can be divided into smaller inputs. we can use recursions.
Use Cases:
1. DP uses Recursion
2. BackTracking
3. MergeSort/QuickSort
4. BT/Tries/Segment Trees/BST/Heaps

Note:
How to write Recursions:
1. Assumption: Fix on What your function can do (atomic behaviour)
2. Main Logic: Solving assumption using sub problems.
3. Base Condition: Input/Condition to terminate the recursion.

Pros:
1. Recursion can reduce Time Complexity better than iterations.
2. Recursion adds clarity and reduces code and debug.
3. Recursion is better at tree traversal.

Cons:
1. Recursion uses more memory. the memory allocation is greater than the iterative function.
2. Recursion can be slow. If you not implement correctly.
 */

