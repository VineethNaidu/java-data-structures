package org.example.datastructures.recursion;

public class Palindrome {
    public boolean palindrome(String str, int start, int end) {

        if(start < 0 || end > str.length() || start > end) {
            return false;
        }

        if(start >= end) {
           return true;
        }

        if(str.charAt(start) == str.charAt(end) && palindrome(str, ++start, --end)) {
            return true;
        }
        return false;
    }
}
