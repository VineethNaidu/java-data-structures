package org.example.designpatterns.designpatterns.structural.facade.goodcode.subsystem;

public class SubsystemClasses {

    public static class TV {
        public void on() {
            System.out.println("TV is ON");
        }

        public void off() {
            System.out.println("TV is OFF");
        }
    }

    public static class DVDPlayer {
        public void insertDisc(String movie) {
            System.out.println("Inserted disc: " + movie);
        }

        public void play(String movie) {
            System.out.println("Playing movie..." + movie);
        }

        public void stop() {
            System.out.println("Stopped movie");
        }
    }

    public static class Lights {
        public void dim() {
            System.out.println("Lights dimmed");
        }

        public void on() {
            System.out.println("Lights ON");
        }
    }

    public static class Projector {
        public void on() {
            System.out.println("Projector ON");
        }

        public void setInput(String input) {
            System.out.println("Projector input set to " + input);
        }

        public void off() {
            System.out.println("Projector OFF");
        }
    }

}