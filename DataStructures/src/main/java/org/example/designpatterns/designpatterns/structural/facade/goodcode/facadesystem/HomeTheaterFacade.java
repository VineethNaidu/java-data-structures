package org.example.designpatterns.designpatterns.structural.facade.goodcode.facadesystem;

import org.example.designpatterns.designpatterns.structural.facade.goodcode.subsystem.SubsystemClasses.*;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie..." + movie);
        lights.dim();
        tv.on();
        projector.on();
        projector.setInput("Interstellar");
        dvdPlayer.insertDisc(movie);
        dvdPlayer.play(movie);
    }

    public void stopMovie() {
        System.out.println("Stopping movie...");
        lights.on();
        tv.off();
        projector.off();
        dvdPlayer.stop();
        System.out.println("Movie Stopped...!");
    }
}
