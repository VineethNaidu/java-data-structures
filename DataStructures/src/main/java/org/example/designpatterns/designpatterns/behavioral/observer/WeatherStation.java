package org.example.designpatterns.designpatterns.behavioral.observer;

import java.util.List;
import java.util.ArrayList;

// ConcreteSubject - WeatherStation
public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("WeatherStation: Temperature changed to " + temperature);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}

