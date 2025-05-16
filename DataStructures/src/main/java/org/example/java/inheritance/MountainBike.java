package org.example.java.inheritance;

public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;
//  public int gear;  Override parent class field

    //1. If Parent Class has Default Constructor, Subclass Constructor doesn't need to call Parent Class Constructor. It'll call internally.
    //2. If Parent Class has Parameter Constructor but not default Constructor, Subclass Constructor must call Parent Class Parameter Constructor.

//    Uncomment this Line you can see Parents Default Constructor Output.
    public MountainBike() {
        System.out.println("Default MountainBike constructor");
    }

    // the MountainBike subclass has one constructor
    public MountainBike(int startCadence, int startSpeed,
                        int startGear, int startHeight) {
        super(startCadence, startSpeed, startGear); //comment this line along with Bicycle Default Constructor. Will see the error.
        seatHeight = startHeight;
        System.out.println("MountainBike Parameter Constructor Called");
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(1, 2, 3, 4);

        //Casting Objects
        //Parent Class reference type can hold Child Class Object
        Object object = new MountainBike(1, 2, 3, 4);
        Bicycle bicycle = new MountainBike(1, 2, 3, 4);

        //Child Class reference type can hold Parent Class Object
        Bicycle bicycle1 = new Bicycle();
        MountainBike mountainBike1 = new MountainBike();
//      MountainBike mountainBike1 = bicycle1; can't directly assign to parent class reference to Subclass reference type. throws compile time error.
//      MountainBike mountainBike1 = (MountainBike)bicycle1; //It'll throw runtime error. check instance if it is child class we can assign it to parent reference/

        //instanceOf prevents runtime exceptions by checking Object type
        if(bicycle1 instanceof MountainBike) {
            MountainBike mountainBike2 = (MountainBike)bicycle1;
        }

    }
}

/*
What you can do in Subclass:
1. You can call Parent Class Constructor.
2. You can call Parent Class Method.
3. You can call Parent Class Field.
4. You can override Parent Class Method.
5. You can override Parent Class Field.
6. You can add new Field.
7. You can add new Method.
8. You can add new Constructor.
9. You can add new Nested Class.
10. You can add new Inner Class.
11. You can add new Interface.
12. You can add new Abstract Method.
13. You can add new Static Method.
14. You can add new Static Field.
15. You can add override Static Method.
16. You can add override Static Field.
17. You can write a new instance method in the subclass that has the same signature
    as the one in the superclass, thus overriding it.

 */

/*
Note:
1*.   A subclass does not inherit the private members of its parent class. However, if the superclass
      has public or protected methods for accessing its private fields, these can also be used by the subclass.
2***. A nested class has access to all the private members of its enclosing class—both fields and methods.
      Therefore, a public or protected nested class inherited by a subclass has indirect access to all of the
      private members of the superclass.
 */

/* Multiple Inheritance

*/

/*
📌 Summary
Feature	            Description
Inheritance	        Allows a class to inherit properties from another class
Types	            Single, Multilevel, Hierarchical (Multiple via Interfaces)
Overriding	        Child class can redefine parent methods
super keyword	    Calls parent methods or constructor
final keyword	    Prevents overriding or inheritance
Access Modifiers	Control visibility in inheritance
 */
