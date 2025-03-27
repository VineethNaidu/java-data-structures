package org.example.java.enumclass;


interface MyInterface {
    void display(String color);
}

public enum EnumInterface implements MyInterface {
    COLOR, BRAND;

    public void display(String color) {
        System.out.println("Interface Output: " + color);
    }
}
