package org.example.designpatterns.designpatterns.structural.bridge;

// Concrete Implementer - TV, Radio.etc
public class TV implements Device {

    private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV turned off");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
