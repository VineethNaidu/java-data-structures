package org.example.designpatterns.designpatterns.structural.bridge;

// Interface - Implementer - Device
public interface Device {
    void turnOn();
    void turnOff();
    boolean isEnabled();
    void setVolume(int volume);
    int getVolume();
}
