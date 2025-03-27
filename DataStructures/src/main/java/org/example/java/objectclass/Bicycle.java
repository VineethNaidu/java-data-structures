package org.example.java.objectclass;

//A Class is a blueprint where individual Objects are created.
//Class can have State and Behaviours of an Object.
//An Object can have State and Behaviour represented in Class.

public class Bicycle {

    //state (always maintain as private, Other Classes can access private member by getters and setters)
    //instance variables
    private int gears;
    private int speed;
    private int cadence;
    private int id;

    //initializer blocks for instance variables
    {
        int instanceVaraible = 10;
        System.out.println("Instance Block is executed...!");
    }

    //alternate way of instance blocks
    int myVar = initializeInstanceVariable();

    protected final int initializeInstanceVariable() {
        return 0;
    }

    //class variables
    private static int noOfBicycles = 0;

    //static initialization
    protected static int noOfInstancesWithDefaultConstructor = 0;

    //static block
    static {
        int staticVaraible = 10;
        System.out.println("Static Block Executed...!");
    }

    //alternative of static blocks
    //calling static methods in same class
    public static int myVar1 = initializeClassVariable();
    public static int myVar2 = Bicycle.initializeClassVariable();

    private static int initializeClassVariable() {
       return 1;
    }

    //Default Constructor
    public Bicycle() {
        System.out.println("Default Constructor is executed...!");
        ++noOfInstancesWithDefaultConstructor;
    }

    // new method to return the ID instance variable
    public int getId() {
        return id;
    } //or else we can access with Bicycle.noOfBicycles;

    public static int getNumberOfBicycles() {
        return noOfBicycles;
    }

    public Bicycle(int noOfGears, int speedOfCycle) {
        this(noOfGears, speedOfCycle, 30);
        gears = noOfGears;
        speed = speedOfCycle;
        id = ++noOfBicycles;
    }
    // Bicycle b1 = new Bicycle(10, 20); -> b1.x? - 10 b1.y? - 20
    // Bicycle b2 = new Bicycle(30, 40); -> b2.x? - 30 b2/y? - 40 && b1.x? - 10 b1.y? - 20

    //Argument constructor
    public Bicycle(int gears, int speed, int cadence) {
        this.gears = gears;  // use this keyword if parameter and variable has same name.
        this.speed = speed;
        this.cadence = cadence;
    }

    public Bicycle currentObject() {
        return this; //returns current Object
    }
    //Bicycle b1 = new Bicycle();
    //Bicycle b2 = b1.currentObject();
    //b1 == b2 -> true

    public Bicycle newObject() {
        return new Bicycle(); //creates new object everytime
    }

    //Bicycle b1 = new Bicycle();
    //Bicycle b2 = b1.newObject();
    //b1 == b2 -> false

    public int getGears() {
        return gears;
    }

    //Behaviour Implementation
    public void setGear(int gear) {
        this.gears = gear;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public int applyBreak(int reduceSpeed) {
        this.speed -= reduceSpeed;
        return speed;
    }

    public int speedUp(int increaseSpeed) {
        this.speed += increaseSpeed;
        return speed;
    }

}
