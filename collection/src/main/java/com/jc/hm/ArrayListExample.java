package com.jc.hm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        System.out.println("Arraylist: " + list); // Arraylist: [A, B]
        System.out.println("Size of arraylist: " + list.size()); // Size of arraylist: 2

        list.add("C");
        System.out.println("Arraylist after adding C: " + list); // Arraylist after adding C: [A, B, C]

        list.remove(2);
        System.out.println("Arraylist after removing C: " + list); // Arraylist after removing C: [A, B]

        for (String s : list) {
            System.out.println(s);
            //A
            //B
        }
    }
}
