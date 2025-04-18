package org.example.designpatterns.designpatterns.behavioral.observer;

public class MobileDisplay implements Observer {
    private String user;

    public MobileDisplay(String user) {
        this.user = user;
    }

    @Override
    public void update(float temperature) {
        System.out.println("📱 " + user + " received temperature update: " + temperature + "°C");
    }
}

