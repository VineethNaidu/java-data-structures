package org.example.designpatterns.designpatterns.behavioral.command.concretecommand;

import org.example.designpatterns.designpatterns.behavioral.command.concretereceiver.Stereo;
import org.example.designpatterns.designpatterns.behavioral.command.command.Command;

// Concrete Command
public class AdjustVolumeCommand implements Command {
    private Stereo stereo;
    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.adjustVolume();
    }
}
