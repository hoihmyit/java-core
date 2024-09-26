package com.jc.hm.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet class is used to create a collection that uses a hash table for storage.
 * It inherits the AbstractSet class and implements Set interface.
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non-synchronized.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("John");
        set.add("Jane");

        System.out.println(set); //[Jane, John]

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //Jane
            //John
        }

        set.remove("Jane");
        System.out.println(set); //[John]

        set.removeAll(set);
        System.out.println(set); //[]


        HashSet<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(2);
        num2.add(3);
        num2.add(4);

//        num1.addAll(num2);
//        System.out.println(num1); //[1, 2, 3, 4]

        // Get the same values from two sets
        num1.retainAll(num2);
        System.out.println(num1); //[2]


        num1.removeAll(num2);
        System.out.println(num1); //[]
    }
}
