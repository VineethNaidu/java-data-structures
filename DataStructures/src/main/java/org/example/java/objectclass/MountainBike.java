package org.example.java.objectclass;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike() {
        this(85, 6, 120, 1);
    }

    public MountainBike(int seatHeight, int gears, int speed, int cadence) {
        super(gears, speed, cadence); // This is correct
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

}
