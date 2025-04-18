package org.example.designpatterns.designpatterns.behavioral.command;

import org.example.designpatterns.designpatterns.behavioral.command.command.Command;
import org.example.designpatterns.designpatterns.behavioral.command.concretecommand.AdjustVolumeCommand;
import org.example.designpatterns.designpatterns.behavioral.command.concretecommand.ChangeChannelCommand;
import org.example.designpatterns.designpatterns.behavioral.command.concretecommand.TurnOffCommand;
import org.example.designpatterns.designpatterns.behavioral.command.concretecommand.TurnOnCommand;
import org.example.designpatterns.designpatterns.behavioral.command.concretereceiver.Stereo;
import org.example.designpatterns.designpatterns.behavioral.command.concretereceiver.TV;
import org.example.designpatterns.designpatterns.behavioral.command.invoker.RemoteControl;

public class CommandDesignPattern {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}

/*
Definition:
    Command design pattern is a behavioral design pattern that allows you to define a command object that encapsulates an action and its associated state.

Components:
    1. Command Interface: The interface that defines the behavior of the command.
    2. Concrete Command: The class that implements the command interface and encapsulates the action and its associated state.
       Eg: Turning on TV, Adjust Volume, etc.
    3. Invoker: The class that invokes the command object. (TV Remote)
    4. Receiver: The class that actually performs the action. (TV)
 */
