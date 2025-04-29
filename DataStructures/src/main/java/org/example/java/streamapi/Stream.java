package org.example.java.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");
        list.add("Ruby");
        list.add("JavaScript");

        //Map
        List<String> stream1 =
                list.stream() //stream() should be called on Collection
                        .map(String::toUpperCase) //Intermediate Operation returns Stream only
                        .collect(Collectors.toList()); //Terminal Operation returns (Aggregate Result) eg. count, sum or collection
        stream1.forEach(System.out::println);

        //Filter
        List<String> stream =
                list.stream()
                        .filter(s -> s.startsWith("C"))
                        .collect(Collectors.toList());
        stream.forEach(System.out::println);

        //Reduce
        int sum = list.stream()
                .mapToInt(String::length)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        //Sort
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        //Distinct
        List<String> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        distinctList.forEach(System.out::println);

        //Peek
        list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        //Limit
        list.stream()
                .limit(3)
                .collect(Collectors.toList());

        //Skip
        list.stream()
                .skip(3)
                .collect(Collectors.toList());

        //Min
        String min = list.stream()
                .min(String::compareTo)
                .get();
        System.out.println("Min: " + min);

        //Max
        String max = list.stream()
                .max(String::compareTo)
                .get();
        System.out.println("Max: " + max);

        //Count
        long count = list.stream()
                .count();
        System.out.println("Count: " + count);

        //AnyMatch
        boolean anyMatch = list.stream()
                .anyMatch(s -> s.startsWith("C"));
        System.out.println("AnyMatch: " + anyMatch);

        //AllMatch
        boolean allMatch = list.stream()
                .allMatch(s -> s.startsWith("C"));
        System.out.println("AllMatch: " + allMatch);

        //NoneMatch
        boolean noneMatch = list.stream()
                .noneMatch(s -> s.startsWith("C"));
        System.out.println("NoneMatch: " + noneMatch);

        //FindFirst
        String findFirst = list.stream()
                .findFirst()
                .get();
        System.out.println("FindFirst: " + findFirst);

        //FindAny
        String findAny = list.stream()
                .findAny()
                .get();
        System.out.println("FindAny: " + findAny);




    }
}

/*
Streams:
Stream API is used to process Collection of Objects sequentially. It avoids unnecessary memory consumption.
Streams can be used for:
filtering,
collecting,
printing,
converting, (one data structure to another)
mapping,
reducing..etc,

Syntax:
Stream s = Collection.stream(); // stream() should be called on Collection object

Key things about Streams:
1. Don’t store data (they operate on data sources)
2. Are lazy (evaluation happens only when needed)
3. Don’t modify the original data structure

Stream Pipeline:

StreamSource <- Create Stream Instance ->  Intermediate Operation -> Terminal Operation -> Result
(Array/
Collection)

Core Operations on Stream:
1. Intermediate Operations (Returns Stream itself) -> filter, map, flatMap, sorted, distinct, limit, skip, peek..etc
2. Terminal Operations (Returns Result instead of Stream) -> collect, forEach, match, count, reduce..etc
3. Short Circuiting Operations -> anyMatch, allMatch, noneMatch, findFirst, findAny...etc,
   (Note: Short Circuiting Operations are only applicable for Terminal Operations)

 */