package com.jc.hm.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap is a thread-safe implementation of the Map interface in Java,
 * which means multiple threads can access it simultaneously without any synchronization issues.
 * The default concurrency-level of ConcurrentHashMap is 16.
 * Inserting null objects is not possible in ConcurrentHashMap as a key or value.
 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(1, "one");
        concurrentHashMap.put(2, "two");
        concurrentHashMap.put(3, "three");

        System.out.println(concurrentHashMap.size()); //3
        System.out.println(concurrentHashMap.get(1)); //one

        concurrentHashMap.putIfAbsent(4, "four");
        concurrentHashMap.putIfAbsent(4, "four");
        concurrentHashMap.putIfAbsent(4, "four2");
        System.out.println(concurrentHashMap); //{1=one, 2=two, 3=three, 4=four}

        System.out.println(concurrentHashMap.keySet()); //[1, 2, 3, 4]
        System.out.println(concurrentHashMap.values()); //[one, two, three, four]
        System.out.println(concurrentHashMap.entrySet()); //[1=one, 2=two, 3=three, 4=four]
        System.out.println(concurrentHashMap.isEmpty()); //false

        concurrentHashMap.replace(4, "four", "four4");
        System.out.println(concurrentHashMap); //{1=one, 2=two, 3=three, 4=four4}

        concurrentHashMap.remove(1);
        System.out.println(concurrentHashMap); //{2=two, 3=three, 4=four4}

        concurrentHashMap.put(null, null); //NullPointerException
        concurrentHashMap.put(5, null); //NullPointerException
        concurrentHashMap.put(null, "five"); //NullPointerException
    }
}
