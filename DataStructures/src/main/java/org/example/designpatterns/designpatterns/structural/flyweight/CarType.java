package org.example.designpatterns.designpatterns.structural.flyweight;

// Flyweight (Shared Object)
class CarType {
    private String brand;
    private String model;
    private String color;

    public CarType(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void display(int x, int y) {
        System.out.println("Car [Brand=" + brand + ", Model=" + model + ", Color=" + color +
                "] at (" + x + "," + y + ")");
    }
}

