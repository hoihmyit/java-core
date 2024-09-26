package com.jc.hm.set;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Enum represents a group of constants (unchangeable variables, like final variables).
 * EnumSet a high-performance set implementation, much faster than HashSet.
 * It does not allow null Objects and throws NullPointerException when we attempt to insert a null object.
 * It uses a fail-safe iterator, so it does not throw ConcurrentModificationException if the collection is modified while iterating.
 * The EnumSet provides an efficient way to store enum values than other set implementations (like HashSet, TreeSet).
 * An enum set only stores enum values of a specific enum.
 */
public class EnumSetExample {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println(sizes); //[SMALL, MEDIUM, LARGE, EXTRA_LARGE]

        EnumSet<Size> small = EnumSet.of(Size.SMALL);
        System.out.println(small); //[SMALL]

        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
        System.out.println(sizes1); //[]

        EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRA_LARGE);
        System.out.println(sizes2); //[MEDIUM, LARGE, EXTRA_LARGE]

        EnumSet<Size> sizes3 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println(sizes3); //[SMALL, LARGE]


        Iterator<Size> iterator = sizes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //SMALL
            //MEDIUM
            //LARGE
            //EXTRA_LARGE
        }

        sizes.remove(Size.SMALL);
        System.out.println(sizes); //[MEDIUM, LARGE, EXTRA_LARGE]

        sizes.removeAll(sizes);
        System.out.println(sizes); //[]
    }
}
