package org.example.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysvsArrayList {
    public static void main(String[] args) {
        int[] oneD = {1, 2, 3, 4, 5};
//        int[] oneD1 = new int[] {1, 2, 3, 4, 5};
        int[][] twoD = {{1, 2}, {3, 4}};

        //Print 1D array
        System.out.println(Arrays.toString(oneD));

        //print 2D array
        System.out.println(Arrays.deepToString(twoD));

        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
        System.out.println();
        for(int i : oneD) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.stream(oneD).forEach(System.out::println);
        // Output: 1 2 3 4 5

        // for String Arrays
        String[] strArr = {"Java", "Python", "C++"};
        System.out.println(String.join(", ", strArr));
        // Output: Java, Python, C++

        //Convert Array -> ArrayList
        String[] strings = {"One", "Two", "Three"};
        List<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        List<String> arrayList1 = Arrays.asList(strings);
        List<String> arrayList3 = Arrays.stream(strings)
                .collect(Collectors.toList());

        //Convert ArrayList -> Array
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        String[] list1 = list.toArray(new String[0]);
        System.out.println("Conversion");
        System.out.println(Arrays.toString(list1));

        String[] str = list.toArray(new String[0]);
        System.out.println(Arrays.toString(str));

        String[] str1 = list.stream().toArray(String[]::new);

    }
}
