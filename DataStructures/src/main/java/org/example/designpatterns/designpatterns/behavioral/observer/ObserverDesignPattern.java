package org.example.designpatterns.designpatterns.behavioral.observer;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileDisplay = new MobileDisplay("VINI");
        Observer smartHome = new SmartHomeSystem();

        weatherStation.addObserver(mobileDisplay);
        weatherStation.addObserver(smartHome);

        weatherStation.setTemperature(30.5f);
        weatherStation.setTemperature(25.7f);

        weatherStation.removeObserver(mobileDisplay);

        weatherStation.setTemperature(20.5f);

    }
}

/*
Definition:
    It defines one-to-many relationship between objects so that when one object changes state (subject), all its dependents (observers are notified and updated automatically).
    Ex: Event Driven Systems (YouTube Subscribers)

Characteristics:

1. Subject: It has a list of observers, and it can add or remove observers from the list. Maintains and notifies observers.
2. Observer: It has a reference to the subject, and it can update its state based on the subject's state.
3. Concrete Subject: It implements the Subject interface and maintains a list of observers. It can add and remove observers from the list.
4. Concrete Observer: It implements the Observer interface and updates its state based on the subject's state.
 */