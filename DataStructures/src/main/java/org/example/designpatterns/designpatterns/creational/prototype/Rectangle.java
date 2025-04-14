package org.example.designpatterns.designpatterns.creational.prototype;

public class Rectangle implements Prototype {

    private int height;
    private int width;
    private int length;

    public Rectangle(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(height, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
