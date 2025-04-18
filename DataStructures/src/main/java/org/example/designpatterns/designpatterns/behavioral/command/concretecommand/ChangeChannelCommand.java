package org.example.designpatterns.designpatterns.behavioral.command.concretecommand;

import org.example.designpatterns.designpatterns.behavioral.command.concretereceiver.TV;
import org.example.designpatterns.designpatterns.behavioral.command.command.Command;

// Concrete Command
public class ChangeChannelCommand implements Command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
