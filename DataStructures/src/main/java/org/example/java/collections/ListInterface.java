package org.example.java.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //add() elements
        list.add("Java");
        list.add("Python");  // [Java, Python]

        //insert at specific position
        //list.add(index, element)
        list.add(1, "C#");
        System.out.println("List" + list); // [Java, C#, Python]

        // Arrays.asList()
        // Fixed Size, can't add or remove elements. we can Set elements in List
        List<String> languages = Arrays.asList("C", "C++");
        languages.set(1, "Ruby");
        System.out.println(languages); // [C, Ruby]
//      languages.add("Ruby"); // throws Unsupported Operation Exception
//      languages.remove("C"); // throws Unsupported Operation Exception

        //use new ArrayList<>(Arrays.asList()); for resizable List
        List<String> languages1 = new ArrayList<>(Arrays.asList("Java", "Python"));

        languages1.add("C#");
        languages1.add("Ruby");
        languages1.remove(1);
        languages1.remove("Java");

        System.out.println(languages1); // [C#, Ruby]

        // Immutable List
        // List.of();
        List<String> database = List.of("SQL", "MySQL");
        System.out.println(database); // [SQL, MySQL]
//      database.set(1, "NoSQL"); // throws Unsupported Operation Exception
//      database.add("NoSQL"); // throws Unsupported Operation Exception
//      database.remove("SQL"); // throws Unsupported Operation Exception

        // use new ArrayList<>(List.of()); for resizable List
        List<String> database1 = new ArrayList<>(List.of("SQL", "MySQL"));
        database1.add("NoSQL");
        database1.remove("SQL");
        System.out.println(database1); // [MySQL, NoSQL]

        // Note: Arrays.asList() are mutable But List.of() are immutable without new ArrayList<>();


        //forEach()
        languages.forEach(languages1::add);
        languages.forEach(System.out::println); // [C, Ruby]

        //Collections.addAll();
        List<String> collection = new ArrayList<>();
        Collections.addAll(collection, "Java", "Python");
        System.out.println("Collection List " + collection); // [Java, Python]

        //list1.addAll(list2);
        List<String> collection1 = new ArrayList<>();
        collection1.addAll(collection);
        System.out.println("Collection2 List " + collection1); // [Java, Python]

        //Stream API in Collections
        // Collectors.toList();
        List<Integer> list2 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list2); // [1, 2, 3, 4, 5]


        //Operations in List
        //add()
        List<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Python");
        list3.add("Ruby");
        list3.add("C#");
        list3.add("C++");
        System.out.println("list3 Add elements " + list3); // [Java, Python, Ruby, C#, C++]

        //Update elements in List
        list3.set(1, "C");
        System.out.println("Set: " + list3); // [Java, C, Ruby, C#, C++]

        //Access elements in List
        System.out.println("Get Index: " + list3.get(1)); // C
        System.out.println("Get First: " + list3.getFirst()); // Java
        System.out.println("Get Last: " + list3.getLast()); // C++
        System.out.println("Get IndexOf: " + list3.indexOf("C#")); // 3
        System.out.println("Get Last IndexOf Element: " + list3.lastIndexOf("Java")); // 0


        System.out.print("Get with for each: ");
        for(String ele : list3) {
            System.out.print(ele + " ");
        }
        System.out.println();

        //Iterators
        Iterator<String> iterator = list3.iterator();
        System.out.print("Get with Iterator: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = list3.listIterator();
        System.out.print("Get with Forward List Iterator: ");
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Get with Backward List Iterator: ");
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        //Using Streams
        System.out.print("Get with Stream API: ");
        list3.stream().forEach(ele -> System.out.print(ele + " "));
        System.out.println();

        //Search elements in List
        System.out.println("Contains: " + list3.contains("Java")); // true

        //Sort elements in List
        Collections.sort(list3);
        System.out.println("Sorted List: " + list3); // [C, C#, C++, Java, Ruby]

        //Reverse elements in List
        Collections.reverse(list3);
        System.out.println("Reversed List: " + list3); // [Ruby, Java, C++, C#, C]

        //Shuffle elements in List
        Collections.shuffle(list3);
        System.out.println("Shuffled List: " + list3); // [Java, C#, Ruby, C++, C]

        //Copy elements in List
        List<String> list4 = new ArrayList<>();
        list4.add("Telugu");
        list4.add("English");
        Collections.copy(list3, list4);
        System.out.println("Copied List: " + list3); // [Telugu, English, Ruby, C++, C]

        //Swap elements in List
        Collections.swap(list3, 0, 1);
        System.out.println("Swapped elements in list: " + list3); // [English, Telugu, Ruby, C++, C]

        //Remove elements in List
        list3.remove(1);
        list3.remove("C++");
        list3.removeFirst();
        list3.removeLast();
        list3.removeAll(list4);
        System.out.println("Removed List: " + list3); // [Ruby]

        //Check Empty
        System.out.println("Check Empty List: " + list3.isEmpty());

        //Size
        System.out.println("List Size: " + list3.size());
    }
}

/*
List: Interface
1. It is used to store ordered collection of elements and access them by index
2. Allows the duplicate elements
3. Implementation classes of List Interface are (ArrayList, LinkedList, Vector, Stack)
4. It can allow Null values.
5. List has listIterator() method to iterate over the elements forward and backward directions.
*/
