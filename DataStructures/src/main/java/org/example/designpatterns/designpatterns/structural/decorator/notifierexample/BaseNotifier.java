package org.example.designpatterns.designpatterns.structural.decorator.notifierexample;

public class BaseNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }

}
