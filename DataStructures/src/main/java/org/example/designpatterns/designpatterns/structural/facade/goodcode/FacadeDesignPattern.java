package org.example.designpatterns.designpatterns.structural.facade.goodcode;

import org.example.designpatterns.designpatterns.structural.facade.goodcode.facadesystem.HomeTheaterFacade;
import org.example.designpatterns.designpatterns.structural.facade.goodcode.subsystem.SubsystemClasses.*;

public class FacadeDesignPattern {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        Lights lights = new Lights();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv, dvd, projector, lights);

        homeTheaterFacade.watchMovie("Interstellar");
        homeTheaterFacade.stopMovie();
    }
}

/*
Def: Facade Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.
     It defines a higher-level interface that makes the subsystem easier to use.

Real World Example:
    1. You have a TV, DVD Player, Sound System, Lights, and Projector.
    2. Instead of turning everything on/off one by one, you use a remote (or single app) that does it all in one click.

    🟢 The remote is the Facade.
    🟢 The TV, DVD Player, Sound System, Lights, and Projector are the subsystems.

Where to Use:
    1.To simplify a complex subsystem.
    2. To decouple client code from a bunch of interdependent classes.
    3. To create a layered architecture (e.g., API → Service → DAO).

// More Examples:
Example	Facade	Subsystems
Hotel Booking App	BookingFacade	FlightService, HotelService, PaymentService
Spring Framework	JdbcTemplate	Connection, Statement, ResultSet
Web Browsers	Browser GUI	Networking, Rendering Engine, JS Engine
IDE (IntelliJ, Eclipse)	IDE GUI	Compiler, Debugger, Build Tool, Formatter

 */