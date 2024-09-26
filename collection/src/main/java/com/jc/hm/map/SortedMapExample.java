package com.jc.hm.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * null key or value is not allowed.
 * The keys are sorted either by natural ordering or by a specified comparator.
 */
public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();

        map.put("name", "John");
        map.put("age", "30");
        map.put("gender", "Male");

        System.out.println(map); //{age=30, gender=Male, name=John}
        System.out.println(map.firstKey()); //age
        System.out.println(map.lastKey()); //name
    }
}
