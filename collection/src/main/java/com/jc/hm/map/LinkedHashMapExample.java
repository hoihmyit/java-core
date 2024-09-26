package com.jc.hm.map;

import java.util.LinkedHashMap;

/**
 * HashMap provided the advantage of quick insertion, search, and deletion.
 * but it never maintained the track and order of insertion which the LinkedHashMap provides
 * where the elements can be accessed in their insertion order.
 * Java LinkedHashMap class:
 * - contains values based on the key.
 * - contains unique elements.
 * - may have one null key and multiple null values.
 * - maintains insertion order.
 * The initial default capacity of the HashMap class is 16 with a load factor of 0.75.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Doe");

        System.out.println(map); //{1=John, 2=Jane, 3=Doe}

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            //1 = John
            //2 = Jane
            //3 = Doe
        }

        map.putIfAbsent(4, "Smith");
        map.putIfAbsent(5, "Hello");
        System.out.println(map); //{1=John, 2=Jane, 3=Doe, 4=Smith, 5=Hello}
    }
}
