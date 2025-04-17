package org.example.designpatterns.designpatterns.structural.decorator.notifierexample;

public class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending EMAIL: " + message);
    }
}
