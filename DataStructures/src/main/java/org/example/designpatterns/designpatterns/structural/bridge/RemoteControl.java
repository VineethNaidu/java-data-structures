package org.example.designpatterns.designpatterns.structural.bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
            if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 10);
    }

    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 10);
    }
}

