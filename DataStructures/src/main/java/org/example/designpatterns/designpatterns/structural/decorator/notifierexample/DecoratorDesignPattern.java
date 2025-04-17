package org.example.designpatterns.designpatterns.structural.decorator.notifierexample;

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        // 1. Send only email notification
        Notifier emailNotifier = new EmailDecorator(new BaseNotifier());
        emailNotifier.send("Welcome to Decorator Pattern!");

        System.out.println("-----");

        // 2. Send email + SMS
        Notifier emailSMSNotifier = new SMSDecorator(new EmailDecorator(new BaseNotifier()));
        emailSMSNotifier.send("Your OTP is 123456");

        System.out.println("-----");

        // 3. Send email + SMS + push
        Notifier allNotifier = new PushDecorator(new SMSDecorator(new EmailDecorator(new BaseNotifier())));
        allNotifier.send("Your booking is confirmed!");
    }
}

/*
The Decorator Pattern attaches additional responsibilities to an object dynamically.

 */