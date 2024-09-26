package com.jc.hm.map;

import java.util.EnumMap;

/**
 * Java EnumMap class is the specialized Map implementation for Enum keys.
 * It inherits Enum and AbstractMap classes.
 * It's s high-performance map implementation, much faster than HashMap.
 * All keys of the EnumMap instance must be keys of a single enum type.
 * EnumMap does not allow null keys and throws NullPointerException when we attempt to insert a null key.
 * EnumMap is internally represented as an array.
 * This representation is extremely compact and efficient.
 */
public class EnumMapExample {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    public static void main(String[] args) {
        EnumMap<Size, Integer> map = new EnumMap<>(Size.class);

        map.put(Size.SMALL, 28);
        map.put(Size.MEDIUM, 32);
        map.put(Size.LARGE, 36);
        map.put(Size.EXTRA_LARGE, 40);

        System.out.println(map); //{SMALL=28, MEDIUM=32, LARGE=36, EXTRA_LARGE=40}
        System.out.println(map.keySet()); //[SMALL, MEDIUM, LARGE, EXTRA_LARGE]
        System.out.println(map.values()); //[28, 32, 36, 40]
        System.out.println(map.entrySet()); //[SMALL=28, MEDIUM=32, LARGE=36, EXTRA_LARGE=40]
        System.out.println(map.size()); //4
        System.out.println(Size.MEDIUM); //32
    }
}
