package org.example.designpatterns.designpatterns.behavioral.command.concretecommand;

import org.example.designpatterns.designpatterns.behavioral.command.receiver.Device;
import org.example.designpatterns.designpatterns.behavioral.command.command.Command;

// Concrete Command
public class TurnOnCommand implements Command {

    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        System.out.println("TV is turned on");
    }
}
