package org.example.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionClass { // Renamed class to avoid conflict
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>(); // Using Collection as reference type

        strings.add("one");
        strings.add("two");
        strings.add("three");
        System.out.println("strings = " + strings);

        strings.remove("one");
        System.out.println("strings = " + strings);

        if (strings.contains("one")) {
            System.out.println("one is here");
        }
        if (!strings.contains("three")) {
            System.out.println("three is not here");
        }

        //Methods in Collection
        /*
            containsAll(): defines the inclusion
            addAll(): defines the union
            removeAll(): defines the complement
            retainAll(): defines the intersection.
         */

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        second.add("one");
        second.add("four");

        //ContainsAll
        System.out.println("Is first contained in strings? " + strings.containsAll(first));
        System.out.println("Is second contained in strings? " + strings.containsAll(second));

        //AddAll
        boolean hasChanged = strings.addAll(first);

        System.out.println("Add All " + hasChanged);
        System.out.println("strings = " + strings);

        //RemoveAll
        hasChanged = strings.removeAll(second);
        System.out.println("Remove All " + hasChanged);
        System.out.println("strings = " + strings);

        //RetainAll
        hasChanged = strings.retainAll(first);
        System.out.println("Retain All " + hasChanged);
        System.out.println("strings = " + strings);

        //isEmpty()
        if(!strings.isEmpty()) {
            System.out.println("strings = " + strings);
        }

        String[] string = strings.toArray(new String[]{});
//        String[] tabString2 = strings.toArray(new String[2]);   // or an array of the right size
        System.out.println(Arrays.toString(string));

        //toArray()
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //clear()
        strings.clear();
        System.out.println("strings = " + strings);

        //size()
        System.out.println("strings size = " + strings.size());


    }
}
