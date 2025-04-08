package org.example.java.collections;

import java.util.*;

// Map Interface is a part of collection framework used to store {Key, Value} pairs.
public class MapInterface {
    public static void main(String[] args) {
        //HashMap
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Apple");
        hashmap.put(2, "Banana");
        hashmap.put(3, "Cherry");
        hashmap.put(null, "NullKey"); // ✅ Allows null key
        hashmap.put(4, null); // ✅ Allows null value

        System.out.println(hashmap);
        // Output: {1=Apple, 2=Banana, 3=Cherry, null=NullKey, 4=null}

        //Immutable maps use this when map has < 10 entries.
        Map<Integer, String> map =
                Map.of(
                        1, "one",
                        2, "two",
                        3, "three"
                );

        //Immutable maps for > 10 entries
        Map.Entry<Integer, String> e1 = Map.entry(1, "one");
        Map.Entry<Integer, String> e2 = Map.entry(2, "two");
        Map.Entry<Integer, String> e3 = Map.entry(3, "three");

        Map<Integer, String> entryMap = Map.ofEntries(e1, e2, e3);

        //(or) we can overwrite this as
        Map<Integer, String> map3 =
                Map.ofEntries(
                        Map.entry(1, "one"),
                        Map.entry(2, "two"),
                        Map.entry(3, "three")
                );

//        map3.put(4, "four"); //Unsupported Operation
        System.out.println("Map Entry Of: " + map3);


        System.out.println(hashmap.get(2)); // Output: Banana
        System.out.println(hashmap.containsKey(3)); // Output: true
        hashmap.remove(1);
        System.out.println(hashmap); // Output: {2=Banana, 3=Cherry, null=NullKey, 4=null}

        //Iterating Over Map
        //Using forEach
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Using keySet() and values()
        for (Integer key : hashmap.keySet()) {
            System.out.println("Key: " + key);
        }

        for (String value : hashmap.values()) {
            System.out.println("Value: " + value);
        }

        //Using forEach() (Java 8+)
        hashmap.forEach((key, value) -> System.out.println(key + " -> " + value));


        //Getting a View on the Keys, the Values or the Entries of a Map

        Map<Integer, String> entryMap1 = new HashMap<>();

        entryMap1.put(1, "one");
        entryMap1.put(2, "two");
        entryMap1.put(3, "three");
        entryMap1.put(4, "four");
        entryMap1.put(5, "five");
        entryMap1.put(6, "six");

        Set<Integer> keys = entryMap1.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = entryMap1.values();
        System.out.println("values = " + values);

        Set<Map.Entry<Integer, String>> entries = entryMap1.entrySet();
        System.out.println("entries = " + entries);


        //LinkedHashMap
        //Order version of hashmap uses insertion order slightly slower-then HashMap.
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Cherry");

        System.out.println(linkedHashMap);
        // Output: {1=Apple, 2=Banana, 3=Cherry} (Insertion Order Maintained)

        linkedHashMap.remove(2);
        System.out.println(linkedHashMap);
        // Output: {1=Apple, 3=Cherry}

        //TreeMap
        //Sorted Map Implementation (Natural Order or Custom Comparator)
        //Does Not Allow null values
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        System.out.println(treeMap);
        // Output: {1=Apple, 2=Banana, 3=Cherry} (Sorted Order)

        System.out.println(((TreeMap<Integer, String>) treeMap).firstKey()); // Output: 1
        System.out.println(((TreeMap<Integer, String>) treeMap).lastKey()); // Output: 3
    }
}

/*
1. No Duplicate in Keys values can be null
2. HashMap and LinkedHashMap allows only one null Key,
3. Thread Safe use ConcurrentHashMap

Basic Methods in Map
Method	        Description
put(K, V)	    Adds a key-value pair
get(K)	        Retrieves value for the key
remove(K)	    Removes key-value pair
containsKey(K)	Checks if a key exists
containsValue(V)Checks if a value exists
size()	        Returns the number of elements
keySet()	    Returns all keys as Set<K>
values()	    Returns all values as Collection<V>
entrySet()	    Returns all key-value pairs as Set<Map.Entry<K, V>>
 */
