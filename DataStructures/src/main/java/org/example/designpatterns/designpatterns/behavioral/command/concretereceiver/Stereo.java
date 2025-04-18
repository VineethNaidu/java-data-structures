package org.example.designpatterns.designpatterns.behavioral.command.concretereceiver;

import org.example.designpatterns.designpatterns.behavioral.command.receiver.Device;

public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("Stereo is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is turned off.");
    }

    public void adjustVolume() {
        System.out.println("Stereo volume is adjusted.");
    }
}
