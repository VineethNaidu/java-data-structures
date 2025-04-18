package org.example.designpatterns.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class CarFactory {
    private static Map<String, CarType> carTypes = new HashMap<>();

    public static CarType getCarType(String brand, String model, String color) {
        String key = brand + "-" + model + "-" + color;
        if (!carTypes.containsKey(key)) {
            carTypes.put(key, new CarType(brand, model, color));
            System.out.println("Created new CarType: " + key);
        }
        return carTypes.get(key);
    }
}

