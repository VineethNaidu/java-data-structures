package org.example.java.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
The LinkedList class in Java is a doubly linked list that implements List, Deque, and Queue interfaces,
allowing dynamic memory allocation, easy insertion, and deletion.
*/
public class LinkedListInterface {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add Elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        linkedList.add(1, "Mango");

        System.out.println(linkedList.get(2)); //Banana

        linkedList.addFirst("Grape");
        linkedList.addLast("Orange");
        System.out.println(linkedList); // Output: [Grape, Apple, Mango, Banana, Cherry, Orange]

        //LinkedList can support all the methods that were present in Collection and List Interface.
        //offer(E e), offerFirst(E e), offerLast(E e) – Adds elements (alternative to add())
        linkedList.offer("Peach");
        linkedList.offerFirst("Strawberry");
        linkedList.offerLast("Kiwi");
        System.out.println(linkedList); // Output: [Strawberry, Grape, Apple, Mango, Banana, Cherry, Orange, Peach, Kiwi]

        // peek(), peekFirst(), peekLast() – Retrieves elements without removing
        System.out.println(linkedList.peek());  // First element
        System.out.println(linkedList.peekFirst()); // First element
        System.out.println(linkedList.peekLast());  // Last element
        // Output: Strawberry, Strawberry, Kiwi

        // Alternate to remove
        // poll(), pollFirst(), pollLast() – Removes elements without exceptions
        System.out.println(linkedList.poll());   // Removes first element
        System.out.println(linkedList.pollLast()); // Removes last element
        System.out.println(linkedList);
        // Output: [Grape, Apple, Mango, Banana, Cherry, Orange, Peach]

        //Getting SubList
        List<String> list = linkedList.subList(0, 3);

        // Convertion
        // Convert LinkedList -> Array
        String[] fruits = linkedList.toArray(new String[0]);
        System.out.println("Converted LinkedList to an Array " + fruits);  // [Ljava.lang.String;@723279cf
        System.out.println("Converted LinkedList to an Array " + Arrays.stream(fruits).toList()); //[Grape, Apple, Mango, Banana, Cherry, Orange, Peach]

        //Convert LinkedList -> ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);

        //Convert ArrayList -> LinkedList
        LinkedList<String> linkedList1 = new LinkedList<>(arrayList);
        System.out.println(linkedList1);



        //




    }
}
