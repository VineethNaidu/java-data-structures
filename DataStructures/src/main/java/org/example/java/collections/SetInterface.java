package org.example.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //add elements
        set.add("Java");
        set.add("Ruby");
        set.add("C#");
        set.add("Java"); //Duplicate element not added into Set

        System.out.println(set);

        for(String s : set) {
            System.out.println(s + " ");
        }

        //Operations on Set Interface
        /*
        1. Intersection - Return Common Elements from Both Sets S1 & S2
        2. Union - Return all combined non-duplicate elements S1+S2
        3. Difference - Removes all elements from one set to other set S1-S2 -> S1
        */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        //Add List into Set
        set1.addAll(list1); // [1, 3, 2, 4, 8, 9, 0]
        set2.addAll(list2); // [1, 3, 7, 5, 4, 0]

        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);

        //Union
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of Sets: " + union);

        //Intersection
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of Sets: " + intersection);

        //Difference
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of sets: " + difference);

        // Various Operations on Sorted Set
        /*
        1. Adding elements
        2. Accessing elements
        3. Removing elements
        4. Iterating through Set
         */

        //Accessing Elements
        System.out.println(set1.contains(3)); //true

        //Remove Element
        System.out.println(set1.remove(10)); //false

        //Iterate through Set
        for(int ele : set1) {
            System.out.print(ele + " ");
        }
    }
}

/*
1. Set is an unordered Collection of Objects
2. Set allows duplicate values
3. No Specific Order Except(LinkedHashSet, TreeSet)
4. Allow Single null value
5. HashSet, LinkedHashSet, TreeSet implements Set Interface
6. for ThreadSafe Operation use Collection.SynchronizedSet();

 */