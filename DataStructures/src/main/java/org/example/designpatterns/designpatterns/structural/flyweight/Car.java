package org.example.designpatterns.designpatterns.structural.flyweight;

// Context (Object with Extrinsic State)

class Car {
    private int x, y;
    private CarType type;

    public Car(int x, int y, CarType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        type.display(x, y);
    }
}
