package org.example.java.enumclass;

// Enums in Java are special classes that represent a fixed set of constants.
// They are commonly used for defining states, directions, days of the week, and other constant values.
// enum constants are implicitly public static final.
public enum Enum {
    // enum constants are listed here. without values
    // Basic Syntax:
    // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // with values -> If we uncomment above line it'll throw an error.
    // You cannot declare enum constants without values and then again with values.
    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"),
    FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

    private final String abbreviation;

    // Enum constructors are always private.
    // You cannot create an enum object manually.
     private Enum(String abbr) {
        this.abbreviation = abbr;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

}

/*
Precautions:
0. Enums provide a simple and safe way of representing a fixed set of constants while keeping
   most of the flexibilities of classes
1. Enums are constant. If it changed be careful with all files where it is used.
2. When changing enum constants, it is recommended to review all code using the enum.
3. It might be worth using configure if we have many instances.
   since listing lots of instances in same location

Built In Methods:
Method	        Description
name()	        Returns the name of the enum constant as a String.
ordinal()	    Returns the position (index) of the enum constant.
values()	    Returns an array of all enum constants.
valueOf(String)	Converts a string to an enum constant.

✅ 9️⃣ When to Use enum in Java
Use an enum when:
✅ You need a fixed set of constants (e.g., Days, Colors, Directions).
✅ You want to avoid magic numbers in your code.
✅ You need thread safety (for singletons).
✅ You need type safety (cannot assign undefined values).

✅ 🔥 Key Takeaways
✔ enum is a special class for defining constants.
✔ Enum constants are implicitly public static final.
✔ Enums can have fields, methods, and constructors.
✔ Enums can implement interfaces but cannot extend classes.
✔ Enums are serializable and singleton-safe.
✔ Enums work great with switch cases.

*/
