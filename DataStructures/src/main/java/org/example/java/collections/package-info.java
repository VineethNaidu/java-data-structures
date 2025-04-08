package org.example.java.collections;

/*
Collections: Collections are about storing objects and iterating over them.

Section 1: Introduction
1. The Collections Framework is an implementation of the concepts on how to store, organize,
   and access data in memory.
2. Collections Framework was first introduced in Java SE 2, in 1998.
3. The Collections Framework is a set of interfaces that models different way of storing data in different types of containers.
4. Then the Framework provides at least one implementation for each interface.

***
Choose Right Collection Framework Interface Based on What functions you need to bring on your Application:
1. storing objects and iterating over them?
2. pushing your object to a queue and popping them?
3. retrieving them with the use of a key?
4. accessing them by their index?
5. sorting them?
6. preventing the presence of duplicates, or null values?

The Collections Framework can give you the right solution to all of these problems.

Section 2: Why Choose a Collection Over an Array?
1. A collection tracks the number of elements it contains
2. The capacity of a collection is not limited: you can add (almost) any amount of elements in a collection
3. A collection can control what elements you may store in it. For instance, you can prevent null elements to be added
4. A collection can be queried for the presence of a given element
5. A collection provides operations like intersecting or merging with another collection.

Section 3: Collection Hierarchy

                          Iterable
                             ^
                             |
                         Collection
                             ^
                             |
                  List  -->       <-- Set
                    |                  ^
                 ArrayList             |
                                   SortedSet
                                      ^
                                      |
                                    NavigableSet

Operation on Collections:
1. add or remove element
2. test presence of an element
3. check no of elements in Collection and iterate over them or (isEmpty or not)
4. clear all elements

Iterable Interface:
1. even though Iterable is an interface, it is not a collection. It is used to iterate over a collection.
Eg:-
    Collection<String> collection = ...;

    for (String element: collection) {
        // do someting with element
    }

Section 4: Extending Collections with List
1. The Difference between List of elements and set of elements.
    1.1 List Remembers what order elements were added and retrieved sequentially through Iterator.
    1.2 List has index So we can query an element by its index in List. But in Collection we don't have index.
    1.3 In Set we don't have guarantee about the order of elements. (Sometimes it is accessed Orderly, but it is not guaranteed)


Section 5: Extending Collections with Set
1. The Difference between Set of elements and Collection of elements.
   1.1 Set can't have duplicate elements.
   1.2 Collection can have duplicate elements.


Section 6: Storing Elements in Collections

 */