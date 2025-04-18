package org.example.designpatterns.designpatterns.behavioral.observer;

public class SmartHomeSystem implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("SmartHome adjusts settings for new temperature: " + temperature + "°C");
    }
}
