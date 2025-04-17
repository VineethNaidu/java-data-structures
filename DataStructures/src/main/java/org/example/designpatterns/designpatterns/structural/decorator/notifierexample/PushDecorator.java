package org.example.designpatterns.designpatterns.structural.decorator.notifierexample;


public class PushDecorator extends NotifierDecorator {
    public PushDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending PUSH Notification: " + message);
    }
}
