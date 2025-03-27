package org.example.java.enumclass;

import java.util.Arrays;

public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Enum.MONDAY);
        System.out.println(Enum.values());

        Enum day = Enum.FRIDAY;
        if(day == Enum.FRIDAY) {
            System.out.println("Both Enums are equal!");
        }

        String week = switch(day) {
            case MONDAY -> "Week Just started";
            case TUESDAY -> "In the Middle of the week";
            case FRIDAY -> "End Of the Week";
            default ->
                    throw new AssertionError("Should not happen");
        };

        System.out.println("Week name: " + week);

        System.out.println("Enum Value: " + Enum.WEDNESDAY);
        System.out.println("Abbreviation: " + Enum.SATURDAY.getAbbreviation());
        System.out.println("Get Class: " + Enum.SATURDAY.getClass());
        System.out.println("Declaration Class: " + Enum.SATURDAY.getDeclaringClass());

        //special methods:
        System.out.println("Enum name: " + Enum.FRIDAY.name());
        System.out.println("Enum Ordinal (index): " + Enum.MONDAY.ordinal());

        Enum[] enums = Enum.values();
        Enum value = Enum.valueOf("THURSDAY");
        System.out.println("Enum Arrays: " + Arrays.toString(enums));
        System.out.println("Enum value: " + value);

        //EnumAbstraction
        System.out.println("Enum Abstract Addition: " + EnumAbstraction.ADD.apply(4, 5));
        System.out.println("Enum Abstract Subtraction: " + EnumAbstraction.SUBTRACT.apply(5, 4));

        //EnumInterface
        EnumInterface.COLOR.display("RED");
    }
}
