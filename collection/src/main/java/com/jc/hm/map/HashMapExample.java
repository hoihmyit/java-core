package com.jc.hm.map;

import java.util.HashMap;
import java.util.Map;

/**
 * It stores the data in the form of key-value pairs.
 * To access a value one must know its key.
 * A shorter value helps in indexing and faster searches.
 * This class uses a technique called hashing.
 * Hashing is a technique of converting a large String to a small String that represents the same String.
 * HashMap operations are not synchronized, while Hashtable provides synchronization.
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "John");
        map.put("age", "30");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            //name = John
            //age = 30
        }

        String value = map.get("gender");
        System.out.println(value); //null

        System.out.println(map.keySet()); //[name, age]
        System.out.println(map.values()); //[John, 30]
        System.out.println(map.entrySet()); //[name=John, age=30]
        System.out.println(map.remove("age")); //30

        map.clear();
        System.out.println(map); //{}
    }
}
