package com.jc.hm;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        System.out.println("Initial size of vector: " + vector.size());

        vector.add("Java");
        vector.add("JavaScript");
        vector.add("C#");

        System.out.println(vector); // [Java, JavaScript, C#]
        System.out.println("Size of vector after adding elements: " + vector.size()); // 3

        vector.add(2, "C++");
        System.out.println(vector); // [Java, JavaScript, C++, C#]
        System.out.println("Size of vector after adding C++ at index 2: " + vector.size()); // 4

        vector.remove(2);
        System.out.println(vector); // [Java, JavaScript, C#]
        System.out.println("Size of vector after removing element at index 2: " + vector.size()); // 3
    }
}
