package org.example.datastructures.recursion;

public class Print1toN {
    public void printN(int n) {
        if(n == 0) {
            return;
        }
        printN(n-1);
        System.out.print(n + " ");
    }
}
