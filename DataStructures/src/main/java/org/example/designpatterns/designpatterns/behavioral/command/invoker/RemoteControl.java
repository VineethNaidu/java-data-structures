package org.example.designpatterns.designpatterns.behavioral.command.invoker;

import org.example.designpatterns.designpatterns.behavioral.command.command.Command;

// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
