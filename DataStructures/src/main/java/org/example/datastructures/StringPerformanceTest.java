package org.example.datastructures;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // String (Immutable)
        startTime = System.currentTimeMillis();
        String s = "Hello";
        for (int i = 0; i < 1000000; i++) {
            s += "!";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + "ms");

        // StringBuilder (Mutable & Fast)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append("!");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");

        // StringBuffer (Mutable & Thread-Safe)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 1000000; i++) {
            sbf.append("!");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ms");
    }
}
