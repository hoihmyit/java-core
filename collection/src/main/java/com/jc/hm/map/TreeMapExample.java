package com.jc.hm.map;

import java.util.TreeMap;

/**
 * Java TreeMap class is a red-black tree-based implementation.
 * It provides an efficient means of storing key-value pairs in sorted order.
 * TreeMap contains values based on the key and only unique elements.
 * It implements the NavigableMap interface and extends AbstractMap class.
 * It cannot have a null key but can have multiple null values and maintains ascending order.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");

        System.out.println(treeMap); //{1=one, 2=two, 3=three}

        treeMap.putIfAbsent(4, "four");
        treeMap.putIfAbsent(4, "five");
        System.out.println(treeMap); //{1=one, 2=two, 3=three, 4=four}

        System.out.println(treeMap.keySet()); //[1, 2, 3, 4]
        System.out.println(treeMap.values()); //[one, two, three, four]
        System.out.println(treeMap.entrySet()); //[1=one, 2=two, 3=three, 4=four]

    }
}
