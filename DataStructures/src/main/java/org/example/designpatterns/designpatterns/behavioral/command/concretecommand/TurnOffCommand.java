package org.example.designpatterns.designpatterns.behavioral.command.concretecommand;

import org.example.designpatterns.designpatterns.behavioral.command.receiver.Device;
import org.example.designpatterns.designpatterns.behavioral.command.command.Command;

// Concrete Command
public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        System.out.println("TV is turned off");
    }
}
