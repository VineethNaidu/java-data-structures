package org.example.designpatterns.designpatterns.structural.bridge;

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new RemoteControl(tv);

        tvRemote.togglePower();   // Turn ON
        tvRemote.volumeUp();      // Increase volume
        tvRemote.volumeDown();    // Decrease volume

        System.out.println();

        Device radio = new Radio();
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);

        radioRemote.togglePower(); // Turn ON
        radioRemote.volumeUp();
        radioRemote.mute();        // Mute
    }
}

/*
Def: Bridge DP is a structural DP that lets u split a large class or set of closely related classes
into two separate hierarchies — abstraction and implementation. - Which can be developed independently.

Eg: Remote Control and Devices
    1. A Remote Control (interface to control something)
    2. Multiple devices like TV, Radio, Projector, etc.

    Note: The bridge is the abstraction (Remote) connected to implementation (Device) via composition, not inheritance.

When to Use:
    1. When you want to separate the abstraction from its implementation.
    2. When you want to avoid a class from changing its behavior based on its implementation.
    3. When multiple implementations can change independently (e.g. UI themes + platforms).

 */
