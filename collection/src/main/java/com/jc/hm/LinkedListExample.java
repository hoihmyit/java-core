package com.jc.hm;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("Initial size of linkedlist: " + linkedList.size());
        // Initial size of linkedlist: 0

        linkedList.add("Java");
        linkedList.add("JavaScript");
        linkedList.add("C#");
        linkedList.add("Python");

        System.out.println("Size of linkedlist after adding elements: " + linkedList.size());
        // Size of linkedlist after adding elements: 4
        System.out.println(linkedList);
        // [Java, JavaScript, C#, Python]

        linkedList.add(2, "C++");
        System.out.println("Size of linkedlist after adding C++ at index 2: " + linkedList.size());
        // Size of linkedlist after adding C++ at index 2: 5
        System.out.println(linkedList);
        // [Java, JavaScript, C++, C#, Python]

        linkedList.remove(2);
        System.out.println("Size of linkedlist after removing element at index 2: " + linkedList.size());
        // Size of linkedlist after removing element at index 2: 4
        System.out.println(linkedList);
        // [Java, JavaScript, C#, Python]
    }
}
