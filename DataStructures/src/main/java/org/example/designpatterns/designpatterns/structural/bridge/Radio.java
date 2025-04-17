package org.example.designpatterns.designpatterns.structural.bridge;

public class Radio implements Device {

    private boolean on = false;
    private int value = 20;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio turned on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio turned off");
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }

    @Override
    public int getVolume() {
        return value;
    }

}
